package Chap02;

import java.util.Scanner;

class Triangle {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�ﰢ���� ���̸� ���մϴ�.");
		
		System.out.print("�غ� : ");
		double width = stdIn.nextDouble();
		
		System.out.print("���� : ");
		double height = stdIn.nextDouble();
		
		System.out.println("���̴� " + (width*height/2) + "�Դϴ�.");
		
	}

}
