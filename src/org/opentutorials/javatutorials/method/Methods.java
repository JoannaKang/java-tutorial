package org.opentutorials.javatutorials.method;

public class Methods {

	public static void numbering(int limit) {
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}

	}
	
	public static int forloop (int start, int index) {
		int output = start;
		for (int j=5; j<index; j++) {
			output += j;
			System.out.println(output);
		}
		return output;
	}
	
	public static void main(String[] args) {
		numbering(5);
		int outcome = forloop(10, 10);
		System.out.println(outcome);
		
	}

}
