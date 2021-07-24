package com.kodilla.agent;

import net.bytebuddy.asm.Advice;

public class MethodMonitor {

	public static long start;

	@Advice.OnMethodEnter
	public static void enter(@Advice.Origin Class<?> clazz, @Advice.Origin("#m") String methodName) {
		start = System.currentTimeMillis();
		System.out.println("Entering method: " + methodName);
	}

	@Advice.OnMethodExit
	public static void exit() {
		final long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("Exiting method; execution took " + elapsedTime + " ms");
	}
}
