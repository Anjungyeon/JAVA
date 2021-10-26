package day01;

public class Test08 {
	public static void main(String[] args) {
		
		long no1 = 10L; // long 타입 데이터 10이된다.
		int no2 = (int)10L; // int 보다 long 이 더 크기때문에 강제 형변환해야함.
		
		float num1 = 3.14f; // float 타입 데이터 3.14가 된다.
		
		double num2 = 10.;
		// int no3 = 20.; // double 타입을 int 에 담으려고해서 오류 
		int no3 = (int)20.; // 그러므로 강제형변환해야한다.
							// 20. 은 double 타입의 데이터 20.0과 같다.
		
	}

}
