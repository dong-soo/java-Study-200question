package Chap02;

import java.util.Scanner;

class PlusMinus10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값 : ");
		int x = stdIn.nextInt();
		
		System.out.println("10을 더한 값은 " + (x+10)+ "입니다.");
		System.out.println("10을 뺀 값은 " + (x-10)+ "입니다.");
	}

}
