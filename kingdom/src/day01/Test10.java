package day01;

public class Test10 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 10;
		//int no3 = ++no1 + ++no2; // 11 + 11 = 22
		//int no3 = ++no1 + no2++; // 11 + 10 = 21
		
		int no3 = no1++ + no2++ ; // 10 + 10 = 20
		System.out.println(no3);
		
		int no4 = no1 + no2 ;
		System.out.println(no1 +"\n"+ no2 ); // 11 11
		System.out.println(no4);
		
		int no5 = ++no1 - no2; // 12 - 11 = 1
		int no6 = no1 * no2; // 12 * 11 ;
		int no7 = no1 / no2;
		int no8 = no1 % no2;
		
		int num = 10;
		// num = num + 10;
		num *= 10;
	}

}
