package Chap02;

import java.util.Scanner;

class LowestDigit {
	public static void main(String[] args) {
		
	 Scanner stdInt = new Scanner(System.in);
	
	
	 System.out.print("������ : ");
	 int a = stdInt.nextInt();
	 
	 System.out.println("������ �ڸ����� ������ ����" + (a/10) + "�Դϴ�");
	 System.out.println("������ �ڸ�����" + (a % 10) + "�Դϴ�");

		

	}

}
