package codingDojang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Park Jae Cheul
 *
 */
public class PerfectNumber {
	/*
	 * 2019. 08. 06 
	 * @author Park Jae Cheul
	 * 
	 * �ڱ� �ڽ��� ������ ��� ���� ������� ���� �ڱ� �ڽ��� �Ǵ� �ڿ����� ��������� �Ѵ�. 
	 * ���� ���, 6�� 28�� �������̴�. 
	 * 6=1+2+3 // 1,2,3�� ���� 6�� ��� 
	 * 28=1+2+4+7+14 // 1,2,4,7,14�� ���� 28�� ���
	 * 
	 * �Է����� �ڿ��� N�� �ް�, 
	 * ������� N ������ ��� �������� ����ϴ� �ڵ带 �ۼ��϶�.	
	 */
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int inputNumber = 0;
			boolean inputCorrectFlag = true;
			while(inputCorrectFlag) {
				System.out.println("���� ���� �Է� : ");
				inputNumber = scanner.nextInt();
				if(inputNumber > 1) inputCorrectFlag = false;
			}
			
			int i;
			for(i=1; i<inputNumber; i++) {
				showPerfectNumber(i);
			}
			
	}
	
	static void showPerfectNumber(int number) {
		int i = 0;
		int sum = 0;		// sum : ������� �� ����
		for(i=1; i<number-1; i++) {
			if(number%i == 0) sum += i;
		}
		
		if(sum == number) System.out.print(sum + " ");
		
	}
	
}
