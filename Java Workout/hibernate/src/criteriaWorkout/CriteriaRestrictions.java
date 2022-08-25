package criteriaWorkout;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class CriteriaRestrictions {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(User.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		//Less Than Operation
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.lt("age", 21));
		System.out.println("Age less than 21 =>");
		List<User> list = criteria.list();
		for(User data : list) {
			System.out.println(data);
		}
		
		//equals Operation
		Criteria criteria1 = session.createCriteria(User.class);
		criteria1.add(Restrictions.eq("age", 21));
		System.out.println("Age equals to 21 =>");
		List<User> list1 = criteria1.list();
		for(User data : list1) {
			System.out.println(data);
		}
		
		// Less Than Operation
		Criteria criteria2 = session.createCriteria(User.class);
		criteria2.add(Restrictions.in("id", 1));
		System.out.println("Id is 1=>" + criteria2);
		List<User> list2 = criteria2.list();
		for (User data : list2) {
			System.out.println(data);
		}
		
		Criteria criteria3 = session.createCriteria(User.class);
		criteria3.add(Restrictions.between("id", 1,3));
		System.out.println("Id is between 1&3 =>" + criteria3);
		List<User> list3 = criteria3.list();
		for (User data : list3) {
			System.out.println(data);
		}
		
		Criteria criteria4 = session.createCriteria(User.class);
		criteria4.add(Restrictions.like("Name", "Revanth",MatchMode.ANYWHERE));
		System.out.println("If Revanth name Match in table =>" + criteria4);
		List<User> list4 = criteria4.list();
		for (User data : list4) {
			System.out.println(data);
		}
		
		
		session.close();
		System.out.println("-*-*-*-*-");
	}
}
