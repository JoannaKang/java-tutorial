package org.opentutorials.javatutorials.datatype;

public class Datatype {

	public static void main(String[] args) {
		// byte, short, int, long -> 이 순서대로 메모리를 많이 사용하게 됨  
		// 대부분의 경우 int를 쓰면 됨
		
		// 예를 들어 행정구역의 경우=> 10개 이상이 되지 않을 것이 확실할때면 byte를 써도 괜
		byte district;
		district = 5;
		
		// 같은 수를 할당하더라도 int, long의 차이
		int a = 2147483647;
		long b = 214743647; // 같은 수지만 b가 더 많은 메모리를 사용한다
		
		// 실수형: float, double => 웬만하면 double을 쓴다  
		

	}

}
