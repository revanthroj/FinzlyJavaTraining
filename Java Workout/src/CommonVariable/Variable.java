package CommonVariable;

public class Variable {
	int a;
	int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	@Override
	public String toString() {
		return "Variable [a=" + a + ", b=" + b + "]";
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
