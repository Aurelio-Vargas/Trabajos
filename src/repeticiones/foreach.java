package repeticiones;

public class foreach {

	public static void main(String[] args) {
		String[] nombres = {"pepe", "juan", "ruperto"};
		
		for(String nombre: nombres) {
			System.out.println(nombre);
		}
		
		int[] numeros = {5,10,15};
		
		int suma = 0;
		for(int numero: numeros) {
			suma += numero;
		}
		System.out.println(suma);

	}

}
