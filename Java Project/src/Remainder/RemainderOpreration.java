package Remainder;

import CommonVariable.Variable;

public class RemainderOpreration {
	public int remainder(int a, int b) {
		Variable var = new Variable();
		var.setA(a);
		var.setB(b);
		int c = var.getA()%var.getB();
		System.out.println("5.Remainder = "+ c);
		return c;
	}
}
