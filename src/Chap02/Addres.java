package Chap02;

import java.util.Scanner;

public class Addres {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("주소: ");
		String addres = stdIn.nextLine();
		
		System.out.println("주소는 " + addres + "입니다.");
	}

}
