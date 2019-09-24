package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class InsertComma {
	/*
	 * 2019. 08. 13 
	 * ���� ������ ���ڿ��� �޸��� ���Ե� �ݾ� ǥ��� ���ڿ��� �ٲپ��ִ� ���α׷��� �ۼ��Ͻÿ�.
	 * ��, ���α׷��� ���� �����ϴ� �ݾ׺�ȯ ���̺귯���� ������� �� ��
	 * 
	 * ��)
	 *     1000	-->      1,000
	 * 20000000	--> 20,000,000
	 * -3245.24	-->     -3,245.24
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println(InsertComma("1000"));
		System.out.println(InsertComma("20000000"));
		System.out.println(InsertComma("-3245.24"));
	}
	
	/**
	 * @param a
	 * @return ',' �Է��� ��
	 */
	public static String InsertComma(String a) {
		String answer = "";
		double doubleNumber;
		
		// a �� ���ڰ� �´��� üũ
		try {
			doubleNumber = Double.parseDouble(a);
		}
		catch (Exception typeException) {
			System.out.println(" ���ڸ� �Է����ּ���! ");
		}
		
		boolean isDouble = (a.indexOf(".") > -1);
		
		// ���ڰ� 2���� ��� double, �ƴ� ��� int �� ��ȯ�ϰ�  
		// �տ� �༮�� ���ؼ� int ��ȯ �� 0 ���� ���� ��� -�� �A ���̸� üũ�ؼ� , �߰�
		
		int number = 0;
		String belowDecimal = "";
		if(isDouble) {
			// double Ÿ���� ���
			number = Integer.parseInt(a.substring(0, a.indexOf(".")));
			belowDecimal = a.substring(a.indexOf("."));
		} else {
			number = Integer.parseInt(a);
		}
		
		boolean isMinus = (number < 0);
		if(isMinus) number *= -1;
		String temp = Integer.toString(number);
		while(true) {
			if(number/1000 > 0) {
				answer = "," + temp.substring( temp.length()-3) + answer;
				number /= 1000;
				temp = temp.substring(0, temp.length() + (-3));
			} else {
				answer = temp + answer;
				break;
			}
			
		}
		
		if(isDouble) answer += belowDecimal;
		if(isMinus) answer = "-" + answer;
		
		return answer;
	}
	
	
	
}
