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
	 * DashInsert �Լ��� ���ڷ� ������ ���ڿ��� �Է¹��� ��, 
	 * ���ڿ� ������ Ȧ���� ���ӵǸ� �� �� ���̿� - �� �߰��ϰ�, 
	 * ¦���� ���ӵǸ� * �� �߰��ϴ� ����� ���� �ִ�. 
	 * (��, 454 => 454, 4546793 => 454*67-9-3) DashInsert �Լ��� �ϼ�����.
	 * 
	 * �Է� - ȭ�鿡�� ���ڷ� �� ���ڿ��� �Է¹޴´�.
	 * "4546793"
	 * ��� - *, -�� ������ �߰��� ���ڿ��� ȭ�鿡 ����Ѵ�.
	 * "454*67-9-3"
	 * 
	 */
	
	public static void main(String[] args) {
		String input = Scan();
		System.out.println(" ��� : " + DashInsert(input));
	}
	
	static String Scan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ������ �Է����ּ���!");
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
