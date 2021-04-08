package SQL;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.tut.Student;

import javax.management.Query;

public class SQLKury {
    public static void main(String[] args) {
        org.hibernate.cfg.Configuration cfg = new Configuration();
        SessionFactory factory = cfg.configure().buildSessionFactory();

        Session s = factory.openSession();
        Transaction t = s.beginTransaction();

        String q = "select * from student";
        NativeQuery nq = s.createSQLQuery(q);
        List<Object[]> list = nq.list();

        for (Object[] student : list) {
            System.out.println(Arrays.deepToString(student));
            System.out.println(student[4] + "  " + student[3]);
            s.close();
            factory.close();
        }
    }
}
