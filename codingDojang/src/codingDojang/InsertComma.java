package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class InsertComma {
	/*
	 * 2019. 08. 13 
	 * 숫자 형태의 문자열을 콤마가 포함된 금액 표기식 문자열로 바꾸어주는 프로그램을 작성하시오.
	 * 단, 프로그래밍 언어에서 지원하는 금액변환 라이브러리는 사용하지 말 것
	 * 
	 * 예)
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
	 * @return
	 */
	/**
	 * @param a
	 * @return
	 */
	public static String InsertComma(String a) {
		String answer = "";
		double doubleNumber;
		
		// a 가 숫자가 맞는지 체크
		try {
			doubleNumber = Double.parseDouble(a);
		}
		catch (Exception typeException) {
			System.out.println(" 숫자를 입력해주세요!!!!!!! ");
		}
		
		System.out.println(" a : " + a);
		
		boolean isDouble = (a.indexOf(".") > -1);
		
		// 인자가 2개일 경우 double, 아닐 경우 int 로 변환하고  
		// 앞에 녀석에 대해서 int 변환 후 0 보다 작을 경우 -를 뺸 길이를 체크해서 , 추가
		
		int number = 0;
		String belowDecimal = "";
		if(isDouble) {
			// double 타입일 경우
			number = Integer.parseInt(a.substring(0, a.indexOf(".")));
			belowDecimal = a.substring(a.indexOf("."));
		} else {
			number = Integer.parseInt(a);
		}
		
		int i=0;
		String temp = Integer.toString(number);
		while(true) {
			System.out.println("### while ,,, answer : " + answer);
			if(number/(1000*(i+1)) > 0) {
				answer = "," + temp.substring( temp.length() + (i+1)*(-3), temp.length() - i*3);
				i++;
				temp = temp.substring(0, temp.length()-3);
			} else {
				answer = temp + answer;
				break;
			}
			
		}
		
		if(isDouble) answer += belowDecimal;
		
		System.out.println("# answer : " + answer);
		
		return answer;
		
	}
	
	
	
}
