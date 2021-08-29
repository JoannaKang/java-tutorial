package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if (id.equals("egoing") && pw.equals("1234")) {
				System.out.println("logged in");
		} else {
			System.out.println("wrong");
		}
	}

}
