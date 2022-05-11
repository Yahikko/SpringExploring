package hibernate_test;

import hibernate_test.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory();

    try {
      Session session = factory.getCurrentSession();
      Employee emp1 = new Employee("Alexandr", "Ivanov",
          "IT", 700);
      session.beginTransaction();
      session.save(emp1);
      session.getTransaction().commit();

      System.out.println(emp1);
      System.out.println("Done");
    } finally {
      factory.close();
    }
  }
}
