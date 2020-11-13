package Chap02;

import java.util.Scanner;

class Gretting {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		
		System.out.print("¼º: ±è"); String lastName = stdIn.next();
		System.out.print("ÀÌ¸§: µ¿¼ö"); String firstName = stdIn.next(); 
		System.out.println("¾È³çÇÏ¼¼¿ä." + lastName+firstName + "¾¾");
	}

}
