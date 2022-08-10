package Division;

import CommonVariable.Variable;

public class Divide {
	public int div(int a, int b) {
		Variable var = new Variable();
		var.setA(a);
		var.setB(b);
		int c = var.getA()/var.getB();
		System.out.println("4.Division = "+c);
		return c;
	}
}
