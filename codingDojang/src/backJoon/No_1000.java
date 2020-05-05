package backJoon;

import java.util.Scanner;

public class No_1000 {

	public static void main(String args[] ) {
		
		int a, b, sum;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        
    	clearScreen();
    	
    	sum = add(a, b);
    	System.out.println(sum);
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void clearScreen() {
		
		System.out.println("Delete Screen Content.");
		
//		for(int i=0; i<100; i++) {
//			System.out.println("\b");
//		}
		
	}
}
