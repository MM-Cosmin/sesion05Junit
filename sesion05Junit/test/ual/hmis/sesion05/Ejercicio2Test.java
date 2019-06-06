package ual.hmis.sesion05;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.Ejercicio2.Ejercicio2;


class Ejercicio2Test {

	@ParameterizedTest
	@CsvSource({
		",,false",
		"un,,false",
		"user,contrase,false",
		"user,pruebaassssssssssssssssssssssssssssss,false",
		"pruebaassssssssssssssssssssssssssssss,pruebaassssssssssssssssssssssssssssss,false",
		"user,contra,false",
		"usuario,pass,false",
		"user,pass,true",})

	void testLoginDBFalse(String username, String password, boolean expected) {
		if(username == null) username = "";
		if(password==null)password="";
		Ejercicio2 eje2 = new Ejercicio2();
		assertEquals(eje2.login(username, password), expected);

	}

}