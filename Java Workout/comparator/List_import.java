package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class List_import {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<User> al = new ArrayList<User>();
		al.add(new User(2, "vimal", 22));
		al.add(new User(1, "raj", 32));
		al.add(new User(3, "anand", 12));
		al.add(new User(4, "ganesh", 30));
		
		Collections.sort(al, new User_comparator());
		
		for (User user : al) {
			System.out.println(user);
		}
		
	}

}
