package Chap02;

import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		Random rand = new Random();
		
		double a1 = rand.nextDouble();
		double a2 = -1 -rand.nextDouble() *10;
		double a3 = -1 + 2*rand.nextDouble();
		
		System.out.println("3개의 난수를 생성했습니다.");
		System.out.println("0.0이상 1.0미만: " +a1);
		System.out.println("0.0이상 10.0미만: " +a2);
		System.out.println("-1.0이상 1.0미만: " +a3);
		
	}

}
