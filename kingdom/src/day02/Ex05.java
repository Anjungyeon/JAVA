package day02;

public class Ex05 {
	/*
	 * 
	 * 		화씨 온도 100 도는 섭씨온도 몇도인지를 계산
	 * 		참고 ]
			섭씨온도 = 5 / 9 * (화씨온도 -32)
	 */
	public static void main(String[] args) {
		
		double temp = 100; // 화씨온도
		
		double temp2 = (temp-32)*5/9; // 섭씨온도 구하는 식
		
		System.out.print("화씨 온도 "+ temp+"도는 섭씨온도" +temp2+"도 입니다.");
	}

}
