package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class findPair {
	/*
	2019. 08. 29
	1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. 
	(단 점들의 배열은 모두 정렬되어있다고 가정한다.)

	예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.
	*/
	
	public static void main(String[] args) {
		int[] array = {1, 3, 4, 8, 13, 17, 20};
		getCloseTwo(array);
	}
	
	static void getCloseTwo(int[] array) {
		
		int frontNumber = 0;
		int backNumber = 0;
		int distance = 9999;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				
				if(array[i] >= array[j] ) continue;
				if((array[j]-array[i]) < distance) {
					distance = array[j] - array[i];
					frontNumber = array[i];
					backNumber = array[j];
				}
				
			}
		}

		System.out.println("(" + frontNumber + ", " + backNumber + ")");
		
	}
	
}
