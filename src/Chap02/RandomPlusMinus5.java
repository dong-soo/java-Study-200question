package Chap02;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값: ");
		int x = stdIn.nextInt();
		
		System.out.println("입력 값의 ±5 범위의 난수를 생성했습니다.");
		System.out.println("값은 " + (x-5 + rand.nextInt(11))+ "입니다");
	}

}
