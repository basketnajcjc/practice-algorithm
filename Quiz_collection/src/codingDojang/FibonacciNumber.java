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
	 * �Ǻ���ġ �����̶�, ù ��° ���� ���� 0�̰� �� ��° ���� ���� 1�� ��, ������ �׵��� ������ �� ���� ���� ������ �̷������ ������ ���Ѵ�.
	 * ��) 0, 1, 1, 2, 3, 5, 8, 13
	 * ��ǲ�� ���� n���� �޾�����, n ���ϱ����� �Ǻ���ġ ������ ����ϴ� ���α׷��� �ۼ��ϼ���
	 * 
	 */
	
	public static void main(String[] args) {
		//
		Scanner input = new Scanner(System.in);
        System.out.print("������ �Է��Ͻÿ� : ");
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

