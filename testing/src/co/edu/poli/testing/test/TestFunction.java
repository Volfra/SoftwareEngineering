package co.edu.poli.testing.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import co.edu.poli.testing.model.Function;

public class TestFunction {
	
	Function f = new Function();

	@Test
	public void test1() {
		int n = 5;
		assertEquals(120, f.facto(n));
	}

	@Test
	public void test2() {
		int n = 4;
		assertEquals(720, f.facto(n));
	}
	
	@Test
	public void test3() {
	    Throwable exception = assertThrows(AssertionError.class, () -> f.facto(-5));
	    assertEquals("No cumple precondicion", exception.getMessage());
	}
}
