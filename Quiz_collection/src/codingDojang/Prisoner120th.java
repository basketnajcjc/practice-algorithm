package codingDojang;

import java.util.Arrays;

/**
 * @author Park Jae Cheul
 *
 */
public class Prisoner120th {
	/*
	2019. 08. 21
	������ 120���� �˼��� �ִ�. ������ ������ 120�� ���� ���� ���ǿ� ��������.

	ó���� ���� ��� ���� �ִ�.
	N��° ������ ������ N�� ����� ������ ���� ������ �ݰ�, ���� ������ ����.
	�������� ���� ���� ������ �� ���� �˼��� �����̴�.
	���� �� ���� �˼��� ����ɱ�?
	*/
	
	public static void main(String[] args) {
		System.out.println("���� �� �˼��� " + countBeLiberated(120) + " ���Դϴ�!");
	}
	
	static int countBeLiberated(int a) {
		int result = 0;
		
		boolean[] doorIsOpen = new boolean[a+1];
		Arrays.fill(doorIsOpen, Boolean.FALSE);
		
		for(int i=1; i<a; i++) {
			for(int j=1; j<a; j++) {
				if(j%i == 0) {
					doorIsOpen[j-1] = !doorIsOpen[j-1];
				}
			}
		}
		
		for(int i=0; i<a; i++) {
			if(doorIsOpen[i]) {
				result++;				
			}
		}
		
		return result;
	}
	
}
