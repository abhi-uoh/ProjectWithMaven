package org.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; //important

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
//import javax.security.auth.login.Configuration;

public class App
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "Hello World!" );


        Configuration cfg = new Configuration();

        //cfg.configure("/Users/abhi/Desktop/Programs/ProjectWithMaven/src/main/resources/hibernate.cfg.xml");

        SessionFactory factory = cfg.configure().buildSessionFactory();
//        factory.getCurrentSession();
//        System.out.println(factory);
//        System.out.println(factory.isClosed());

        Student st = new Student();
//      st.setId(104);
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
        FileInputStream fis = new FileInputStream("src/main/java/11.png");
        byte[] data = new byte[fis.available()];
        ad.setImage(data);

        //object of testing
        testing ts = new testing();
        //ts.getSno();
        ts.setName("Anjali");

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        session.save(ts);
        tx.commit();
        session.close();
        System.out.println("DONE!!!!");

    }
}
