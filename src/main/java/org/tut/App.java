package org.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
//import javax.security.auth.login.Configuration;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        Configuration cfg = new Configuration();
        //
        //cfg.configure("/Users/abhi/Desktop/Programs/ProjectWithMaven/src/main/resources/hibernate.cfg.xml");
        SessionFactory factory = cfg.configure().buildSessionFactory();
//        factory.getCurrentSession();
//        System.out.println(factory);
//        System.out.println(factory.isClosed());

        Student st = new Student();
        st.setId(103);
        st.setName("T Rahul");
        st.setCity("Mongol");
        System.out.println(st);

        //address object
        Address ad = new Address();
        ad.setStreet("Tilakpur");
        ad.setCity("Gachiboli");
        ad.setOpen(true);
        ad.setAdddedDate(new Date());
        ad.setX(1234.234);
//        ad.setImage();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("DONE!!!!");



    }
}
