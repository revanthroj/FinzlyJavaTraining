package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_Read {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(User.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		User usr1 = session.load(User.class, 1);
		User usr2 = session.load(User.class, 2);
		System.out.println(usr1.getId()+" "+usr1.getName()+" "+usr1.getAge());
		System.out.println(usr2.getId()+" "+usr2.getName()+" "+usr2.getAge());

		session.close();
		System.out.println("end");
	}
}
