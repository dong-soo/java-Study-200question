package Chap03;

import java.util.Scanner;

public class Absolute1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = stdIn.nextInt();
		
		if (n>=0)
			System.out.println("������ " + n + "�Դϴ�.");
		else 
			System.out.println("������ " + -n + "�Դϴ�.");
	}

}
