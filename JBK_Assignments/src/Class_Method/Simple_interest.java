package Class_Method;

public class Simple_interest {
	void simple_interest(int p, float R, int t) {
		float r = R/100;
		float si = p*(1+(r*t));
		
		System.out.println(si);
	}
}
