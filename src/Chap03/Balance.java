package Chap03;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a: "); int a = stdIn.nextInt();
		System.out.print("���� b: "); int b = stdIn.nextInt();
		
		if (a>b)
			System.out.println("a�� ũ��.");
		else if (a<b)
			System.out.println("b�� ũ��.");
		else
			System.out.println("a�� b�� ����.");
		
	}

}
