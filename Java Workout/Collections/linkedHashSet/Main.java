package linkedHashSet;

import java.util.LinkedHashSet;

public class Main {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(34);
		lhs.add(22);
		lhs.add(88);
		lhs.add(90);
		
		lhs.add(22);
		
		System.out.println(lhs);
		
	}
}
