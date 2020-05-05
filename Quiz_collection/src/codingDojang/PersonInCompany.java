package codingDojang;

import java.text.SimpleDateFormat;

/**
 * @author Park Jae Cheul
 *
 */
public class PersonInCompany {
	/* 
	2019. 08. 14
	A사무실에는 특정일자의 출퇴근 시간이 기록된 거대한 로그파일이 있다고 한다.

	파일의 형식은 다음과 같다. (한 라인에서 앞부분은 출근시간(HH:MM:SS), 뒷부분은 퇴근시간이다)

	09:12:23 11:14:35
	10:34:01 13:23:40
	10:34:31 11:20:10
	특정시간을 입력(예:11:05:20)으로 주었을 때 그 시간에 총 몇 명이 사무실에 있었는지 알려주는 함수를 작성하시오.
	 */
	
	public static void main(String[] args) {
		String[] timeArray = { "11:05:20", "09:12:24", "09:10:00", "11:19:19", "13:19:40" };
		for(int i=0; i<timeArray.length; i++) {
			String time = timeArray[i];
			System.out.println("[" + time + "] 이 시간에 사무실에 있었던 사람의 수 : " + countInOffice(time));			
		}
		
	}
	
	static int countInOffice(String time) {
		int count = 0;
		
		String[][] timeLogFile = { {"09:12:23", "11:14:35"}, {"10:34:01", "13:23:40"}, {"10:34:31", "11:20:10"} };
		for(int i=0; i<timeLogFile.length; i++) {
			SimpleDateFormat fromTime = new SimpleDateFormat(timeLogFile[i][0]);
			SimpleDateFormat toTime = new SimpleDateFormat(timeLogFile[i][1]);
			
			if(stringToInteger(timeLogFile[i][0]) < stringToInteger(time) 
					&& stringToInteger(time) < stringToInteger(timeLogFile[i][1]) ) {
				count++;
			}
		}
		
		return count;
	}
	
	static int stringToInteger(String a) {
		// HH:MM:SS 형식을 HHMMSS 숫자로 변환하여 리턴
		String[] array = a.split(":");
		String resultString = "";
		for(int i=0; i<array.length; i++) {
			resultString += array[i];
		}
		
		return Integer.parseInt(resultString);
	}
	
	
}
