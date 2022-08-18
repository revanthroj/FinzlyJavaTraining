package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]) {
		LinkedList<String> Ll = new LinkedList<String> ();
		Ll.add("L");
		Ll.add("Y");
		Ll.add("F");
		Ll.add("I");
		Ll.add("N");
		Ll.add("Z");
		Collections.rotate(Ll,4);
		System.out.println(Ll);
	}
}
