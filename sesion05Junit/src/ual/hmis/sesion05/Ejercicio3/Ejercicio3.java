package ual.hmis.sesion05.Ejercicio3;

public class Ejercicio3 {

	public String devolucion(int numero) {
		String res= "";
		if(numero <0) {
			res = "numero erroneo";
		}else {
			for(int i=0;i<numero;i++) {
				res +="*";
			}
		}
		return res;
	}
}
