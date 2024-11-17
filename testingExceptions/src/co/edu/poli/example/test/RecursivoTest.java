package co.edu.poli.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.poli.example.model.Recursivo;

class RecursivoTest {

	Recursivo r = new Recursivo();
	
	@Test
	void test4() {
		try {
			int[] A = { 2, -3, 5 };
			 r.sumArray(A);
		}
		catch (Throwable e) {
			assertEquals("Menor valor", e.getMessage());
		}
	}

}
