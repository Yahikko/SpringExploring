package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Child.class)
        .addAnnotatedClass(Section.class)
        .buildSessionFactory();

    Session session = null;

    try {
//      session = factory.getCurrentSession();
//
//      Section section1 = new Section("Football");
//      Child child1 = new Child("A", 5);
//      Child child2 = new Child("B", 7);
//      Child child3 = new Child("C", 6);
//      section1.addChild(child1);
//      section1.addChild(child2);
//      section1.addChild(child3);
//
//      session.beginTransaction();
//
//      session.save(section1);
//
//      session.getTransaction().commit();
//      System.out.println("Done!");
      //**********************************************************

//      session = factory.getCurrentSession();
//
//      Section section2 = new Section("Volleyball");
//      Section section3 = new Section("Chess");
//      Section section4 = new Section("Math");
//      Child child4 = new Child("D", 10);
//      child4.addSection(section2);
//      child4.addSection(section3);
//      child4.addSection(section4);
//
//      session.beginTransaction();
//
//      session.save(child4);
//
//      session.getTransaction().commit();
//      System.out.println("Done!");
      //**********************************************************

//      session = factory.getCurrentSession();
//
//      session.beginTransaction();
//
//      Section section = session.get(Section.class, 1);
//
//      System.out.println(section);
//      System.out.println(section.getChildren());
//
//      session.getTransaction().commit();
//      System.out.println("Done!");
      //**********************************************************

//      session = factory.getCurrentSession();
//      session.beginTransaction();
//
//      Child child = session.get(Child.class, 5);
//      System.out.println(child);
//      System.out.println(child.getSections());
//
//      session.getTransaction().commit();
//      System.out.println("Done!");
      //**********************************************************

//      session = factory.getCurrentSession();
//      session.beginTransaction();
//
//      Section section = session.get(Section.class, 1);
//      session.delete(section);
//
//      session.getTransaction().commit();
//      System.out.println("Done!");
      //**********************************************************

//      session = factory.getCurrentSession();
//
//      Child child1 = new Child("E", 12);
//      Child child2 = new Child("F", 11);
//      Section section = new Section("Dance");
//
//      section.addChild(child1);
//      section.addChild(child2);
//
//      session.beginTransaction();
//
//      session.persist(section);
//
//      session.getTransaction().commit();
//      System.out.println("Done!");
      //**********************************************************

      session = factory.getCurrentSession();

      session.beginTransaction();

      Child child = session.get(Child.class, 6);

      session.delete(child);

      session.getTransaction().commit();
      System.out.println("Done!");
    } finally {
      session.close();
      factory.close();
    }
  }
}