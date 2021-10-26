package day02;
import java.util.Scanner;

public class Ex07 {
	/*
	 * 		정수를 입력받아서
	 * 		그 숫자보다 큰 가장 가까운 10의 배수와 입력한 수와의 차를 출력하는 프로그램
	 */
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" 숫자를 입력하세요 . :");
	
		int num = sc.nextInt();
		sc.close();
		
		int num2 = num/10; 
		
		int res = (num2+1)*10;
		int res2 = res - num;
		
		System.out.println("입력한 "+num+ "보다 큰 가장 가까운 "
				+ "10의 배수는 "+res+"이고, 두 수의 차이는 "+res2+"이다.");
	}

}
