package Circle_square;

import CommonVariable.Variable;

public class Circle_square_Operation {
	public int circle_square(int a) {
		Variable var = new Variable();
		var.setA(a);
		int area = (int)3.14*var.getA()*var.getA();
		System.out.println("6.circle_square = "+ area);
		return area;
	}
}