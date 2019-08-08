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
	 * 자기 자신을 제외한 모든 양의 약수들의 합이 자기 자신이 되는 자연수를 완전수라고 한다. 
	 * 예를 들면, 6과 28은 완전수이다. 
	 * 6=1+2+3 // 1,2,3은 각각 6의 약수 
	 * 28=1+2+4+7+14 // 1,2,4,7,14는 각각 28의 약수
	 * 
	 * 입력으로 자연수 N을 받고, 
	 * 출력으로 N 이하의 모든 완전수를 출력하는 코드를 작성하라.	
	 */
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int inputNumber = 0;
			boolean inputCorrectFlag = true;
			while(inputCorrectFlag) {
				System.out.println("양의 정수 입력 : ");
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
		int sum = 0;		// sum : 약수들의 합 변수
		for(i=1; i<number-1; i++) {
			if(number%i == 0) sum += i;
		}
		
		if(sum == number) System.out.print(sum + " ");
		
	}
	
}
