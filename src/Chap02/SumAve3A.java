package Chap02;

public class SumAve3A {

	public static void main(String[] args) {
		int x, y, z;
		int sum;
		
		x = 10;
		y = 20;
		z = 30;
		sum = x+y+z;
		
		System.out.println("x���� "+ x + "�Դϴ�.");
		System.out.println("y���� "+ y + "�Դϴ�.");
		System.out.println("z���� "+ z + "�Դϴ�.");
		System.out.println("�հ�� "+ (x+y+z) + "�Դϴ�.");
		System.out.println("�հ�� "+ sum + "�Դϴ�.");
		System.out.println(" ����� "+ (x+y+z)/3 + "�Դϴ�.");
		System.out.println(" ����� "+ (sum)/3 + "�Դϴ�.");
	}

}
