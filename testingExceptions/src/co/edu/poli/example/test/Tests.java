package co.edu.poli.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.poli.example.model.Iterativo;

class Tests {

	Iterativo i = new Iterativo();
	
	@Test
	void test() {
		assertEquals(i.factorial(5), 120);
	}

}
