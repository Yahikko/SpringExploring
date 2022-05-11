package hibernate_one_to_many_bi.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String departmentName;

  @Column(name = "max_salary")
  private int maxSalary;

  @Column(name = "min_salary")
  private int minSalary;

  @OneToMany(cascade = CascadeType.ALL,
      mappedBy = "department",
      fetch = FetchType.EAGER)
  private List<Employee> employees;

  public Department() {
  }

  public Department(String departmentName, int maxSalary, int minSalary) {
    this.departmentName = departmentName;
    this.maxSalary = maxSalary;
    this.minSalary = minSalary;
  }

  public void addEmployeeToDepartment(Employee employee) {
    if (employees == null) {
      employees = new ArrayList<>();
    }
    employees.add(employee);
    employee.setDepartment(this);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public int getMaxSalary() {
    return maxSalary;
  }

  public void setMaxSalary(int maxSalary) {
    this.maxSalary = maxSalary;
  }

  public int getMinSalary() {
    return minSalary;
  }

  public void setMinSalary(int minSalary) {
    this.minSalary = minSalary;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  @Override
  public String toString() {
    return "Department{" +
        "id=" + id +
        ", departmentName='" + departmentName + '\'' +
        ", maxSalary=" + maxSalary +
        ", minSalary=" + minSalary +
        '}';
  }
}
