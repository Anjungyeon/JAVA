package day02;

public class Ex02 {
	/*
	 * 		Ex02 ]
	 * 			54232원을 지불 하려고한다.
	 * 			우리나라 화폐단위별로 몇개씩 필요한지 계산해서 출력하세요.
	 * 
	 * 			화폐단위 ]
	 * 			50000
	 * 			10000
	 * 			5000		
	 * 			1000	
	 * 			500
	 * 			100
	 * 			50
	 * 			10
	 * 			1
	 */
	public static void main(String[] args) {
		int money = 54232;
		int num1 = money / 50000;
		money = money - 50000*num1;
		System.out.println("50000원 "+num1+"장");
		
		int num2 = money / 10000;
		money = money - 10000*num2;
		System.out.println("10000원 "+num2+"장");

		int num3 = money / 5000;
		money = money - 5000*num3;
		System.out.println("5000원 "+num3+"장");

		int num4 = money / 1000;
		money = money - 1000*num4;
		System.out.println("1000원 "+num4+"장");

		int num5 = money / 500;
		money = money - 500*num5;
		System.out.println("500원 "+num5+"장");

		int num6 = money / 100;
		money = money - 100*num6;
		System.out.println("100원 "+num6+"장");

		int num7 = money / 50;
		money = money - 50*num7;
		System.out.println("50원 "+num7+"장");

		int num8 = money / 10;
		money = money - 10*num8;
		System.out.println("10원 "+num8+"장");

		int num9 = money / 50;
		money = money - 5*num9;
		System.out.println("50원 "+num9+"장");

		int num10 = money / 1;
		money = money - 1*num10;
		System.out.println("1원 "+num10+"장");

		
		//System.out.println(money);
	}
}
