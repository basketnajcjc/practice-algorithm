package codingDojang;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Park Jae Cheul
 *
 */
public class GoldbachConjecture {
	/*
	2019. 08. 27
	�������� ����(Goldbach's conjecture)�� ���������� �˷��� �������� ���ذ� ������, 
	2���� ū ��� ¦���� �� ���� �Ҽ�(Prime number)�� ������ ǥ���� �� �ִٴ� ���̴�. �̶� �ϳ��� �Ҽ��� �� �� ����ϴ� ���� ����Ѵ�.
	2���� ū ¦�� n�� �Է� ������, n=p1+p2 �� �����ϴ� �Ҽ� p1,p2�� �� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է¿�1: n=26	
	��¿�1: [[3, 23], [7, 19], [13, 13]]
	
	�Է¿�2: n=48
	��¿�2 [[5, 43], [7, 41], [11, 37], [17, 31], [19, 29]]
	*/
	
	public static void main(String[] args) {
		printPair(26);
		System.out.println();
		printPair(48);
	}
	
	static void printPair(int a) {
		
		List<Integer> decimalList = getDecimal(2, a);
		List<String> resultList = new ArrayList<String>();
		for(int one : decimalList) {
			for(int two : decimalList) {
				if(one <= two ) {
					
					if(a == (one+two)) {
						resultList.add("[" + one + ", " + two + "]");
					}
				}
			}
		}
		
		for(int i=0; i<resultList.size(); i++) {
			
			if(i == resultList.size() -1) {
				System.out.printf(resultList.get(i));
			} else {
				System.out.printf(resultList.get(i) + ", ");
			}
			
		}
		
	}
	
	static List<Integer> getDecimal(int n, int m) {
		List<Integer> decimalList = new ArrayList<Integer>(); 
		boolean isDecimal = true;
		
		for(int i=n; i<m+1; i++) {
			isDecimal = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					isDecimal = false; 
					break;
				}
			}
			
			if(isDecimal) decimalList.add(i);			
		}
		
		return decimalList;
	}
	
}
