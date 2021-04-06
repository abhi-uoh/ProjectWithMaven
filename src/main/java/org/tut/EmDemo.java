package org.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();

        Student student1 = new Student();
        student1.setId(101);
        student1.setName("ankit");
        student1.setCity("Lake Salt");

        Certificat ct = new Certificat();
        ct.setCourse("Maths");
        ct.setDuration("2 month");
        student1.setCerti(ct);

        Student student2 = new Student();
        student2.setId(102);
        student2.setName("Raj");
        student2.setCity("Vishrampur");

        Certificat ct1 = new Certificat();
        ct1.setCourse("xango");
        ct1.setDuration("3 month");
        student2.setCerti(ct1);

        Session s = factory.openSession();
        Transaction t = s.beginTransaction();

        //object save;

        s.save(student1);
        s.save(student2);

        t.commit();
        s.close();
        factory.close();


//        s.save(ct);





    }
}
