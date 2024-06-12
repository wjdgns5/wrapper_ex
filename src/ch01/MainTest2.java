package ch01;

public class MainTest2 {
	
	public static void main(String[] args) {
		
		String str1 = "10A";
		String str2 = "20.5";
		String str3 = "true";
		
		System.out.println(str2 + 100);
		
		// str1 안에 있는 10 이라는 문자를 숫자로 변경하고 싶다면? (str1 <-- 10)
		
		// 문자열에 데이터(String)타입을 정수(Int)값을 변경하는 방법 
		// 예외처리를 해줘야 한다.
		
		try {
			int n1 = Integer.parseInt(str1);
			System.out.println(n1+100); // int 값으로 변경되었다.
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못된 입력 값입니다.");
		}
		
		// str2 ---> double ---> 8byte
		double d = Double.parseDouble(str2); // double 값으로 변경되었다.
		System.out.println(d);
		
		// str3 ---> boolean ---> 1byte
		boolean b = Boolean.parseBoolean(str3);
		System.out.println(b);
		
		// -------------------------------------------------------------
		
		// 반대로 INT 값을 ---> String 데이터 타입으로 변환하고 싶다면?
		int number = 10000;
		
		String numberStr = String.valueOf(number);
		System.out.println(numberStr);
		
		
		
		
		
	} // end of main
	
} // end of class
