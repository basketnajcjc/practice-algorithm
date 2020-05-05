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
	골드바흐의 추측(Goldbach's conjecture)은 오래전부터 알려진 정수론의 미해결 문제로, 
	2보다 큰 모든 짝수는 두 개의 소수(Prime number)의 합으로 표시할 수 있다는 것이다. 이때 하나의 소수를 두 번 사용하는 것은 허용한다.
	2보다 큰 짝수 n을 입력 받으면, n=p1+p2 를 만족하는 소수 p1,p2의 페어를 모두 출력하는 프로그램을 작성하시오.
	
	입력예1: n=26	
	출력예1: [[3, 23], [7, 19], [13, 13]]
	
	입력예2: n=48
	출력예2 [[5, 43], [7, 41], [11, 37], [17, 31], [19, 29]]
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
