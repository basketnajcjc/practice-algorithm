package codingDojang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author DTOL
 *
 */
public class NameSoring {
	
	/*
	 * 2019. 08. 01 
	 * by Park Jae Cheul
	 * 
	 * 주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
	 * 이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
	 * 1. 김씨와 이씨는 각각 몇 명 인가요?
	 * 2. "이재영"이란 이름이 몇 번 반복되나요?
	 * 3. 중복을 제거한 이름을 출력하세요.
	 * 4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.	
	 */
	
	public static void main(String[] args) {
		
		String[] nameList = {"이유덕", "이재영", "권종표", "이재영", "박민호", "강상희", "이재영", "김지완", "최승혁", "이성연", "박영서", "박민호", "전경헌", "송정환", "김재성", "이유덕", "전경헌"};
	
		int i=0;
		int countKim = 0;
		int countLee = 0;
		int countLJY = 0;
		List resultList = new ArrayList<String>();
		
		for(i=0; i<nameList.length; i++) {
			// 1. 김씨와 이씨는 각각 몇 명 인가요?
			
			if(nameList[i] == "이재영") countLJY++;
			if(nameList[i].indexOf("이") == 0) countLee++;
			if(nameList[i].indexOf("김") == 0) countKim++;
			
			if(!resultList.contains(nameList[i])) resultList.add(nameList[i]);
			
		}
		
		System.out.println(" # 1. 김씨와 이씨는 각각 몇 명 인가요? 김씨 : " + countKim + "명, 이씨 : " + countLee + "명");
		System.out.println(" # 2. '이재영'이란 이름이 몇 번 반복되나요? " + countLJY);
		System.out.println(" # 3. 중복을 제거한 이름을 출력하세요. " + resultList);
		resultList.sort(null); 
		System.out.println(" # 4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요. " + resultList);
		
	}

}
