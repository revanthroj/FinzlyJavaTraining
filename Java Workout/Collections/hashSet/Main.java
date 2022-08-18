package hashSet;

import java.util.*;

public class Main {
public static void main(String[] args) {
	HashSet<String> hash = new HashSet<String>();
	
	hash.add("A");
	hash.add("B");
	hash.add("S");
	hash.add("D");
	System.out.println(hash);
	
	System.out.println(Collections.max(hash));
	
}
}
