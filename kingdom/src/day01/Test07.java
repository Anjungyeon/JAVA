package day01;

public class Test07 {
	public static void main(String[] args) {
		
		
		/*
		 *  강제형변환
		 */
		
		float no1 = 3.14f;
		
		int no2 = (int)(3.14 * 100);
		
		int no3 = (int)3.14*100;
		
		System.out.printf("no 2 : %d \nno 3 : %d\n ",no2,no3);
		
		String str = "abcd" + 10; // 문자 + 숫자->객체타입쪽이 무조건 더크다, 문자열타입으로변환
									// abcd10
		
		System.out.printf("str = %s \n",str);	
	
		char ch = (char)37.05;
		
		System.out.printf(" ch : %c\n", ch);
		
	}

}
