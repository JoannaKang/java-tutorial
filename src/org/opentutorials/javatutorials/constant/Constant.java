package org.opentutorials.javatutorials.constant;

public class Constant {

	public static void main(String[] args) {
		// float a = 2.2F; // f를 붙이게 되면 해당 상수가 float 데이터타입이란걸 명시적으로 나타내줌 
		long a = 2147483648L;
		byte b = 100; // 뒤에 뭔가를 붙여주지 않으면 기본값은 int, byte와 short 범위의 숫자들은 int에 할당 가능
		short c = 200;
		
		// 형변환: 왼쪽에서 오른쪽으론 가능, 반대 방향으로는 불가
		// byte - short - int - long - float - double
		//        char  - int 
	}

}
