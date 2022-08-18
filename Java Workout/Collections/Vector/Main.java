package Vector;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Vector<Integer> vect = new Vector<Integer>();
		vect.add(1);
		vect.add(23);
		vect.add(3);
		vect.add(4);
		Collections.sort(vect);
		System.out.println("Sorted vector ");
		for(int val : vect) {
			System.out.println(val);
		}
		int maxVal = Collections.max(vect);
		System.out.println("Maximum value in vector ->"+maxVal);
		Collections.reverse(vect);
		System.out.println("reversed vector ");
		System.out.println(vect);
	}
}
