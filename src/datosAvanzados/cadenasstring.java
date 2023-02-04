package datosAvanzados;

public class cadenasstring {

	public static void main(String[] args) {
		String cadena ="Mensaje de texto";
		
		int cadenaLen = cadena.length();  
		System.out.println("La longitud de la cadena es de: " + cadenaLen);
		
		String cadenaMinus = cadena.toLowerCase(); // Pasar todas las letras a minuscula
		System.out.println("La cadena ahora es: " + cadenaMinus);
		
		String cadenaMayus = cadena.toUpperCase();  // Pasar todas las letras a mayuscula
		System.out.println("La cadena ahora es: " + cadenaMayus);

	}

}
