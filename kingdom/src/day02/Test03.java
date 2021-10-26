package day02;

import javax.swing.*;

public class Test03 {
	/*
	 * 		정수를 입력받아서
	 * 		짝수인지 홀수인지 출력해주는 프로그램을 작성하세요.
	 */
	
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("정수를 입력하세요 : ");
		
		int inNo = Integer.parseInt(str);
		String strNo = inNo%2==0? "짝수":"홀수";
		
		JOptionPane.showMessageDialog(null, "입력한 숫자 [ " +inNo +" ] 는 [ " + strNo + " ] 입니다. ");

		
	
	}
}
