<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>



<!DOCTYPE html>
<html xmlns:form="http://www.springframework.org/tags/form">
<head>
<meta charset="UTF-8">
<title>registrationpage</title>
</head>
<body>
	<h1 align="center">Register Here</h1>
	<hr />
	<form:form action="process-registration" method="post"
		modelAttribute="userRegistrationInfo">
		<div align="center">
			<p>
				<label for="n">name:</label>
				<form:input path="name" id="n" />
			</p>
			<p>
				<label for="un">userName:</label>
				<form:input path="userName" id="un" />
			</p>
			<label for="pas">password</label>
			<form:password path="password" id="pas" />
			<br /> <br /> <label for="coun">country:</label>
			<form:select path="country" id="coun">
				<form:option value="" label="select a country" />
				<form:option value="RSA" label="South Africa" />
				<form:option value="afghanistan" label="Afghanistan" />
				<form:option value="albania" label="Albania" />
				<form:option value="algeria" label="Algeria" />
				<form:option value="andorra" label="Andorra" />
				<form:option value="angola" label="Angola" />
				<form:option value="argentina" label="Argentina" />
				<form:option value="australia" label="Australia" />
				<form:option value="austria" label="Austria" />
				<form:option value="brazil" label="Brazil" />
				<form:option value="canada" label="Canada" />
				<form:option value="china" label="China" />
				<form:option value="egypt" label="Egypt" />
				<form:option value="france" label="France" />
				<form:option value="germany" label="Germany" />
				<form:option value="india" label="India" />
				<form:option value="japan" label="Japan" />
				<form:option value="mexico" label="Mexico" />
				<form:option value="nigeria" label="Nigeria" />
				<form:option value="russia" label="Russia" />
				<form:option value="south_korea" label="South Korea" />
				<form:option value="spain" label="Spain" />
				<form:option value="switzerland" label="Switzerland" />
				<form:option value="united_kingdom" label="United Kingdom" />
				<form:option value="united_states" label="United States" />
			</form:select>
			<br /> <label for="hobbies">Hobbies:</label>
			<!-- Assuming "userRegistrationInfo" is the attribute name for your RegistrationInfoDTO object -->
			<form:checkboxes items="${hobbyOptions}" path="hobby" />
			<br /> <label for="gender">Gender:</label>
			<form:radiobuttons path="gender" items="${genderOptions}" />
			<br /> <input type="submit" value="register" />
		</div>
	</form:form>
</body>
</html>