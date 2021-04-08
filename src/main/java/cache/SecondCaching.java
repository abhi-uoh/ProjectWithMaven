package cache;

//import net.sf.ehcache.hibernate.EhCacheRegionFactory;
//import org.hibernate.cache.ehcache.EhCacheRegionFactory

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.tut.Student;

public class SecondCaching {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();

        Session s1= s1 = factory.openSession();

        System.out.println("_______________________________________________________________________________");

        Student student1 = s1.get(Student.class,990);
        System.out.println(student1);
        s1.close();



        System.out.println("_______________________________________________________________________________");

        Session s2 = factory.openSession();
        Student student2 =s2.get(Student.class,990);
        System.out.println(student2);
        s2.close();

        //s.save(student1);
        //s.save(student2);

        factory.close();


    }
}
