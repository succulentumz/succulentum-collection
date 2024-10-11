package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	void mainMethodTest() {
		assertDoesNotThrow(() -> DemoApplication.main(new String[] {}));
	}

}
