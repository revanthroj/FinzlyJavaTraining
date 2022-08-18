package arrayList;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println("ArraList");
		for(int val : al) {
			System.out.println(val);
		}
		
		int i = 5;
		int index = Collections.binarySearch(al, i);
		System.out.println("\nNum "+i+" position is "+index);
	
	}
		
}
