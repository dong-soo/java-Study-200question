package Chap04;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n;
		do {
			System.out.print("정수값 : ");
			n = stdin.nextInt();
			}while (n <= 0);
		
		int factorial = 1;
		int i = 1;
		
		while (i <= n) {
			factorial *= i;
			i++;
			}
		System.out.println("1부터 " + n +"까지의 곱은 " + factorial + "입니다.");
	}

}
