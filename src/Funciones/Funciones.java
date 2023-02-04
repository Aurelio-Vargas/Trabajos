package Funciones;

public class Funciones {
	
	static double getPrice() {
		return 100.99;
	}
	
	
	
	// void indica que no devuelve nada
	static void showMenu(){
		System.out.println("Bienvenido a la e-comerce");
		System.out.println("1- ver zapatos");
		System.out.println("2-comprar zapatillas");
		System.out.println("3-salir");
		
	}
	
	static String getMenu() {
		return "Bienvenido a la e-comerce: \n 1- ver zapatos";
	}
	public static void main(String[] args) {
		
		
		
		// Opcion1: funcion sin parametros y sin tipo de retorno
		
		//showMenu();
		//showMenu();
		
		// Opcion 2: funcion sin parametrso y con tipo de retorno
		String menu = getMenu();
		System.out.println(menu);
		System.out.println(getMenu());
		
		double price = getPrice();
		System.out.println(price);
		
		//opcion 3
		//funcion con parametros y sin tipo de retorno
		imprimirSaludoBuenosDias("Openbootcamp");
		
		//opcion4:
		// funcion con parametro y con tipo de retorno
		String nombre = "Yeyo ";
		String apellido = "Panfilo";
		String saludo = obtenerSaludo(nombre, apellido);
		System.out.println(saludo);
		
	}
	
	
	
	static String obtenerSaludo(String nombre, String apellido) {
		return "Buenas tardes " + nombre + apellido;
	}
	
	static void imprimirSaludoBuenosDias(String nombre) {
		System.out.println("Buenas tardes " + nombre);
	}
	

}
