package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {

  //  @Autowired
//  @Qualifier("catBean")
  private Pet pet;
  @Value("${person.lastName}")
  private String lastName;
  @Value("${person.age}")
  private int age;

//  @Autowired
//  public Person(@Qualifier("dog") Pet pet) {
//    System.out.println("Person bean is created");
//    this.pet = pet;
//  }

  public Person(Pet pet) {
    System.out.println("Person bean is created");
    this.pet = pet;
  }

  public Person() {
    System.out.println("Person bean is created");
  }

  public Pet getPet() {
    return pet;
  }

//  @Autowired
//  public void setPet(Pet pet) {
//    System.out.println("Class Person: set pet");
//    this.pet = pet;
//  }

  public void callYourPet() {
    System.out.println("Hello, my lovely Pet!");
    pet.say();
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    System.out.println("Class Person: set last name");
    this.lastName = lastName;
  }

  public int getAge() {
    System.out.println("Class Person: set age");
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
