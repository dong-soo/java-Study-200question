package Chap03;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������: ");
		int n = stdIn.nextInt();
		
		if (n>0)
			if(n%3 == 0)
			System.out.println("�� ���� 3���� ���������ϴ�.");
			else if (n%3 == 0)
				System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�.");
			else
				System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�.");
		else
			System.out.println("�� ���� ����� �ƴմϴ�.");
	}

}
