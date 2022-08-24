package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate_Update {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(User.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		User usr = new User();
		usr.setId(1);
		usr.setName("Revanth");
		usr.setAge(22);
		
		session.update(usr);		
		tr.commit();
		
		session.close();
		System.out.println("end");
		
	}
	
}
