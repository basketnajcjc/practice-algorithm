package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class EightCount {
	/*
	2019. 08. 28
	1���� 10,000���� 8�̶�� ���ڰ� �� ��� �����°�?

	8�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 8�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
	(�� ������� 8808�� 3, 8888�� 4�� ī���� �ؾ� ��)
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
