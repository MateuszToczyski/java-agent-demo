package com.kodilla.demoapp;

public class App {

	public static void main(String[] args) {
		final User user = new User();
		try {
			user.doSomething();
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}
}
