package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class MapDemo {
    public static void main(String[] args)throws IOException {
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();

        // creating question
        Question que = new Question();
        que.setQuestionId(101);
        que.setQuestion("what is C++");



        //creating answer
        Answer ans = new Answer();
        ans.setAnswerId(343);
        ans.setAnswer("C++ is programming language");
        ans.setQue(que);

        que.setAns(ans);


        Question que1 = new Question();
        que1.setQuestionId(102);
        que1.setQuestion("does java supports multiple inheritance?");

        //creating answer
        Answer ans1 = new Answer();
        ans1.setAnswerId(432);
        ans1.setAnswer("NO! ");


        ans1.setQue(que1);
        que1.setAns(ans1);

        //session
        Session s = factory.openSession();
        Transaction t = s.beginTransaction();
//
//        s.save(que);
//        s.save(que1);
//        s.save(ans);
//        s.save(ans1);


        t.commit();

        Question que2=(Question)s.get(Question.class,101);
        System.out.println(que2.getQuestion());
        System.out.println(que2.getQuestionId());
//      System.out.println(que2.getAns().size());
        System.out.println(que2.getAns().getAnswer());

        //session close
        s.close();
        factory.close();


    }
}
