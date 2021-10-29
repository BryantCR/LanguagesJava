<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>New Book</h1>
		<form:form action="/books" method="post" modelAttribute="book">
		    <p>
		        <form:label path="title">Title</form:label>
		        <form:input path="title"/>
		    </p>
		    <form:errors path="title"/>
		    <p>
		        <form:label path="description">Description</form:label>
		        <form:textarea path="description"/>
		    </p>
		        <form:errors path="description"/>
		    <p>
		        <form:label path="language">Language</form:label>
		        <form:input path="language"/>
		    </p>
		        <form:errors path="language"/>
		    <p>
		        <form:label path="numberOfPages">Pages</form:label>    
		        <form:input type="number" path="numberOfPages"/>
		    </p>  
		        <form:errors path="numberOfPages"/>   
		    <input type="submit" value="Submit"/>
		</form:form> 
	</body>
</html>