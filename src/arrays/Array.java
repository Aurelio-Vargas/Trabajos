package arrays;

public class Array {

	public static void main(String[] args) {
		String nombres [] = {
				"Juan",
				"Pedro",
				"Saul"
		};
		//int arrayuno[] = {1,2,3,4,5}; // caundo sabemos su valor de los valores
		
		/*int arrayuno[] = new int[5];  //sirve para determinar el lugar en una array y no sabemos su valor
		arrayuno[0]=1;
		arrayuno[1]=2;
		arrayuno[2]=3;
		arrayuno[3]=4;
		arrayuno[4]=5;
		}
		*/
		for(String nombre: nombres) {  // aqui solo tenemos como variable temporal nombre y no vemos donde se encuentran
		System.out.println("Nombre actual: " + nombre);
		}
		 String ultimoNombre = "";
		for(int i = 0; i< nombres.length; i++) {  // sabemos en donde se colocan los arrays o que posicion estan
			System.out.println("Nombre actual: " + nombres[i] + " en posicion " + i);
			ultimoNombre = nombres[i];
		}
		System.out.println(ultimoNombre);

	}

}
