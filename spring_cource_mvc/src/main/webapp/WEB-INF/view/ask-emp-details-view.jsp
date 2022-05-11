<%@taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, please enter your details</h2>

<br>
<br>

<form:form action = "showDetails" modelAttribute = "employee">

  Name <form:input path = "name"/>
  <i> <form:errors path = "name"/> </i>
  <br><br>
  Surname <form:input path = "surname"/>
  <i> <form:errors path = "surname"/> </i>
  <br><br>
  Phone number <form:input path = "phoneNumber"/>
  <i> <form:errors path = "phoneNumber"/> </i>
  <br><br>
  Email <form:input path = "email"/>
  <i> <form:errors path = "email"/> </i>
  <br><br>
  Salary <form:input path = "salary"/>
  <i> <form:errors path = "salary"/> </i>
  <br><br>
  Department <form:select path = "department">
  <form:options items = "${employee.departments}"/>
                      <%--<form:option value = "Information Technology" label = "IT"/>
                      <form:option value = "Human Resources" label = "HR"/>
                      <form:option value = "Sales" label = "Sales"/>--%>
  </form:select>
  <br><br>
  Which car do you want? <br>
  <form:radiobuttons path = "carBrand" items = "${employee.carBrands}"/>
                      <%--BMW <form:radiobutton path = "carBrand" value = "BMW"/>
                      Audi <form:radiobutton path = "carBrand" value = "Audi"/>
                      Mercedes-Benz <form:radiobutton path = "carBrand" value = "Mercedes-Benz"/>--%>
  <br><br>
  Foreign language(s)
  <form:checkboxes path = "languages" items = "${employee.languageList}"/>
                      <%--EN <form:checkbox path = "languages" value = "English"/>
                      DE <form:checkbox path = "languages" value = "Deutch"/>
                      FR <form:checkbox path = "languages" value = "French"/>--%>
  <br><br>

  <input type = "submit" value = "OK">

</form:form>
                      <%--<form action = "showDetails" methods = "get">
                      <input type = "text" name = "employeeName"
                      placeholder = "Write your name"/>
                      <input type = "submit"/>
                      </form>--%>
</body>

</html>