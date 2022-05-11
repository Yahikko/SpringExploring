package aop;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class University {

  private List<Student> students = new ArrayList<>();

  public void addStudents() {
    Student st1 = new Student("A", 4, 7.5);
    Student st2 = new Student("B", 2, 8.3);
    Student st3 = new Student("C", 1, 9.1);
    students.add(st1);
    students.add(st2);
    students.add(st3);
  }

  public List<Student> getStudents() {
    System.out.println("Начало работы метода getStudents");
    System.out.println("Information from method getStudents:");
    System.out.println(students);
    throw new IndexOutOfBoundsException();
//    return students;
  }
}
