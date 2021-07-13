package com.qa.handling;

import java.util.Scanner;

public class FinallyApp {

	public static void main(String[] args) {
		// try-with-resources
		// try that auto-closes anything it creates
		try (Scanner scan = new Scanner(System.in);) {
			String in = scan.nextLine();

			Integer num = Integer.parseInt(in); // converts "22" -> 22
			System.out.println("You typed: " + num);
		}
	}

}
