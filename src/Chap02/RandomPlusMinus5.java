package Chap02;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus5 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������: ");
		int x = stdIn.nextInt();
		
		System.out.println("�Է� ���� ��5 ������ ������ �����߽��ϴ�.");
		System.out.println("���� " + (x-5 + rand.nextInt(11))+ "�Դϴ�");
	}

}
