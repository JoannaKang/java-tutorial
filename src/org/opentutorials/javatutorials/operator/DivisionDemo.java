package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); // -> int 결과값이 나
		System.out.println(c/d); // int,float를 연산하게 되면 float가 더 자세한 숫자값을 가질 수 있으므로 float로 형변환됨
		System.out.println(a/d);
	}

}
