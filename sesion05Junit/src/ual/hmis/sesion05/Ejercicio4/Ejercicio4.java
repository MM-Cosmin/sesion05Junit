package ual.hmis.sesion05.Ejercicio4;

public class Ejercicio4 {

	public String dosCaracteres(String P1,String P2) {
		String res="";
		for(int i=0;i<P1.length();i++) {
			for(int j=0;j<P2.length();j++) {
				if(P1.charAt(i)==P2.charAt(j)) {
					res += P1.charAt(i);
				}

			}
		}
		return res;
	}

}
