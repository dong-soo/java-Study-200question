package Chap04;

import java.util.Scanner;

public class PutAsteriskFor {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("��� *�� ǥ���ұ��?");
		int n = stdin.nextInt();
		
		if(n > 0) {
			for(int i=0; i<n; i++)
				System.out.print('*');
			System.out.println();
		}
				
	}

}
