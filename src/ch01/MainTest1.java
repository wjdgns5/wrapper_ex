package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		int num1 = 3; // ---> int의 래퍼 클래스는 Integer 이다
		
		//  박싱 : 감싸다. @Deprecated --> 이제 지원을 안한다는 뜻
		//	@Deprecated : 더 이상 지원하지 않음
		
		Integer num2 = new Integer(3); // 박싱 
		int num3 = num2.intValue(); // 언박싱
		
		System.out.println(num2);
		System.out.println(num3);
		
		// 2단계 - 자동 박싱, 자동언박싱 용어를 이해하자.
		
		Integer num4 = 17; // 자동 박싱 int <-- Wrapper --> Integer 변환 된것 ! 
		
		// num4 = Integer 이다. (래퍼클래스)
		// num5 = int 이다. (기본타입)
		int num5 = num4; // 자동 언박싱 개념
		

	} // end of main

} // end of class
