package codingDojang;

import java.util.Scanner;

public class CalcPageCount {
	
	public static void main(String[] args) {
		
		int total, post, page; // total(게시물의 총합), post(한 페이지당 보여줄 게시물 갯수), page(게시판의 페이지 갯수)

        Scanner input = new Scanner(System.in); // total과 post를 입력받기 위한 명령어.

        System.out.print("게시물이 몇 건 올라왔는지 입력하시오: "); // 게시물의 총합을 입력받음
        total = input.nextInt();

        System.out.print("한 페이지당 게시물을 몇 건 담을지 입력하시오: "); // 한 페이지당 올릴 게시물의 갯수를 입력받음
        post = input.nextInt();

        if(total % post == 0) // 게시물과 페이지당 게시물의 갯수를 나눈 값이 일치할 경우
            System.out.printf("필요한 게시판 페이지 갯수: %d\n", total/post);
        else // 일치하지 않을 경우
            System.out.printf("필요한 게시판 페이지 갯수: %d\n", (total/post)+1);
		
	}

}
