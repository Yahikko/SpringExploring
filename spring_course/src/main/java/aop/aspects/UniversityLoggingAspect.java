package aop.aspects;

import aop.Student;
import java.util.List;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//  @Before("execution(* getStudents())")
//  public void beforeGetStudentsLoggingAdvice() {
//    System.out.println("beforeGetStudentsLoggingAdvice: логируем получение "
//        + "списка студентов перед методом getStudents");
//  }
//
//  @AfterReturning(pointcut = "execution(* getStudents())",
//      returning = "students")
//  public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//    {
//      Student student1 = students.get(0);
//      String name = student1.getName();
//      name = "Mr. " + name;
//      student1.setName(name);
//      double avgGrade = student1.getAvgGrade();
//      avgGrade++;
//      student1.setAvgGrade(avgGrade);
//    }
//    System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение "
//        + "списка студентов после работы метода getStudents");
//
//  }

//  @AfterThrowing(pointcut = "execution(* getStudents())",
//      throwing = "exception")
//  public void afterThrowing(Throwable exception) {
//    System.out.println("afterThrowing: логируем выброс исключения " + exception);
//  }

  @After("execution(* getStudents())")
  public void afterAdvice() {
    System.out.println("afterAdvice: логируем finally окончание метода");
  }
}
