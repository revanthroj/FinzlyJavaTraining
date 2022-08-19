package comparable;

public class Student implements Comparable<Student>{
	int rollNo;
	@Override
	public String toString() {
		return "A [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

	String name;
	int age;
	
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.name);
	}
	
	
}
