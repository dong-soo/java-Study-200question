package Chap04;

import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int retry; // �ٽ� �ѹ�?
		
		// do���� ���� �ݺ��Ǵ� ����
		do {
			
		System.out.print("������: ");
		int n = stdin.nextInt();
		
		if (n > 0)
			System.out.println("�� ���� ����Դϴ�.");
		else if (n < 0)
			System.out.println("�� ���� �����Դϴ�.");
		else
			System.out.println("�� ���� 0 �Դϴ�, �ƴ� �̰������� �־ȵȴ��ä�.");
		
		System.out.println("�ٽ� �ѹ�? 1-yes / 0-No:");
		retry = stdin.nextInt();
	} while (retry==1);
} 

}
