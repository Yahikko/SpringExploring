package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

  @Around("execution(public String returnBook())")
  public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint point) throws Throwable {
    System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

//    long begin = System.currentTimeMillis();
    Object targetResult = null;
    try {
      targetResult = point.proceed();
    } catch (Exception e) {
      System.out.println("aroundReturnBookLoggingAdvice: исключение " + e + " было залогировано");
      throw e;
    }

//    targetResult = "Преступление и наказание";
//    long end = System.currentTimeMillis();
    System.out.println("aroundReturnBookLoggingAdvice: в библиотеку вернули книгу");
//    System.out.println(end - begin);
    return targetResult;
  }
}
