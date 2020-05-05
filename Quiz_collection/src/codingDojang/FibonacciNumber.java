package codingDojang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Park Jae Cheul
 *
 */
public class FibonacciNumber {
	
	/*
	 * 2019. 08. 02 
	 * @author Park Jae Cheul
	 * 
	 * 피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
	 * 예) 0, 1, 1, 2, 3, 5, 8, 13
	 * 인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요
	 * 
	 */
	
	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
        System.out.print("정수를 입력하시오 : ");
        int total = input.nextInt();
        
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        
        int i;
        for(i=2; i<total; i++) {
        	int number = list.get(i-2) + list.get(i-1);
        	if(number<=total) {
        		list.add(number);
        	} else {
        		break;
        	}
        }
        
        for(i=0; i<list.size(); i++) {
        	if(list.get(i) <= total) {
        		System.out.print(list.get(i) + " ");
        	}
        }
        
	}

}

