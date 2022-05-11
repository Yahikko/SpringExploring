package aop;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

  public static void main(String[] args) {
    System.out.println("Method main starts");
    AnnotationConfigApplicationContext context = new
        AnnotationConfigApplicationContext(MyConfig.class);

    UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
    String book = uniLibrary.returnBook();
    System.out.println(book);

    context.close();
    System.out.println("Method main ends");
  }
}
