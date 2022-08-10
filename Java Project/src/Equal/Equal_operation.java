package Equal;

import CommonVariable.Variable;

public class Equal_operation {
	public boolean equal(int a, int b) {
		Variable var = new Variable();
		var.setA(a);
		var.setB(b);
		if(var.getA() == var.getB()) {
			System.out.println("8.Numbers are equal");
			return true;
		}
		return false;
	}
}
