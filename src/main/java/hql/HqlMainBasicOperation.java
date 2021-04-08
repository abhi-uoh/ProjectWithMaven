//package hql;
//
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.tut.Student;
//
//import java.util.List;
//
//public class HqlMainBasicOperation {
//    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        SessionFactory factory = cfg.configure().buildSessionFactory();
//
//        Session s = factory.openSession();
//        Transaction t = s.beginTransaction();
//
//        //Hql Querry
////        String query ="from Student where city ='Hyderabad'";
//        String query ="from Student as s where s.city =:x and s.name=:y"; // we can retrieve the value by setting variable
//
//        Query q =s.createQuery(query);
//
//        q.setParameter("x","Hyderabad"); // retireving value dynamically
//        q.setParameter("y","Kazi");
//
//        List<Student> list=q.list();
//
//        for(Student student:list)
//        {
//            System.out.println(student.getName()+ "  | "+ student.getCerti()+" | "+ student.getCity());
//        }
////        s.save(student1);
////        s.save(student2);
//
//        t.commit();
//        s.close();
//        factory.close();
//    }
//}
