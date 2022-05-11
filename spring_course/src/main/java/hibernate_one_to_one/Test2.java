package hibernate_one_to_one;

import hibernate_one_to_one.entity.Details;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .addAnnotatedClass(Details.class)
        .buildSessionFactory();

    Session session = null;
    try {
//      session = factory.getCurrentSession();
//      Employee employee = new Employee(
//          "Misha", "Sidorov", "HR", 850);
//      Details details = new Details(
//          "London", "85543267", "mishanya@gmail.com");
//      session.beginTransaction();
//
//      employee.setDetails(details);
//      details.setEmployee(employee);
//
//      session.save(employee);
//
//      session.getTransaction().commit();
//      System.out.println("Done");

//      session = factory.getCurrentSession();
//      session.beginTransaction();
//
//      Details details = session.get(Details.class, 2);
//      System.out.println(details.getEmployee());
//
//      session.getTransaction().commit();
//      System.out.println("Done");

      session = factory.getCurrentSession();
      session.beginTransaction();

      Details details = session.get(Details.class, 1);
      details.getEmployee().setDetails(null);
      session.delete(details);

      session.getTransaction().commit();
      System.out.println("Done");
    } finally {
      session.close();
      factory.close();
    }
  }
}
