package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class CountBackZero {
	/*
	 * 2019. 08. 13 
	 * 뒤쪽 0의 갯수 구하기
	 * N!의 정의는 다음과 같습니다.
	 * N! = 1 * 2 * 3 * 4 ... N
	 * 이때 N!를 정수로 변환 해 뒤에서 부터 연속되는 0의 갯수를 구하세요.
	 * 
	 * 예) 	
	 * f(12) -> 2 # 12!은 479001600 
	 * f(25) -> 6 # 25!은 15511210043330985984000000
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("12를 입력하였을 때 뒤에서 부터 연속되는 0의 개수 : " + countBackZero(12));
		System.out.println("25를 입력하였을 때 뒤에서 부터 연속되는 0의 개수 : " + countBackZero(25));
	}
	
	static int countBackZero(int number) {
		int answer = 0;
		
		// N! 값
		long sum = 1;
		for(int i=2; i<=number; i++) {
			sum*=i;
		}
		
		String sumString = Long.toString(sum);
		for(int i=sumString.length(); i>0; i--) {
			if(sumString.charAt(i-1) == '0') {
				answer++;
			} else {
				break;
			}
		}
		
		return answer;
	}

}
