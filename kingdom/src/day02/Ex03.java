package day02;

public class Ex03 {
	/*
	 * 		1년은 365.2426일이다.
	 * 		이 시간은 며칠, 몇시간, 몇분, 몇초인지를
	 * 		계산해서 출력하는 프로그램을 작성하세요.
	 * 
	 * 		참고 ] 
	 * 			0.5일은 12시간이다.
	 * 
	 */
	public static void main(String[] args) {
		
		double year = 365.2426;
		
		int day = (int)year;
		year = year - day;
		System.out.print(day+"일");
		
		double tmp = 0.5/12;
		
		int time = (int)(year/tmp);
		year = year - time*tmp;
		System.out.print(time+"시간");
		
		tmp /=60;
		int min = (int)(year/tmp);
		year = year - min*tmp;
		System.out.print(min+"분");
		
		tmp /=60;
		int sec = (int)(year/tmp);
		year = year - sec*tmp;
		System.out.print(sec+"초");

	}
}
