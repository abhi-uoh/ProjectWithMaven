package cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.tut.Student;

public class FirstCaching {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();

        Session s = factory.openSession();
        Transaction t = s.beginTransaction();
        Student student = s.get(Student.class,997);
        System.out.println(student);

        System.out.println("working something....>>>>>>>>>>>>>>>>>");

        Student student1 = s.get(Student.class,997);
        System.out.println(student1);
        System.out.println(s.contains(student1));

        t.commit();
        s.close();
        factory.close();
    }


}
