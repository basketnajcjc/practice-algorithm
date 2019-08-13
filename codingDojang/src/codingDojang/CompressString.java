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
	 * ���ڿ��� �Է¹޾Ƽ�, ���� ���ڰ� ���������� �ݺ��Ǵ� ��쿡 �� �ݺ� Ƚ���� ǥ���Ͽ� ���ڿ��� �����ϱ�.
	 * �Է� ����: aaabbcccccca
	 * ��� ����: a3b2c6a1 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڿ� �Է� : ");
		String input = scanner.nextLine();
		
		// input ���� only String ���� Exception üũ
		
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
		
		// �� ������ ���� ���ڸ� �������� �� ���ڿ� �ٸ� �� �� ���� ������ �����ϹǷ�,
		// �߰��� ������ �� ���ڿ� ������ ���ڰ� �ٸ� ��� ��.
		if(input.charAt(input.length()-2) != input.charAt(input.length()-1)) {
			result = result + input.charAt(input.length()-1) + "1";
		}
		
		System.out.println(" ��� : " + result);
		
		
	}
	
}
