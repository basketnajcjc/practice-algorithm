package codingDojang;

import java.util.Scanner;

/**
 * @author Park Jae Cheul
 *
 */
public class CompressString {
	/*
	 * 2019. 08. 09 
	 * @author Park Jae Cheul
	 * 
	 * 문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
	 * 입력 예시: aaabbcccccca
	 * 출력 예시: a3b2c6a1 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String input = scanner.nextLine();
		
		// input 값이 only String 인지 Exception 체크
		
		String result = "";
		int count = 0;
		for(int i=1; i<input.length(); i++) {
			if(input.charAt(i-1) == input.charAt(i) ) {
				count++;
				continue;
			} else {
				result = result + input.charAt(i-1) + Integer.toString(count+1);
			}
			count = 0;
		}
		
		// 위 로직은 앞의 문자를 기준으로 뒷 문자와 다를 시 앞 문자 갯수를 생성하므로,
		// 추가로 마지막 전 문자와 마지막 문자가 다를 경우 비교.
		if(input.charAt(input.length()-2) != input.charAt(input.length()-1)) {
			result = result + input.charAt(input.length()-1) + "1";
		}
		
		System.out.println(" 결과 : " + result);
		
		
	}
	
}
