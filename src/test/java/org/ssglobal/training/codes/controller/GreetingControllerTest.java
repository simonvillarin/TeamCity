package org.ssglobal.training.codes.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetingControllerTest {

	@Test
	void testGreet() {
		GreetingController gc = new GreetingController();
		assertEquals("Hello World", gc.greet());
	}

}
