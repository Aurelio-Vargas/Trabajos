package Funciones;

public class ifelse {

	public static void main(String[] args) {

		String dia = "Lunes";

		// ejemplo comparar
		//boolean resultadoComparado = 5 == 5;
		//boolean resultado = dia.equals("Lunes");

		// if else if

		if (dia.equals("Lunes")) {
			System.out.println("Vamos que es lunes");

		} else if (dia.equals("Martes")) {
			System.out.println("Martes con m de mamon");

		} else if (dia.equals("Miercoles")) {
			System.out.println("Miercoles con m de mamon");

		} else if (dia.equals("Jueves")) {
			System.out.println("Jueves con m de mamon");

		} else if (dia.equals("Viernes")) {
			System.out.println("Viernes con m de mamon");

		} else if (dia.equals("Sabado")) {
			System.out.println("Savado con m de mamon");

		} else if (dia.equals("Domingo")) {
			System.out.println("Domingo con m de mamon");

		} else {
			System.out.println("No es un dia valido");
		}
	}

}
