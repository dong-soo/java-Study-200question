package Chap02;

import java.util.Scanner;

class PlusMinus10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int x = stdIn.nextInt();
		
		System.out.println("10�� ���� ���� " + (x+10)+ "�Դϴ�.");
		System.out.println("10�� �� ���� " + (x-10)+ "�Դϴ�.");
	}

}
