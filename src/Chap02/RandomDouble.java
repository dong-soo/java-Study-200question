package Chap02;

import java.util.Random;

public class RandomDouble {

	public static void main(String[] args) {
		Random rand = new Random();
		
		double a1 = rand.nextDouble();
		double a2 = -1 -rand.nextDouble() *10;
		double a3 = -1 + 2*rand.nextDouble();
		
		System.out.println("3���� ������ �����߽��ϴ�.");
		System.out.println("0.0�̻� 1.0�̸�: " +a1);
		System.out.println("0.0�̻� 10.0�̸�: " +a2);
		System.out.println("-1.0�̻� 1.0�̸�: " +a3);
		
	}

}
