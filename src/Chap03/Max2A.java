package Chap03;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�Ǽ�a: "); double a = stdIn.nextDouble();
		System.out.println("�Ǽ�b: "); double b = stdIn.nextDouble();
		
		double max; 
		
		if (a>b)
			
			max = a;
		else
			max = b;
		
		System.out.println("ū ���� ���� " + max + " �Դϴ�.");
	}
	

}
