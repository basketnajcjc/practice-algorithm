package codingDojang;

import java.util.Scanner;

/**
 * @author Park Jae Cheul
 *
 */
public class DashInsert {
	/*
	 * 2019. 08. 06 
	 * @author Park Jae Cheul
	 * 
	 * DashInsert 함수는 숫자로 구성된 문자열을 입력받은 뒤, 
	 * 문자열 내에서 홀수가 연속되면 두 수 사이에 - 를 추가하고, 
	 * 짝수가 연속되면 * 를 추가하는 기능을 갖고 있다. 
	 * (예, 454 => 454, 4546793 => 454*67-9-3) DashInsert 함수를 완성하자.
	 * 
	 * 입력 - 화면에서 숫자로 된 문자열을 입력받는다.
	 * "4546793"
	 * 출력 - *, -가 적절히 추가된 문자열을 화면에 출력한다.
	 * "454*67-9-3"
	 * 
	 */
	
	public static void main(String[] args) {
		String input = Scan();
		System.out.println(" 결과 : " + DashInsert(input));
	}
	
	static String Scan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정수를 입력해주세요!");
		System.out.println(" > ");
		int inputNumber = scanner.nextInt();
		
		return Integer.toString(inputNumber);
	}
	
	static String DashInsert(String input) {
		String result = input.substring(0, 1);;
		
		int i;
		for(i=1; i<input.length(); i++) {
			int compareIntOne = input.charAt(i-1) -'0';
			int compareIntTwo = input.charAt(i) -'0';
			
			if( ( (compareIntOne+compareIntTwo)%2 == 0) && (compareIntOne %2 == 1) ) {
				result = result + "-";
			} else if( ( (compareIntOne+compareIntTwo)%2 == 0) && (compareIntOne %2 == 0) ) {	
				result = result + "*";
			}
			
			result = result + input.substring(i, i+1); 
		}
		
		return result;
	}
	
	
	
}
