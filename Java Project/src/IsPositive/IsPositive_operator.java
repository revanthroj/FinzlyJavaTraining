package IsPositive;

import CommonVariable.Variable;

public class IsPositive_operator {
	public boolean Positive(int a) {
		Variable var = new Variable();
		var.setA(a);
		if(var.getA()>0) {
			System.out.println("10."+var.getA()+ " is Positive");
			return true;
		}
		return false;
	}
}
