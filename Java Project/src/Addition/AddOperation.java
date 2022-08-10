package Addition;
import CommonVariable.Variable;

public class AddOperation {
	public int add(int a, int b) {
		Variable var = new Variable();
		var.setA(a);
		var.setB(b);
		int c = var.getA()+var.getB();
		System.out.println("1.Addition = "+c);
		return c;
	}
}
