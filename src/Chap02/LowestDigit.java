package Chap02;

import java.util.Scanner;

class LowestDigit {
	public static void main(String[] args) {
		
	 Scanner stdInt = new Scanner(System.in);
	
	
	 System.out.print("정숫값 : ");
	 int a = stdInt.nextInt();
	 
	 System.out.println("마지막 자릿수를 제외한 값은" + (a/10) + "입니다");
	 System.out.println("마지막 자릿수는" + (a % 10) + "입니다");

		

	}

}
