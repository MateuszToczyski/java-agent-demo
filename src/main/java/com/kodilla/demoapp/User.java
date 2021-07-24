package com.kodilla.demoapp;

import java.util.concurrent.ThreadLocalRandom;

public class User {

	public void doSomething() throws InterruptedException {
		System.out.println("User is starting a task...");

		synchronized (this) {
			wait(randomNumber(0, 1000));
		}

		System.out.println("User has completed the task");
	}

	private int randomNumber(final int min, final int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
}
