package co.edu.poli.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.poli.example.model.Estudiante;
import co.edu.poli.example.model.Iterativo;

class IterativoTest {

	Iterativo i = new Iterativo();
	Estudiante p = new Estudiante("12356", 18, "Me");

	@Test
	void test1() {
		assertEquals(i.factorial(5), 120);
	}

	@Test
	void test2() {
		assertEquals(i.factorial(6), 720);
	}

	// https://www.geeksforgeeks.org/overriding-equals-method-in-java/
	@Test
	void test3() {
		Estudiante e = new Estudiante("12356", 18, "Me");
		assertEquals(e.getId(), i.operation().getId());
		assertEquals(e.getAge(), i.operation().getAge());
		assertEquals(e.getName(), i.operation().getName());
	}

	@Test
	void test4() {
		try {
			int[] A = { 2, -3, 5 };
			i.sumArray(A);
		} catch (Exception e) {
			assertEquals(e.getMessage(),"Menor valor"); 
		}
	}

	@Test
	void test5() {
		try {
			int[] A = null;
			i.sumArray(A);
		} catch (Exception e) {
			assertTrue(e.getMessage().contains("null"));
		}		
	}

	@Test
	void test6() {
		try {
			char[] A = {'1', '3', 'a'};
			i.convertArr(A);
		} catch (Exception e) {
			assertEquals(e.getMessage(),"Error conversion caracter");
		}		
	}
	
	@Test
	void test7() {
		try {
			int[] A = {1, 3, 7};
			i.lengthException(A);
		} catch (Exception e) {
			assertEquals(e.getMessage(),"Indice fuera arreglo");
		}		
	}
}
