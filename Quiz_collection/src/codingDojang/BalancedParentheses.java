package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class BalancedParentheses {
	/*
	2019. 08. 20
	아래는 괄호를 이용한 연산식이다.

	(5+6) 곱하기 (7+8) 나누기 (4+3)
	
	우리는 여는 괄호가 있으면 닫는 괄호가 반드시 있어야 한다는 것을 잘 알고 있다.
	
	다음은 정상적인(balanced) 괄호 사용의 예이다.
	
	(()()()())
	(((())))
	(()((())()))
	다음은 비정상적인(not balanced) 괄호 사용의 예이다.
	
	((((((())
	()))
	(()()(()
	(()))(
	())(()
	괄호의 사용이 잘 되었는지 잘못 되었는지 판별 해 주는 프로그램을 작성하시오.
	*/
	
	public static void main(String[] args) {
		
		System.out.println(isBalanced("(()()()())"));
		System.out.println(isBalanced("(((())))"));
		System.out.println(isBalanced("(()((())()))"));
		
		System.out.println(isBalanced("((((((())"));
		System.out.println(isBalanced("()))"));
		System.out.println(isBalanced("(()()(()("));
		
	}
	
	static boolean isBalanced(String a) {
		boolean result = true;
		
		int openCount = 0;
		
		for(int i=0; i<a.length(); i++) {
			char b = a.charAt(i);
			
			if(b == '(') {
				openCount++;
				continue;
			} else {
				openCount--;
				continue;
			}
			
		}
		
		if(openCount != 0) {
			result = false;
		}
		
		return result;
	}
	
}
