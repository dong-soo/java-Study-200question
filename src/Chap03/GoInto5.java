package Chap03;

import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = stdIn.nextInt();
		
		if (n>0)
			if (n % 5 == 0)
				System.out.println("�� ���� 5�� ���������ϴ�.");
			else
				System.out.println("�� ���� 5�� ���������� �ʽ��ϴ�.");
		else 
			System.out.println("���� �������� �Է��߽��ϴ�.");
		
		
	}

}
