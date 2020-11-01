package Chap03;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("실수a: "); double a = stdIn.nextDouble();
		System.out.println("실수b: "); double b = stdIn.nextDouble();
		
		double max; 
		
		if (a>b)
			
			max = a;
		else
			max = b;
		
		System.out.println("큰 쪽의 값은 " + max + " 입니다.");
	}
	

}
