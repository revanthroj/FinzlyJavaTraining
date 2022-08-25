package hibernateWorkout;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Data.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Data data = session.load(Data.class, 3);
		System.out.println(data.getRollNo()+" "+data.getFirstName()+""+ data.getLastName()+" "+data.getClassName()+" "+data.getAge());
		
		session.close();
		System.out.println("Data fetched");
	}
}
