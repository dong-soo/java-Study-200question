package Chap02;

import java.util.Scanner;

class ScanInteger {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값");
		
		int x = stdIn.nextInt(); //입력한 정수값을 x에 저장한다
		System.out.println(x + "를 입력했습니다");
	}

}
