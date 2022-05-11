package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);

//    Person myPerson = context.getBean("personBean", Person.class);
//    myPerson.callYourPet();
//    context.close();
//    Pet cat1 = context.getBean("catBean", Pet.class);
//    Pet cat2 = context.getBean("catBean", Pet.class);
//
//    System.out.println(cat1==cat2);
//    cat.say();

    Person person = context.getBean("personBean", Person.class);
    System.out.println(person.getLastName());
    System.out.println(person.getAge());

    context.close();
  }
}
