package codingDojang;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Park Jae Cheul
 *
 */
public class SpecialSortingTwo {
	/*
	 * 2019. 08. 12 
	 * ������ ���� ������ �迭��
	 * [a1,a2,a3...,an,b1,b2...bn]
	 * 
	 * ������ ���� ���·� �ٲٽÿ�
	 * [a1,b1,a2,b2.....an,bn]
	 * 
	 */
	
	public static void main(String[] args) {
		String[] array = {"a1", "b3", "a2", "b1", "a3", "b4", "a4", "b2"};
		String temp = "";
		
		for(int i=0; i<array.length; i++) {
			for(int j=i; j<array.length; j++) {
				
				// �������� ����
				if(array[i].compareTo(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
				// ���ڿ� ���� �� �� �� ����
				if(array[i].substring(1,2).compareTo(array[j].substring(1,2)) > 0 ) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
