package codingDojang;

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
		
		
		
		int sum = 0;
		int i;
		for(i=1; i<5000; i++) {
			if(isSelfNumber(i)) sum += i;
		}
		
		
		
		System.out.println(" 1 �̻��̰� 5000 ���� ���� ���� �ѹ����� �� : " + sum);
	}
	
	static boolean isSelfNumber(int number) {
		boolean isSelfNumber = false;
		
		
		
		
		return isSelfNumber;
	}
	
	static void d(int number) {
		int result = 0;
	}
}
