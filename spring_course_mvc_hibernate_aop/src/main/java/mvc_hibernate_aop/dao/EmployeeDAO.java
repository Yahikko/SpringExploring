package mvc_hibernate_aop.dao;

import java.util.List;
import mvc_hibernate_aop.entity.Employee;

public interface EmployeeDAO {

  public List<Employee> getAllEmployees();

  public void saveEmployee(Employee employee);

  public Employee getEmployee(int id);

  public void deleteEmployee(int id);
}
