package Chap02;

import java.util.Scanner;

class SumAveDouble {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x�� : ");
		double x = stdIn.nextDouble();
		
		System.out.print("y�� : ");
		double y = stdIn.nextDouble();
		
		System.out.println("�հ�� " + (x+y) + "�Դϴ�.");
		System.out.println("����� " + (x+y/2) + "�Դϴ�.");
		
	}
}
