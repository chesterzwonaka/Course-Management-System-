<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:form="http://www.springframework.org/tags/form">
<head>
<meta charset="UTF-8">
<title>homepage</title>

<style type="text/css">

.error{
color:red;
position: fixed;
text-align: left;
margin-left: 30px;
}


</style>
<script type="text/javascript">
	function validateUserName() {
		var userName = document.getElementById("yn").value;

		// Check for minimum length
		if (userName.length < 5) {
			alert("Username should be at least 5 characters long");
			return false;
		}

		// Check for alphanumeric and special characters
		var regex = /^[a-zA-Z0-9_]+$/;
		if (!regex.test(userName)) {
			alert("Username can only contain letters, numbers, and underscores");
			return false;
		}

		// Check if it starts with a letter
		if (!isNaN(userName.charAt(0))) {
			alert("Username cannot start with a number");
			return false;
		}

		return true;
	}
</script>




</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr />
	<form:form action="process-homepage" method="post"
		modelAttribute="userInfo" onsubmit="return validateUserName()">
		<div align="center">
			<p>
				<label for="yn">Your name is:</label>
				<form:input path="userName" id="yn" />
				<form:errors path="userName" cssClass="error"/>
			</p>
			<p>
				<label for="cn">Your crush name is:</label>
				<form:input path="crushName" id="cn" />
				<form:errors path="crushName" cssClass="error"/>
			</p>
			
			<p>
			
			<form:checkbox path="termsAndConditions"/>
			<label> i agree that this is for fun and no hard feelings</label>
			<form:errors path="termsAndConditions" cssClass="error"/>
			</p>
			<input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html>
