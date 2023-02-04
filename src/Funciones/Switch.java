package Funciones;

public class Switch {

	public static void main(String[] args) {

		String dia = "nana";

		switch (dia) {
		case "Lunes":
			System.out.println("Es lunes animo");
			break;
		case "Martes":
			System.out.println("Es martes vamos");
		case "Miercoless":
			System.out.println("Es miercoles wuu");
			break;
		case "Jueves":
			System.out.println("Es jueves ya casi");
			break;
		case "Viernes":
			System.out.println("Es viernes epale");
			break;
		case "Sabado":
			System.out.println("Es sabado de flojera");
			break;
		case "Domingo":
			System.out.println("Domingo de fiesta");
		default:
			System.out.println("No es un dia valido");
		}

	}

}
