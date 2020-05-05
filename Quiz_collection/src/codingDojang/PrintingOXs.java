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
	 * input은 int n을 입력 받아 첫번째 row는 (n-1)의 O와 X, 두번째 row는 (n-2)의 O와 XX, 세번째 row는 (n-3)의 0와 XXX... n번째 row는 n의 X을 출력하시오.
	 * 입력 예시: 6
	 * 출력 예시:
	 * OOOOOX
	 * OOOOXX
	 * OOOXXX
	 * OOXXXX
	 * OXXXXX
	 * XXXXXX
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = scanner.nextInt();
		
		int i, j;
		for(i=0; i<input; i++) {		// Line
			for(j=0; j<input-i-1; j++) {		// O 의 개수 = (전체 Length) - (Line 의 개수)
				System.out.print("O");
			}
			
			for(j=0; j<i+1; j++) {		// X 의 개수 = Line 의 개수
				System.out.print("X");
			}
			System.out.println();
		}

	}

}
