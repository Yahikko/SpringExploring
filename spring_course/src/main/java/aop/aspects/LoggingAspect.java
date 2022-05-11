package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

  @Before("aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    System.out.println(signature);
    System.out.println(signature.getMethod());
    System.out.println(signature.getReturnType());
    System.out.println(signature.getName());

    if (signature.getName().equals("addBook")) {
      Object[] objects = joinPoint.getArgs();
      for (Object o : objects) {
        if (o instanceof Book) {
          Book myBook = (Book) o;
          System.out.println("Информация о книге: " + "\n" + myBook.getName()
              + "\n" + myBook.getAuthor() + "\n" + myBook.getYearOfPublication());
        } else if (o instanceof String) {
          System.out.println("Книгу добавляет " + o);
        }
      }
    }
    System.out.println("beforeGetBookAdvice: логирование попытки получить книгу или журнал");
    System.out.println("----------------------------------------");
  }

//  @Pointcut("allMethods() && !returnMagazinePointcut()")
//  private void allMethodsExceptReturnMagazine() {
//  }
//
//  @Pointcut("execution(* aop.UniLibrary.*(..))")
//  private void allMethods() {
//  }
//
//  @Pointcut("execution(public void aop.UniLibrary.returnMagazine()) ")
//  private void returnMagazinePointcut() {
//  }
//
//  @Before("allMethodsExceptReturnMagazine()")
//  private void beforeAdvice() {
//    System.out.println("Test Log");
//  }

//  @Pointcut("execution(* aop.UniLibrary.get*())")
//  private void getMethodsFromUniLibrary() {
//  }
//
//  @Pointcut("execution(* aop.UniLibrary.return*())")
//  private void returnMethodsFromUniLibrary() {
//  }
//
//  @Pointcut("getMethodsFromUniLibrary() || returnMethodsFromUniLibrary()")
//  private void getAndReturnMethodsFromUniLibrary() {
//  }
//
//  @Before("getMethodsFromUniLibrary()")
//  public void beforeGetLoggingAdvice() {
//    System.out.println("beforeGetLoggingAdvice: writing Log #1");
//  }
//
//  @Before("returnMethodsFromUniLibrary()")
//  public void beforeReturnLoggingAdvice() {
//    System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//  }
//
//  @Before("getAndReturnMethodsFromUniLibrary()")
//  public void beforeGetAndReturnMethodsFromUniLibrary() {
//    System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//  }
}
