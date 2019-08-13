package codingDojang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Park Jae Cheul
 *
 */
public class GeneratorNumber {
	/*
	 * 2019. 08. 07 
	 * @author Park Jae Cheul
	 * 
	 * � �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.
	 * ���� ���, d(91) = 9 + 1 + 91 = 101.
	 * �� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.
	 * � ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. 
	 * �׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���. 
	 * ���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.
	 * 1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
	 */
	
	public static void main(String[] args) {
		
		boolean[] generatorList = new boolean[5000];
		Arrays.fill(generatorList, Boolean.FALSE);
		
		for(int i=1; i<5000; i++) {
			
			int number = i/1000 + (i%1000)/100 + (i%100)/10 + i%10 + i;
			if(number>4999) continue;
			generatorList[number] = true;	
		}
		
		int sum=0;
		for(int i=1; i<5000; i++) {
			if(!generatorList[i]) sum+=i;
		}
				
		System.out.println("1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� �� : " + sum);
	}
	
}
