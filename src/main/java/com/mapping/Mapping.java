package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Mapping {

    public static void main(String[] args)throws ClassNotFoundException {

        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setEid(120);
        e2.setEid(121);

        e1.setName("Abhinav Gautam");
        e2.setName("Anjali Singh");

        Project p1 =new Project();
        Project p2 = new Project();

        p1.setPid(1);
        p2.setPid(2);


        List<Employee>list1 = new ArrayList<Employee>();
        List<Project>list2 = new ArrayList<Project>();

        list1.add(e1);
        list1.add(e2);

        list2.add(p1);
        list2.add(p2);

        e1.setProjects(list2);
        p2.setEmps(list1);


        p1.setName("DLP");
        p2.setName("BOB");

        //object save;

        Session s = factory.openSession();
        Transaction t = s.beginTransaction();
        s.save(e1);
        s.save(e2);

        s.save(p1);
        s.save(p2);

        t.commit();
        s.close();
        factory.close();
    }
}
