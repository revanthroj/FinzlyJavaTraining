package Class_Method;

public class Percentage {
	void mark(int a1, int a2, int a3, int a4, int a5) {
		int[] m = {a1,a2,a3,a4,a5};
		for(int i = 0; i<5;i++) {
			if(m[i]>= 60) {
				System.out.println(m[i]+" -> First division");
			}
			if(m[i]>=50 && m[i]<=59) {
				System.out.println(m[i]+" -> Second devision");
			}
			if(m[i]>=40 && m[i]<=49) {
				System.out.println(m[i]+" -> Third division");
			}
			if(m[i]<40) {
				System.out.println(m[i]+" -> Fail");
			}
		}
	}
}
