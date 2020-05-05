package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class EightCount {
	/*
	2019. 08. 28
	1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?

	8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
	(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
	*/
	
	public static void main(String[] args) {
		System.out.println(getCountEight());
	}
	
	static int getCountEight() {
		
		int count = 0;
		
		String numberString = "";
		for(int i=1; i<=10000; i++) {
			
			numberString = Integer.toString(i);
			for(int j=0; j<numberString.length(); j++) {
				
				if( numberString.charAt(j) == '8') {
					count ++;
				}
			}
			
		}
		
//		Good Solution
//		int count = 0;
//		for(int i = 1; i < 10001; i++)
//		{
//		    for(int j = i; j > 0; j /= 10)
//		    {
//		        if(j % 10 == 8)
//		        {
//		            count++;
//		        }
//		    }
//		}
		
		
		return count;
	}
	
}
