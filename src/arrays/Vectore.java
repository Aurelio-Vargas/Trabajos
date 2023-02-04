package arrays;
import java.util.Vector;
public class Vectore {

	public static void main(String[] args) {
		Vector<Integer>vector = new Vector();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		System.out.println("Datos del vector " + vector);
		
		//vector.remove(2);
		//System.out.println("Datos del vector " + vector);
		
		System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

	}

}
