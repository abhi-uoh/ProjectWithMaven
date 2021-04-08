package hql;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.tut.Student;
import com.map.*;

import java.awt.geom.QuadCurve2D;
import java.util.Arrays;
import java.util.List;

public class HqlMain {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();

        Session s = factory.openSession();
        Transaction t = s.beginTransaction();
//      <!_______________________________________________________________________________!>

        //Hql Querry
//        String query ="from Student where city ='Hyderabad'";
        String query ="from Student as s where s.city =:x and s.name=:y"; // we can retrieve the value by setting variable

        Query q =s.createQuery(query);

        q.setParameter("x","Hyderabad"); // retireving value dynamically
        q.setParameter("y","Kazi");

        List<Student> list=q.list();

        for(Student student:list)
        {
            System.out.println(student.getName()+ "  | "+ student.getCerti()+" | "+ student.getCity());
        }

        System.out.println("_______________________________________________________________________");
//        Query q2=s.createQuery("delete from Student where city=:c");
//        q2.setParameter("c","munger");
//
//        int r =q2.executeUpdate();
//        System.out.println("Deleted:");
//        System.out.println(r);

        Query q2 = s.createQuery("update Student set city=:x where  name=:y");
        q2.setParameter("x","Bengal");
        q2.setParameter("y","Mark");

        int r = q2.executeUpdate();
        System.out.println(r+ "Object Updated");

//        s.save(student1);
//        s.save(student2);
//
//        Join Query
        System.out.println("------------------------------------------------------------------------");

        Query q3 = s.createQuery("select q.question,q.questionId from Question as q INNER JOIN q.ans as a");
        List<Object[]>list3=q3.getResultList();
        for(Object[]arr:list3){
            System.out.println(Arrays.toString(arr));
        }

        t.commit();
        s.close();
        factory.close();
    }
}
