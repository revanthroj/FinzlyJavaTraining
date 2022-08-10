package GreaterThan;

import CommonVariable.Variable;

public class GreaterThan_Operation {
	public int greater(int a, int b) {
		Variable var = new Variable();
		var.setA(a);
		var.setB(b);
		if(var.getA() > var.getB()) {
			System.out.println("9."+a+" is greater than "+b);
			return a;
		}
		System.out.println("9."+b+ " is greater than "+ a);
		return b;
	}
}
