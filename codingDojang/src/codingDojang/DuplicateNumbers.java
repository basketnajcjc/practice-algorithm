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
	 * 0~9������ ���ڷ� �� ���ڸ� �Է� �޾��� ��, �� �Է� ���� 0~9������ ���ڰ� ���� �� �� ���� ���� ������ Ȯ���ϴ� �Լ��� ���Ͻÿ�.
	 * sample inputs: 0123456789 01234 01234567890 6789012345 012322456789
	 * sample outputs: true false false true false
	 * 0���� ���� ���ڰ� �־ false �Դϴ�
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // total�� post�� �Է¹ޱ� ���� ��ɾ�.

        System.out.print("0~9������ ���ڸ� �Է��Ͻÿ�: "); // �Խù��� ������ �Է¹���
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
