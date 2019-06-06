package ual.hmis.sesion05.Ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Ejercicio4Test {

	@ParameterizedTest
	@CsvSource({"123, 234, 23"})

	void testCaracteres(String P1,String P2,String expected) {
		Ejercicio4 ej4 = new Ejercicio4();
		assertEquals(ej4.dosCaracteres(P1, P2),expected);
	}


}
