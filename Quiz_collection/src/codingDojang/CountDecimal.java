package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class CountDecimal {
	/*
	 * 2019. 08. 12 
	 * 2�̻� 1000���� �ڿ����� ���տ��� �Ҽ��� ������ ���ϴ� �˰����� �ۼ��Ͻÿ�.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int result = CountDecimal(2, 1000);
		System.out.println("2 �̻� 1000 ���� �ڿ��� �� �Ҽ��� ���� : "+ result);
	}
	
	static int CountDecimal(int n, int m) {
		int count = 0;
		boolean isDecimal = true;
		
		for(int i=n; i<m+1; i++) {
			isDecimal = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					isDecimal = false; 
					break;
				}
			}
			
			if(isDecimal) count++;			
		}
		
		return count;
	}

}
