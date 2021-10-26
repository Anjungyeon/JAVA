package day01;

/**
 * 이 클래스는 상수 연습용 클래스
 * @author 안오미
 * @since 2021/10/25
 * @version v.1.0
 * @see
 * 		작업이력 ]
 * 			2021.10.25 - 클래스 제작 - 담당자 : 안오미
 */
public class Test09 {
	//final double PI3; 
	// 함수 밖에서는 0.0 으로 자동 초기화가되어 다른값으로 바꿀 수가 없다.
	// 여기다가 변수를 만들면 기본데이터타입은 0으로 초기화!
	// char 는 아스키코드값이 0 인 문자로 초기화
	// boolean 은 false로 초기화
	
	public static void main(String[] args) {
		// 3.14 를 기억한 변수 PI 를 만들어서
		// 원의 반지름이 5인 원의 넓이를 계산해서 출력해보자
		// 공식 ] 반지름 * 반지름 * 3.14
		
		final double PI = 3.14;  // 상수변수를 선언할때는 변수이름을 대문자로 쓴다.
		
		final double PI2;
		PI2 = 3.14;
		
		int R = 5;
		double area = R * R * PI;
		System.out.println(R);
		System.out.println("반지름이 "+R+"인 원의 넓이는 "+area+"입니다.");
	
	}
	/*
	void abc()
	{
		double area = R * R * PI;  //함수안에서 선언된 변수는 함수안에서만 사용가능
		
	}
	*/
}
