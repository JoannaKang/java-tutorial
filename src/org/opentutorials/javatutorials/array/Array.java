package org.opentutorials.javatutorials.array;

public class Array {

	public static void main(String[] args) {
		String[] classGroup = {"Harry", "Ron", "Hermione"}; // 배열은 중괄호를 사용해 선
		
		for (int i = 0; i < classGroup.length; i++) {
			System.out.println(classGroup[i]);
		}
		
		for (String e:classGroup) {
			System.out.println(e);
		}
	}

}
