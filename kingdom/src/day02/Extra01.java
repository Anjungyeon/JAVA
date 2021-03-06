package day02;

public class Extra01 {
	public static void main(String[] args) {
		/*
		 * 		5~25 사이의 정수를 2개 랜덤 발생
		 * 		0~2 사이의 정수를 랜덤하게 발생
		 * 		0~2 사이의 정수가 0이면 5~25 사이 정수중 첫번째 정수를 반지름으로 하는 원의 넓이
		 * 						  1이면 삼각형의 넓이
		 *  					  2이면 사각형의 넓이
		 *  	계산해서 출력해주는 프로그램 작성.
		 */
		int num1 = (int)(Math.random()*21)+5;
		int num2 = (int)(Math.random()*3);
		
		double Carea = num1 * num1 * 3.14;
		double Tarea = (num1 * num1)/2;
		int Sarea = num1 * num1;
		
		//System.out.println("num1 : "+ num1 + "  num2 : " + num2);
		System.out.println("반지름은 "+ num1 + "이고 0~2 사이의 랜덤 정수가 "+ num2 +"이므로" );
		String str = num2 == 0 ? "원의 넓이는 "+ Double.toString(Carea): 
			(num2 == 1 ? "삼각형의 넓이는 " + Integer.toString(Sarea) : 
				"사각형의 넓이는 " + Double.toString(Tarea) );
		
		System.out.println(str);
		
	}

}
