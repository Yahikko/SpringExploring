package mvc_hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

  @Around("execution(* mvc_hibernate_aop.dao.*.*(..))")
  public Object aroundAllRepositoryMethodsAdvice(
      ProceedingJoinPoint point) throws Throwable {
    MethodSignature methodSignature = (MethodSignature) point.getSignature();
    String methodName = methodSignature.getName();
    System.out.println("Begin of " + methodName);
    Object target = point.proceed();
    System.out.println("End of " + methodName);
    return target;
  }
}
