package Subtraction;

import CommonVariable.Variable;

public class SubOperation {
	public int sub(int a, int b) {
		Variable var = new Variable();
		var.setA(a);
		var.setB(b);
		int c = var.getA()-var.getB();
		System.out.println("2.Subtraction = "+c);
		return c;
	}
}
