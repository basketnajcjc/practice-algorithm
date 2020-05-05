package codingDojang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author DTOL
 *
 */
public class NameSoring {
	
	/*
	 * 2019. 08. 01 
	 * by Park Jae Cheul
	 * 
	 * �־��� ���ڿ�(���� ���� ��ǥ�� ���еǾ� ����)�� ������ �Ʒ� ������ ���� ���α׷��� �ۼ��ϼ���.
	 * ������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������
	 * 1. �达�� �̾��� ���� �� �� �ΰ���?
	 * 2. "���翵"�̶� �̸��� �� �� �ݺ��ǳ���?
	 * 3. �ߺ��� ������ �̸��� ����ϼ���.
	 * 4. �ߺ��� ������ �̸��� ������������ �����Ͽ� ����ϼ���.	
	 */
	
	public static void main(String[] args) {
		
		String[] nameList = {"������", "���翵", "����ǥ", "���翵", "�ڹ�ȣ", "������", "���翵", "������", "�ֽ���", "�̼���", "�ڿ���", "�ڹ�ȣ", "������", "����ȯ", "���缺", "������", "������"};
	
		int i=0;
		int countKim = 0;
		int countLee = 0;
		int countLJY = 0;
		List resultList = new ArrayList<String>();
		
		for(i=0; i<nameList.length; i++) {
			// 1. �达�� �̾��� ���� �� �� �ΰ���?
			
			if(nameList[i] == "���翵") countLJY++;
			if(nameList[i].indexOf("��") == 0) countLee++;
			if(nameList[i].indexOf("��") == 0) countKim++;
			
			if(!resultList.contains(nameList[i])) resultList.add(nameList[i]);
			
		}
		
		System.out.println(" # 1. �达�� �̾��� ���� �� �� �ΰ���? �达 : " + countKim + "��, �̾� : " + countLee + "��");
		System.out.println(" # 2. '���翵'�̶� �̸��� �� �� �ݺ��ǳ���? " + countLJY);
		System.out.println(" # 3. �ߺ��� ������ �̸��� ����ϼ���. " + resultList);
		resultList.sort(null); 
		System.out.println(" # 4. �ߺ��� ������ �̸��� ������������ �����Ͽ� ����ϼ���. " + resultList);
		
	}

}
