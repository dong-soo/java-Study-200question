package Chap02;

public class SumAve3A {

	public static void main(String[] args) {
		int x, y, z;
		int sum;
		
		x = 10;
		y = 20;
		z = 30;
		sum = x+y+z;
		
		System.out.println("x값은 "+ x + "입니다.");
		System.out.println("y값은 "+ y + "입니다.");
		System.out.println("z값은 "+ z + "입니다.");
		System.out.println("합계는 "+ (x+y+z) + "입니다.");
		System.out.println("합계는 "+ sum + "입니다.");
		System.out.println(" 평균은 "+ (x+y+z)/3 + "입니다.");
		System.out.println(" 평균은 "+ (sum)/3 + "입니다.");
	}

}
