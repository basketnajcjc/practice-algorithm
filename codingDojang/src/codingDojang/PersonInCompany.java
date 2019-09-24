package codingDojang;

import java.text.SimpleDateFormat;

/**
 * @author Park Jae Cheul
 *
 */
public class PersonInCompany {
	/* 
	2019. 08. 14
	A�繫�ǿ��� Ư�������� ����� �ð��� ��ϵ� �Ŵ��� �α������� �ִٰ� �Ѵ�.

	������ ������ ������ ����. (�� ���ο��� �պκ��� ��ٽð�(HH:MM:SS), �޺κ��� ��ٽð��̴�)

	09:12:23 11:14:35
	10:34:01 13:23:40
	10:34:31 11:20:10
	Ư���ð��� �Է�(��:11:05:20)���� �־��� �� �� �ð��� �� �� ���� �繫�ǿ� �־����� �˷��ִ� �Լ��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) {
		String[] timeArray = { "11:05:20", "09:12:24", "09:10:00", "11:19:19", "13:19:40" };
		for(int i=0; i<timeArray.length; i++) {
			String time = timeArray[i];
			System.out.println("[" + time + "] �� �ð��� �繫�ǿ� �־��� ����� �� : " + countInOffice(time));			
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
		// HH:MM:SS ������ HHMMSS ���ڷ� ��ȯ�Ͽ� ����
		String[] array = a.split(":");
		String resultString = "";
		for(int i=0; i<array.length; i++) {
			resultString += array[i];
		}
		
		return Integer.parseInt(resultString);
	}
	
	
}
