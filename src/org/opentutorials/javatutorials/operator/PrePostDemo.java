package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i); // 4
		++i;
		System.out.println(i); // 5
		System.out.println(++i); // 6
		System.out.println(i++); // 6 -> i를 출력하고 1 더하는  
		System.out.println(i); // 7
	}

}