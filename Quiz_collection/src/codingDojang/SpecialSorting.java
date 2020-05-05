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
	 * n���� ������ ���� �迭�� �ִ�. 
	 * �� �迭�� ���������� ���� ������ ��� ������ �ִ�. 
	 * ���� ����� �� �迭�� �� Ư���� ������� �����ؾ� �Ѵ�.
	 * Q) ������ �ǰ� �� ��, ���� ������ ���ʿ� ���������� ���ʿ� �־�� �Ѵ�. 
	 * ���� ���������� ���������� �������� ������ ����� �Ѵ�.
	 * ��. -1 1 3 -2 2 ans: -1 -2 1 3 2.
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
		// ��� ����Ʈ ��ü ����
		List resultList = new ArrayList();
		
		// ���� �߰�
		minusList.sort(null);
		
		for(i=minusList.size()-1; i>-1; i--) {
			int number = minusList.get(i);
			resultList.add(number);
		}
		
		// 0 �߰�
		if(zeroExist) resultList.add(0);
		
		// ��� �߰�
		plusList.sort(null);
		for(i=0; i<plusList.size(); i++) {
			int number = plusList.get(i);
			resultList.add(number);
		}
		
		System.out.println("# Sol) " + resultList);
		
	}
}
