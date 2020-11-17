package Chap04;

import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int retry; // 다시 한번?
		
		// do문에 의해 반복되는 구간
		do {
			
		System.out.print("정수값: ");
		int n = stdin.nextInt();
		
		if (n > 0)
			System.out.println("이 값은 양수입니다.");
		else if (n < 0)
			System.out.println("이 값은 음수입니다.");
		else
			System.out.println("이 값은 0 입니다, 아니 이거저장이 왜안된느ㅓㄴ.");
		
		System.out.println("다시 한번? 1-yes / 0-No:");
		retry = stdin.nextInt();
	} while (retry==1);
} 

}
