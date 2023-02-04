package repeticiones;

public class bucleforwhile {

	public static void main(String[] args) {
		
		int contador=0;
		
		while(contador < 10) {
			contador++;
			if (contador == 5) {
				continue;
			}
			System.out.println("Valor de contador " + contador);
		}

	}

}
