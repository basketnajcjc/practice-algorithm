package codingDojang;

import java.util.Scanner;

public class CalcPageCount {
	
	public static void main(String[] args) {
		
		int total, post, page; // total(�Խù��� ����), post(�� �������� ������ �Խù� ����), page(�Խ����� ������ ����)

        Scanner input = new Scanner(System.in); // total�� post�� �Է¹ޱ� ���� ��ɾ�.

        System.out.print("�Խù��� �� �� �ö�Դ��� �Է��Ͻÿ�: "); // �Խù��� ������ �Է¹���
        total = input.nextInt();

        System.out.print("�� �������� �Խù��� �� �� ������ �Է��Ͻÿ�: "); // �� �������� �ø� �Խù��� ������ �Է¹���
        post = input.nextInt();

        if(total % post == 0) // �Խù��� �������� �Խù��� ������ ���� ���� ��ġ�� ���
            System.out.printf("�ʿ��� �Խ��� ������ ����: %d\n", total/post);
        else // ��ġ���� ���� ���
            System.out.printf("�ʿ��� �Խ��� ������ ����: %d\n", (total/post)+1);
		
	}

}
