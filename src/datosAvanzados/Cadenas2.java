package datosAvanzados;

public class Cadenas2 {

	public static void main(String[] args) {
		String cadena = "Mensaje de texto";
		
		boolean resultado = cadena.endsWith("xto");
		//boolean resultados = cadena.startsWith("men"); //Busca lo que empieza un texto
		if (resultado) {
			System.out.println("Empieza por lo que estoy buscando");
		} else {
			System.out.println("No empieza por lo que quiero");
		}
	}

}
