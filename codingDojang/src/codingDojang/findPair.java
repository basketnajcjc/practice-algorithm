package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class findPair {
	/*
	2019. 08. 29
	1������ ������ �־����� ��, �� �� ���� �Ÿ��� ª�� ���� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. 
	(�� ������ �迭�� ��� ���ĵǾ��ִٰ� �����Ѵ�.)

	������� S={1, 3, 4, 8, 13, 17, 20} �� �־����ٸ�, ������� (3, 4)�� �� ���̴�.
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
