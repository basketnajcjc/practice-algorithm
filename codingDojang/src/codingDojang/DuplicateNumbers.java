package codingDojang;

import java.util.Scanner;

/**
 * @author Park Jae Cheul
 *
 */
public class DuplicateNumbers {
	/*
	 * 2019. 08. 05 
	 * @author Park Jae Cheul
	 * 
	 * 0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오.
	 * sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
	 * sample outputs: true false false true false
	 * 0번씩 사용된 숫자가 있어도 false 입니다
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // total과 post를 입력받기 위한 명령어.

        System.out.print("0~9까지의 숫자를 입력하시오: "); // 게시물의 총합을 입력받음
        String lineString = input.nextLine();
        
        boolean duplicate = false;
        int i;
        for(i=0; i<10; i++) {
        	String[] result = lineString.split(""+i);
        	if(result.length == 2) {  
        		duplicate = false;
        	} else if( (result.length == 1) && (lineString.indexOf(""+i) > -1) ){
        		duplicate = false;
        	} else {
        		duplicate = true;
        	}
        			
        	if(duplicate) break;
        }
        
        System.out.println(!duplicate);
		
		
	}
}
