package comparator;

import java.util.Comparator;

public class User_comparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		User val1 = (User)o1;
		User val2 = (User)o2;
		return val1.name.compareTo(val2.name);
	}
	
}
