package Operations;


public class Operators {
	int add(int a, int b) {
		int c = a+b;
		System.out.println("1.Addition = "+c);
		return c;
	}
	int sub(int a, int b) {
		int c = a-b;
		System.out.println("2.Subtraction = "+c);
		return c;
	}
	int multiply(int a, int b) {
		int c = a*b;
		System.out.println("3.Multiplication = "+c);
		return c;
	}
	int div(int a, int b) {
		int c = a/b;
		System.out.println("4.Division = "+c);
		return c;
	}
	int remainder(int a, int b) {
		int c = a%b;
		System.out.println("5.Remainder = "+ c);
		return c;
	}
	int circle_square(int a) {
		int area = (int)3.14*a*a;
		System.out.println("6.circle_square = "+ area);
		return area;
	}
	int volume(int a) {
		int volume = a*a*a;
		System.out.println("7.Volume = " +volume);
		return volume;
	}
	boolean equal(int a, int b) {
		if(a == b) {
			System.out.println("8.Numbers are equal");
			return true;
		}
		return false;
	}
	int greater(int a, int b) {
		if(a>b) {
			System.out.println("9."+a+" is greater than "+b);
			return a;
		}
		System.out.println("9."+b+ " is greater than "+ a);
		return b;
	}
	boolean Positive(int a) {
		if(a>0) {
			System.out.println("10."+a+ " is Positive");
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Operators opr = new Operators();
		opr.add(1, 2);
		opr.sub(5, 1);
		opr.multiply(3, 2);
		opr.div(3, 2);
		opr.remainder(10, 3);
		opr.circle_square(12);
		opr.volume(3);
		opr.equal(5,5);
		opr.greater(3, 1);
		opr.Positive(5);	
	}
}

