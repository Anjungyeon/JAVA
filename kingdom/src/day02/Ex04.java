package day02;

public class Ex04 {
	/*
	 * 		0~255 사이의 정수를 랜덤하게 발생시켜서 그 숫자를 아스키코드값으로 하는 문자로 만들고
	 * 		이 문자가 영문자인지 아니면 특수문자인지 판별하는 프로그램을 작성하세요.
	 * 		
	 * 		숫자인지, 대문자인지, 소문자인지, 특수문자인지
	 * 		
	 * 		특수문자들 0~9 대문자들 특수문자 소문자 특수문자
	 * 
	 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*256);
		Character ch = (char)num;
		
		/*String str = Character.isDigit(ch) == true ? 
					"숫자입니당." : 
						(Character.isUpperCase(ch)==true? "대문자입니당." :
							(Character.isLowerCase(ch)==true? "소문자입니당.":"특수문자입니당."));
*/
		String str2 = (num >= 65 & num <=90) ? 
						"대문자 입니당." : 
							(num >= 97 & num <= 122 ? "소문자입니당." :
								(num >= 49 & num <= 57 ? "숫자입니당.":"특수문자입니당."));		
				
		System.out.print(num + "을 아스키 변환하면 "+ch+"이고 "+str2);

		
	
	}
	

}
