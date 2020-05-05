package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class CountBackZero {
	/*
	 * 2019. 08. 13 
	 * ���� 0�� ���� ���ϱ�
	 * N!�� ���Ǵ� ������ �����ϴ�.
	 * N! = 1 * 2 * 3 * 4 ... N
	 * �̶� N!�� ������ ��ȯ �� �ڿ��� ���� ���ӵǴ� 0�� ������ ���ϼ���.
	 * 
	 * ��) 	
	 * f(12) -> 2 # 12!�� 479001600 
	 * f(25) -> 6 # 25!�� 15511210043330985984000000
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("12�� �Է��Ͽ��� �� �ڿ��� ���� ���ӵǴ� 0�� ���� : " + countBackZero(12));
		System.out.println("25�� �Է��Ͽ��� �� �ڿ��� ���� ���ӵǴ� 0�� ���� : " + countBackZero(25));
	}
	
	static int countBackZero(int number) {
		int answer = 0;
		
		// N! ��
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
