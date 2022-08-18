package treeset;


import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		TreeSet<Integer> t_set = new TreeSet<Integer>();
				t_set.add(1);
				t_set.add(8);
				t_set.add(3);
				t_set.add(4);
				System.out.println(t_set);
				t_set.removeAll(t_set);
				System.out.println(t_set);
	}
}
