package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BetterStringsTest {

	@Test
	void interpolation() {
		int a = 3;
		assertThat("${a+4}").isEqualTo("7");
	}
}
