package ual.hmis.sesion05.Ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio5Test {

	@ParameterizedTest
	@CsvSource({"Grace, 7.0","Valde, 2.0", "Pedro, 15.0"})
	void actividadAlumnoTest(String nombre, double expected) {


		//Actividades
		Actividad a1 = new Actividad();
		a1.setNombre("Grace");
		ArrayList<Ejercicio> ar = a1.getEjercicios();
		ar = new ArrayList<Ejercicio>();
		a1.setEjercicios(ar);
		a1.agregarEjercicioCalificado("ej1", 7.0);

		Actividad a2 = new Actividad();
		a2.setNombre("Valde");
		ar = new ArrayList<Ejercicio>();
		a2.setEjercicios(ar);
		a2.agregarEjercicioCalificado("ej1", 1.0);
		a2.agregarEjercicioCalificado("ej2", 1.0);

		Actividad a3 = new Actividad();
		a3.setNombre("Pedro");
		ar = new ArrayList<Ejercicio>();
		a3.setEjercicios(ar);
		a3.agregarEjercicioCalificado("ej1", 5.0);
		a3.agregarEjercicioCalificado("ej2", 5.0);
		a3.agregarEjercicioCalificado("ej3", 5.0);

		//Alumnos
		Alumno alum = new Alumno();
		alum.setNombre("Carlos");
		ArrayList<Actividad> arrayAl1 = alum.getActividadesAsignadas();
		arrayAl1 = new ArrayList<Actividad>();
		alum.setActividadesAsignadas(arrayAl1);
		alum.getActividadesAsignadas().add(a1);
		alum.getActividadesAsignadas().add(a2);
		alum.getActividadesAsignadas().add(a3);

		Alumno alum2 = new Alumno();
		alum2.setNombre("Maria");
		ArrayList<Actividad> arrayAl2 = alum2.getActividadesAsignadas();
		arrayAl2 = new ArrayList<Actividad>();
		alum2.setActividadesAsignadas(arrayAl2);
		alum2.getActividadesAsignadas().add(a1);
		alum2.getActividadesAsignadas().add(a2);
		alum2.getActividadesAsignadas().add(a3);

		//Profesor
		Profesor teacher = new Profesor();
		ArrayList<Alumno> arrayPro = teacher.getAlumnosDePracticas();
		arrayPro = new ArrayList<Alumno>();
		arrayPro.add(alum);
		arrayPro.add(alum2);
		teacher.setAlumnosDePracticas(arrayPro);
		teacher.calificarAlumnos();

		//Alumnos
		assertTrue(a3.isApta());
		assertEquals(alum.calcularNotaActividad(nombre),expected);
		assertEquals(alum2.calcularNotaActividad(nombre),expected);
		assertEquals(alum.getNombre(),"Carlos");
	}
}