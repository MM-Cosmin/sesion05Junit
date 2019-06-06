package ual.hmis.sesion05.Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

	@ParameterizedTest
	@CsvSource({"-10"})

	void testNegativo(int num) {
		Ejercicio3 ej3 = new Ejercicio3();
		assertEquals(ej3.devolucion(num),"numero erroneo");
	}

	@ParameterizedTest
	@CsvSource({"5,5","12,12"})

	void testPositivo(int num,int expected) {
		Ejercicio3 ej3 = new Ejercicio3();
		assertEquals(ej3.devolucion(num).length(), expected);
	}

}