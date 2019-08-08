package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class PythagoreanTriplet {
	/*
	 * 2019. 08. 07 
	 * @author Park Jae Cheul
	 * 
	 * �� �ڿ��� a, b, c �� ��Ÿ��� ���� a^2 + b^2 = c^2 �� �����ϸ� ��Ÿ��� ����� �θ��ϴ� (���⼭ a < b < c ). 
	 * ���� ��� 3^2 + 4^2 = 9 + 16 = 25 = 5^2 �̹Ƿ� 3, 4, 5�� ��Ÿ��� ���Դϴ�.
	 * a + b + c = 1000 �� ��Ÿ��� �� a, b, c�� �� ���� ���Դϴ�. 
	 * �� ��, a �� b �� c �� ���Դϱ�?
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		int a, b, c;		// �� �ڿ��� 
		for(a=1; a<333; a++) {
			for(b=a+1; b<500; b++) {
				for(c=b+1; c<501; c++) {
					
					if( (a+b+c == 1000) && isPytha(a, b, c) ) {
						System.out.println("1000 ������ ��Ÿ��� �� a, b, c     : " + a + ", " + b + ", " + c);
						System.out.println("1000 ������ ��Ÿ��� �� a, b, c �� ��  : " + (a*b*c));
						break;
					}
					
				}
			}
		}
		
	}
	
	static boolean isPytha(int a, int b, int c) {
		boolean isPytha = false;
		if( (a*a) + (b*b) == (c*c) ) isPytha = true;
		
		return isPytha;
	}
	
}
