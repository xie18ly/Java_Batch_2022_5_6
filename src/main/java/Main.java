import AssignmentFour.ReaderThread;
import AssignmentFour.WriterThread;
import AssignmentOne.DoSomething;
import AssignmentOne.MergeTwoArray;
import AssignmentOne.SecondLargest;
import AssignmentThree.*;
import AssignmentTwo.Counter;
import AssignmentTwo.Criteria;
import Week4.CRUDTest;
import Week4.Hibernate.AccountEntity;
import Week4.Hibernate.EmployeeEntity;
import Week4.Hibernate.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws SQLException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        //Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("demo-user@mail.com");
        emp.setFirstName("demo");
        emp.setLastName("user");

        //Save Employee
        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
