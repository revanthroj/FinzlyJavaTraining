package Multiplication;

import CommonVariable.Variable;

public class MultiplyOperation {
	public int multiply(int a, int b) {
		Variable var = new Variable();
		var.setA(a);
		var.setB(b);
		int c = var.getA()*var.getB();
		System.out.println("3.Multiplication = "+c);
		return c;
	}
}
