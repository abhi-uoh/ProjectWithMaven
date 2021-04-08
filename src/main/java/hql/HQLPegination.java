package hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.tut.Student;

public class HQLPegination {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();

        Session s = factory.openSession();
        Transaction t = s.beginTransaction();
        Query q =s.createQuery("from Student");

        //implementing hibernate using hiberante

        q.setFirstResult(0);
        q.setMaxResults(1000);
        List<Student> list =q.list();
        for(Student student : list)
        {
            System.out.println(student.getId()+" "+ student.getName()+"  "+student.getCity());
        }

        s.close();
        factory.close();



    }
}
