package com.qa.handling;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start");
		String s = "bloop";

		try {
			s = test(); // doesn't finish execution due to the error being thrown
		} catch (MyCheckedException mce) {
			System.out.println("Oh no, a contrived exception! Oh, the humanity!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(s);
//		throw new MyUnCheckedException();
		System.out.println("End");
	}

	private static String test() throws MyCheckedException {
		if (true)
			throw new MyCheckedException("You've got an exception m8!");
		return "hello";
	}

}
