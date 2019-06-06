package ual.hmis.sesion05.Ejercicio5;

import java.util.ArrayList;
import java.util.*;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		double result = 0.0;
		Actividad act;
		int indexAc =0;
		//Busqueda de la actividad

		for(int i=0;i<actividadesAsignadas.size();i++) {
			if(actividadesAsignadas.get(i).getNombre().equals(nombreActividad)) {
					indexAc = i;


			}

		}
		//Calculo de la suma de los ejercicios de la actividad
		String nombreEjercicio;

		int numEjercicios = actividadesAsignadas.get(indexAc).getEjercicios().size();
		for(int i=0;i<numEjercicios;i++) {
			nombreEjercicio = actividadesAsignadas.get(indexAc).getEjercicios().get(i).getNombre();
			result += actividadesAsignadas.get(indexAc).getEjercicios().get(i).getPuntuacion();
		}
		actividadesAsignadas.get(indexAc).setPuntuacionTotal(result);
		result = actividadesAsignadas.get(indexAc).getPuntuacionTotal();
		return result;
	}

}