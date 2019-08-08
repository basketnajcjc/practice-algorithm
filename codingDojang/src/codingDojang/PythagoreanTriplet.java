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
	 * 세 자연수 a, b, c 가 피타고라스 정리 a^2 + b^2 = c^2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ). 
	 * 예를 들면 3^2 + 4^2 = 9 + 16 = 25 = 5^2 이므로 3, 4, 5는 피타고라스 수입니다.
	 * a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 
	 * 이 때, a × b × c 는 얼마입니까?
	 * 
	 */
	
	public static void main(String[] args) {
		
		
		int a, b, c;		// 세 자연수 
		for(a=1; a<333; a++) {
			for(b=a+1; b<500; b++) {
				for(c=b+1; c<501; c++) {
					
					if( (a+b+c == 1000) && isPytha(a, b, c) ) {
						System.out.println("1000 이하의 피타고라스 수 a, b, c     : " + a + ", " + b + ", " + c);
						System.out.println("1000 이하의 피타고라스 수 a, b, c 의 곱  : " + (a*b*c));
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
