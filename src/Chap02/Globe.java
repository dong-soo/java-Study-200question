package Chap02;

import java.util.Scanner;

class Globe {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final double PI = 3.1416;
		
		System.out.println("���� �ѳ��̿� ���Ǹ� ���մϴ�.");
		System.out.print("������ : ");
		double r = stdIn.nextDouble();
				
		System.out.println("�ѳ��̴� " + (4*PI*r*r) + "�Դϴ�.");
		System.out.println("���Ǵ� " + (4/3.0*PI*r*r*r) + "�Դϴ�.");
		
	}

}
