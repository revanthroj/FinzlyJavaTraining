package hibernateWorkout;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class WriteData {	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Data.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Data data = new Data();
		data.setRollNo(3);
		data.setFirstName("Nitheesh");
		data.setLastName("Mathi");
		data.setClassName("MCT");
		data.setAge(22);
		
		session.save(data);
		tr.commit();
		
		session.close();
		System.out.println("Data Inserted");
	}
}
