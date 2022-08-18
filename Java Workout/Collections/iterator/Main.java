package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> hs = new ArrayList<Integer>();
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);
		
		int temp = 0;
		while(temp<hs.size()) {
			System.out.println(hs.get(temp));
			temp++;
		}
		System.out.println("*****************");
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*****************");
		hs.stream().forEach(number -> System.out.println(number));
		System.out.println("*****************");
		hs.parallelStream().forEach(number -> System.out.println(number));
	}
}
