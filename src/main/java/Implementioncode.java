import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Implementioncode {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();

        Session s = factory.openSession();
        Transaction t = s.beginTransaction();

        //s.save(student1);
//      s.save(student2);

        t.commit();
        s.close();
        factory.close();
    }
}
