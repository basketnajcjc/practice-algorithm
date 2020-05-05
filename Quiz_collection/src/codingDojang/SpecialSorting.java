package codingDojang;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialSorting {

	/*
	 * * 2019. 08. 01 
	 * @author Park Jae Cheul
	 * 
	 * n개의 정수를 가진 배열이 있다. 
	 * 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 
	 * 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
	 * Q) 정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 
	 * 또한 양의정수와 음의정수의 순서에는 변함이 없어야 한다.
	 * 예. -1 1 3 -2 2 ans: -1 -2 1 3 2.
	 */
	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(-1, -35, 99, -42, -41, 61, 1, -22, 37, 52, 0);
		
		System.out.println("# Q) " + list);
		
		boolean zeroExist = ( list.indexOf(0) > -1 ); 
		
		List<Integer> minusList = new ArrayList<>();
		List<Integer> plusList = new ArrayList<>();
		
		int i = 0;
		for(i=0; i<list.size(); i++) {
			int number = list.get(i);
		
			if(number > 0) {
				plusList.add(number);
			} else if( number < 0) {
				minusList.add(number);
			}
		}
		// 결과 리스트 객체 생성
		List resultList = new ArrayList();
		
		// 음수 추가
		minusList.sort(null);
		
		for(i=minusList.size()-1; i>-1; i--) {
			int number = minusList.get(i);
			resultList.add(number);
		}
		
		// 0 추가
		if(zeroExist) resultList.add(0);
		
		// 양수 추가
		plusList.sort(null);
		for(i=0; i<plusList.size(); i++) {
			int number = plusList.get(i);
			resultList.add(number);
		}
		
		System.out.println("# Sol) " + resultList);
		
	}
}
