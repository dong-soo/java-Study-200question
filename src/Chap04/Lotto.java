package Chap04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		//1.�ζ� ��ȣ ����� ������ ���� �ʿ�
		List<Integer> basketList = new ArrayList<Integer>();
		
		//2.�ζǹ�ȣ�� ���� ���� Ŭ������ �ʿ�
		Random random = new Random();
		
		//3.�ζǹ�ȣ�� 6�� �����ؾ���
		while (true) {
			int number = random.nextInt(46);
			System.out.println(number);
			
			if (basketList.contains(number)) {
				System.out.println("number : " + number + " �� ������ ��ϵ� ��ȣ��.!");
			} else {
				// ��ٱ��� ���� ��ȣ������!
				System.out.println("number : " + number + " �� ������ ����� �ȵ� ��ȣ��.!");
				basketList.add(number);
			}
			if(basketList.size() >= 6) {
				System.out.println("�ζǹ�ȣ 6�� ���� �Ϸ�");
				break;
			}
		}
	}

}
