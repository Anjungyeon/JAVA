package day02;

import java.util.Scanner;

public class Ex01 {
	/*
	 * 		랜덤한 정수(5~25)를 반지름으로 하는 원의 
	 * 		넓이, 둘레를 계산해서 출력해주는 프로그램
	 * 
	 * 		bonus ]
	 * 			삼각형, 사각형
	 */
	
	public static void main(String[] args) {
		
		int R = (int)(Math.random()*21)+5; // 랜덤하게 뽑아낸 정수
		double Carea = R * R * 3.14; // 원의 면적
		double Cperi = 2 * R * 3.14; // 원의 둘레
		double Tarea = (R * R)/2; // 삼각형의 면적
		int Tperi = 3 * R; // 삼각형의 둘레
		int Sarea = R * R; // 사각형의 면적
		int Speri = 4 * R; // 사각형의 둘레
		
		
		System.out.println(R+"을 반지름으로 하는 원의 넓이는 "+Carea+"이고 둘레는 "+Cperi+"이다.");
		System.out.println(R+"을 한 변으로 하는 삼각형의 넓이는 "+Tarea+"이고 둘레는 "+Tperi+"이다.");
		System.out.println(R+"을 한 변으로 하는 사각형의 넓이는 "+Sarea+"이고 둘레는 "+Speri+"이다.");
		
		// 랜덤정수 말고 수를 입력받아 해보기
		
		// 1. 입력받을 변수
		Scanner sc = new Scanner(System.in);
		// 2. 입력을 받고 그 데이터를 저장한다.
		System.out.println("반지름을 입력하세요 : ");
		int num = sc.nextInt();
		sc.close(); // 스캐너 쓴 후 꼭 닫아주기!
		
		double Carea2 = num * num * 3.14;
		double Cperi2 = 2 * num * 3.14;
		double Tarea2 = (num * num)/2;
		int Tperi2 = 3 * num;
		int Sarea2 = num * num;
		int Speri2 = 4 * num;
		
		System.out.println(num+"을 반지름으로 하는 원의 넓이는 "+Carea2+"이고 둘레는 "+Cperi2+"이다.");
		System.out.println(num+"을 한 변으로 하는 삼각형의 넓이는 "+Tarea2+"이고 둘레는 "+Tperi2+"이다.");
		System.out.println(num+"을 한 변으로 하는 사각형의 넓이는 "+Sarea2+"이고 둘레는 "+Speri2+"이다.");
		
		
		
	}
}
