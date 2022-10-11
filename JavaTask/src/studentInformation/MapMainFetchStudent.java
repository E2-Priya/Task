package studentInformation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class MapMainFetchStudent {
public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("Mhibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		System.out.println("Done");
		
		/*String hql = "from ";
		Query query = session.createQuery(hql);
		
		System.out.println("hello");

		List<Subject> s = query.list();
		
		for (Subject sub: s) {
			
			System.out.println(s.get());
		
		}*/
		String hql = "from MapSubject";
		Query query = session.createQuery(hql);
		
		System.out.println("hello");

		List<MapSubject> s = query.list();
		
		for (MapSubject ss: s) {
			
			System.out.println(ss);
}
}}

