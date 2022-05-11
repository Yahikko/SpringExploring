package hibernate_one_to_one;

import hibernate_one_to_one.entity.Details;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .addAnnotatedClass(Details.class)
        .buildSessionFactory();

    Session session = null;
    try {
//      Session session = factory.getCurrentSession();
//      Employee employee = new Employee(
//          "Zaur", "Tregulov", "IT", 500);
//      Details details = new Details(
//          "Baku", "123456789", "zaurtregulov@gmail.com");
//
//      session.beginTransaction();
//      employee.setDetails(details);
//      session.save(employee);
//      session.getTransaction().commit();
//      System.out.println("Done");

//      Session session = factory.getCurrentSession();
//      Employee employee = new Employee(
//          "Oleg", "Smirnov", "Sales", 700);
//      Details details = new Details(
//          "Moscow", "987654321", "olejka@gmail.com");
//
//      session.beginTransaction();
//      employee.setDetails(details);
//      session.save(employee);
//      session.getTransaction().commit();
//      System.out.println("Done");

//      session = factory.getCurrentSession();
//
//      session.beginTransaction();
//
//      Employee employee = session.get(Employee.class, 10);
//      System.out.println(employee.getDetails());
//
//      session.getTransaction().commit();
//      System.out.println("Done");

      session = factory.getCurrentSession();

      session.beginTransaction();

      Employee employee = session.get(Employee.class, 2);
      System.out.println(employee.getDetails());

      session.delete(employee);

      session.getTransaction().commit();
      System.out.println("Done");
    } finally {
      session.close();
      factory.close();
    }
  }
}
