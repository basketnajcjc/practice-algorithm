package codingDojang;

import java.util.Arrays;

/**
 * @author Park Jae Cheul
 *
 */
public class Prisoner120th {
	/*
	2019. 08. 21
	감옥에 120명의 죄수가 있다. 간수는 복도를 120번 동안 다음 조건에 지나간다.

	처음에 문은 모두 닫혀 있다.
	N번째 지나갈 때에는 N의 배수인 문들이 열려 있으면 닫고, 닫혀 있으면 연다.
	마지막에 문이 열려 있으면 그 방의 죄수는 석방이다.
	과연 몇 명의 죄수가 석방될까?
	*/
	
	public static void main(String[] args) {
		System.out.println("석방 된 죄수는 " + countBeLiberated(120) + " 명입니다!");
	}
	
	static int countBeLiberated(int a) {
		int result = 0;
		
		boolean[] doorIsOpen = new boolean[a+1];
		Arrays.fill(doorIsOpen, Boolean.FALSE);
		
		for(int i=1; i<a; i++) {
			for(int j=1; j<a; j++) {
				if(j%i == 0) {
					doorIsOpen[j-1] = !doorIsOpen[j-1];
				}
			}
		}
		
		for(int i=0; i<a; i++) {
			if(doorIsOpen[i]) {
				result++;				
			}
		}
		
		return result;
	}
	
}
