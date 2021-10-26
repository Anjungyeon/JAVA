package day02;

import java.util.Scanner;
//import javax.swing.*;
public class Ex06 {
	
	/*
	 * 실수를 입력한 후 
	 * 소수이하 셋째자리에서 반올림한 결과를 출력하는 프로그램을 출력하세요.
	 * 
	 * 힌트 ]
	 * 		3.1415 ->
	 * 			3.1415 + 0.005를 해주고
	 * 			소수 셋째자리 이하는 버리면된다
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 반올림할 숫자를 입력하세요 . :");
		
		double num = sc.nextDouble();
		sc.close();
		double num2 = num*1000;
		double num3 = num2%10;
		double newNum = (int)(num*100);
		double newNum2 = (int)(num*100)+1;
		Double res = num3 >= 5? newNum2/100:newNum/100;
		//newNum = newNum/100;
		
		System.out.println("입력한 숫자는 "+num+"이고, 소수 셋째자리에서 반올림 한 수는 "+
							res+"입니다.");
		
		/*String str = JOptionPane.showInputDialog(" 소수이하 세자리 이상되는 실수 입력 : ");
		double dNo = Double.parseDouble(str);
		 
		double tmp = dNo + 0.005;
		int no = (int) tmp;
		double result =tmp/100.0;
		  
		JOptionPane.showMessageDialog(null,"입력한 숫자 :"+dNo+"\n반올림한 숫자 : "+result);
		*/
		 
	}
	
	

}
