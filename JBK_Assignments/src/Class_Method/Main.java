package Class_Method;

public class Main {
	public static void main(String[] args) {
		Percentage per = new Percentage();
		per.mark(70,55,45,30,90);
		Cube cu = new Cube();
		cu.cal_cube(3);
		Simple_interest si = new Simple_interest();
		si.simple_interest(10000, 3, 5);
		Compound_interest CI = new Compound_interest();
		CI.compound_interest(10000, 365, 3.875, 7.5);
		}
}
