package arrays;

import java.util.ArrayList;

public class arraylis {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add ("ElementoA");
		lista.add ("ElementoB");
		lista.add ("ElementoC");
		
		lista.remove("ElementoB");
		System.out.println("Contenido: " + lista);

	}

}
