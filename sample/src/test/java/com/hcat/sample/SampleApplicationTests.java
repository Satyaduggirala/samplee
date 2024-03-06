package com.hcat.sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SampleApplicationTests {

	@Test
	void contextLoads() {
		// Simple test to ensure that the Spring context loads without errors
	}

	@Test
	void mainMethodRuns() {
		// Test if the main method runs without throwing any exceptions
		SampleApplication.main(new String[]{});
	}

	// Add more test cases as needed for specific functionality in your application

}

