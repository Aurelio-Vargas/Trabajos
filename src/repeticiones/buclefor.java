package repeticiones;

public class buclefor {

	public static void main(String[] args) {
		
		 for(int i = 0; i < 10; i ++) {
			//System.out.println("El valor de i es " + i);
		}
		
		String[] nombre = {"pepe", "juan", "ruperto"};
		for(int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);
		}
		
		int suma = 0;
		int[] numero = {5,6,7,8,9};
		for(int i = 0; i < numero.length; i++) {
			//System.out.println(nombre[i]);
			suma = suma + numero [i];
		}

	}

}
