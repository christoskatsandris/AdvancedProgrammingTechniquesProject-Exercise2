package gr.upatras.project.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractorTest {

	@Test
	void testPositive() {
		Subtractor tester = new Subtractor();
		assertEquals("POSITIVE", tester.subtract(10, 5));
	}
	@Test
	void testNegative() {
		Subtractor tester = new Subtractor();
		assertEquals("NEGATIVE", tester.subtract(5, 10));
	}
	@Test
	void testZero() {
		Subtractor tester = new Subtractor();
		assertEquals("ZERO", tester.subtract(5, 5));
	}
}
