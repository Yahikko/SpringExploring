package hibernate_test;

import hibernate_test.entity.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory();

    try {
      Session session = factory.getCurrentSession();

      session.beginTransaction();

//      List<Employee> employeeList = session
//          .createQuery("FROM Employee")
//          .getResultList();

      List<Employee> employeeList = session
          .createQuery("FROM Employee WHERE name = 'Alexandr'"
              + "AND salary > 650")
          .getResultList();

      for (Employee e : employeeList) {
        System.out.println(e);
      }

      session.getTransaction().commit();

      System.out.println("Done");
    } finally {
      factory.close();
    }
  }
}
