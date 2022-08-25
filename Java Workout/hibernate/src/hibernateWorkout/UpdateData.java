package hibernateWorkout;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UpdateData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Data.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Data data = new Data();
		data.setRollNo(3);
		data.setFirstName("Deepan");
		data.setLastName("Venkat");
		data.setClassName("Viscom");
		data.setAge(20);
		
		session.update(data);		
		tr.commit();
		
		session.close();
		System.out.println("Data updated");
	}
}
