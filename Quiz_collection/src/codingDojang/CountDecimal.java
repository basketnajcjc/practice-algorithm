package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class CountDecimal {
	/*
	 * 2019. 08. 12 
	 * 2이상 1000이하 자연수의 집합에서 소수의 개수를 구하는 알고리즘을 작성하시오.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int result = CountDecimal(2, 1000);
		System.out.println("2 이상 1000 이하 자연수 중 소수의 개수 : "+ result);
	}
	
	static int CountDecimal(int n, int m) {
		int count = 0;
		boolean isDecimal = true;
		
		for(int i=n; i<m+1; i++) {
			isDecimal = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					isDecimal = false; 
					break;
				}
			}
			
			if(isDecimal) count++;			
		}
		
		return count;
	}

}
