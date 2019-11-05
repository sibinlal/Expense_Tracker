<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<body>
REGISTRATION PAGE.
<br><br>

<form:form action="register" modelAttribute="customer" method="POST">
FIRST NAME : <input type="text" name="firstName" path="firstName"><br><br>
LAST NAME  : <input type="text" name="lastName" path="lastName"><br><br>
EMAIL      : <input type="email" name="email" path="email"><br><br>
USER NAME  : <input type="text" name="userName" path="userName"><br><br>
PASSWORD   : <input type="password" name="password" path="password"><br><br>

<input type="submit" value="REGISTER"/> 
</form:form>
</body>

</html>