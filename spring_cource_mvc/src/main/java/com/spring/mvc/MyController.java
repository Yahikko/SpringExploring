package com.spring.mvc;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/emp") - изменяем ссылку по умолчанию для доступа к станице
public class MyController {

  @RequestMapping("/")
  public String showFirstView() {
    return "first-view";
  }

  @RequestMapping("/askDetails")
  public String askEmployeeDetails(Model model) {
//    Employee employee = new Employee();
//    employee.setName("Ivan");
//    employee.setSurname("Petrov");
//    employee.setSalary(500);
    model.addAttribute("employee", new Employee() /*employee*/ );
    return "ask-emp-details-view";
  }

  //Проверяем наличие ошибки с помощью BindingResult
  @RequestMapping("/showDetails")
  public String showEmployeeDetails(@Valid @ModelAttribute("employee")
      Employee employee, BindingResult bindingResult) {
    if (bindingResult.hasErrors()){
      return "ask-emp-details-view";
    }
//    employee.setName("Mr. " + employee.getName());
    return "show-emp-details-view";
  }

//Третий вариант с адекватным изменением входных параметров
//  @RequestMapping("/showDetails")
//  public String showEmployeeDetails(Model model, @RequestParam("employeeName") String employeeName) {
//    employeeName = "Mr. " + employeeName + "!";
//    model.addAttribute("nameAttribute", employeeName);
//    return "show-emp-details-view";
//  }

//Второй вариант с не очень удобным изменением входных параметров
//  @RequestMapping("/showDetails")
//  public String showEmployeeDetails(HttpServletRequest request, Model model) {
//    String empName = request.getParameter("employeeName");
//    empName = "Mr. " + empName;
//    model.addAttribute("nameAttribute", empName);
//    return "show-emp-details-view";
//  }

//Самый первый вариант, имеющий только ссылку на страницу show-emp-details-view
//  @RequestMapping("/showDetails")
//  public String showEmployeeDetails() {
//    return "show-emp-details-view";
//  }

}
