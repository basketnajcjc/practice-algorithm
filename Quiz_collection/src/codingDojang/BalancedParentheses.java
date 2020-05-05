package codingDojang;

/**
 * @author Park Jae Cheul
 *
 */
public class BalancedParentheses {
	/*
	2019. 08. 20
	�Ʒ��� ��ȣ�� �̿��� ������̴�.

	(5+6) ���ϱ� (7+8) ������ (4+3)
	
	�츮�� ���� ��ȣ�� ������ �ݴ� ��ȣ�� �ݵ�� �־�� �Ѵٴ� ���� �� �˰� �ִ�.
	
	������ ��������(balanced) ��ȣ ����� ���̴�.
	
	(()()()())
	(((())))
	(()((())()))
	������ ����������(not balanced) ��ȣ ����� ���̴�.
	
	((((((())
	()))
	(()()(()
	(()))(
	())(()
	��ȣ�� ����� �� �Ǿ����� �߸� �Ǿ����� �Ǻ� �� �ִ� ���α׷��� �ۼ��Ͻÿ�.
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
