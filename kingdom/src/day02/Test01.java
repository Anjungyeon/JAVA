package day02;

public class Test01 {
	public static void main(String[] args) {
		// 이 함수는 이 클래스가 실행이 될때 제일 먼저 JVM이 찾아보는 함수
		// 이 함수가 존재하면 이 함수 실행부터 시작한다.
		
		int no1 = 10;
		int no2 = 10;
		
		boolean bool1 = (no1 > no2) & (++no2 > 10);

		boolean bool2 = (no1 > no2) && (++no1 > 10);
		
		System.out.println("bool1 : "+ bool1 + ", no2 : " + no2);
		System.out.println("bool2 : "+ bool2 + ", no1 : " + no1);
	}

}
