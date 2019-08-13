package codingDojang;

import java.util.Scanner;

/**
 * @author Park Jae Cheul
 *
 */
public class PrintingOXs {
	/*
	 * 2019. 08. 05 
	 * @author Park Jae Cheul
	 * 
	 * input�� int n�� �Է� �޾� ù��° row�� (n-1)�� O�� X, �ι�° row�� (n-2)�� O�� XX, ����° row�� (n-3)�� 0�� XXX... n��° row�� n�� X�� ����Ͻÿ�.
	 * �Է� ����: 6
	 * ��� ����:
	 * OOOOOX
	 * OOOOXX
	 * OOOXXX
	 * OOXXXX
	 * OXXXXX
	 * XXXXXX
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int input = scanner.nextInt();
		
		int i, j;
		for(i=0; i<input; i++) {		// Line
			for(j=0; j<input-i-1; j++) {		// O �� ���� = (��ü Length) - (Line �� ����)
				System.out.print("O");
			}
			
			for(j=0; j<i+1; j++) {		// X �� ���� = Line �� ����
				System.out.print("X");
			}
			System.out.println();
		}

	}

}
