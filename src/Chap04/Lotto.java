package Chap04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		//1.로또 번호 추출시 저장할 곳이 필요
		List<Integer> basketList = new ArrayList<Integer>();
		
		//2.로또번호를 추출 해줄 클래스가 필요
		Random random = new Random();
		
		//3.로또번호를 6개 추출해야함
		while (true) {
			int number = random.nextInt(46);
			System.out.println(number);
			
			if (basketList.contains(number)) {
				System.out.println("number : " + number + " 는 기존에 등록된 번호다.!");
			} else {
				// 장바구니 지금 번호가없다!
				System.out.println("number : " + number + " 는 기존에 등록이 안된 번호다.!");
				basketList.add(number);
			}
			if(basketList.size() >= 6) {
				System.out.println("로또번호 6개 추출 완료");
				break;
			}
		}
	}

}
