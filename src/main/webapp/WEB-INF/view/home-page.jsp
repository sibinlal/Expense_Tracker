<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<body>
EXPENSE TRACKER HOME PAGE
<hr>

<form:form action="${pageContext.request.contextPath}/showSignUpPage">

<input type="submit" name="signUp" value="SIGNUP"/>

</form:form> <br><br>

<form:form action="${pageContext.request.contextPath}/ET/login">

<input type="submit" name="login" value="LOGIN"/>

</form:form>


</body>

</html>