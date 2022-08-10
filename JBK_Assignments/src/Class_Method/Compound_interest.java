package Class_Method;

public class Compound_interest {
	void compound_interest(float p, double n, double R, double t) {
		double r = R/100;
		double b = (1+(r/n));
		double e = n*t;
		double c_int = (double) (p*Math.pow(b, e));
		System.out.println(c_int);
	}
}
