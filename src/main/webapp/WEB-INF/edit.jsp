<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Edit Book</h1>
		<a href="/languages">
			Home
		</a>
		<form action="/delete/${languageList.id}" method='POST'>
        	<input type="hidden" name="_method" value="DELETE">
			<input class="btn btn-danger" type="submit" value="DELETE">
        </form>
		<form class="formIndex" action="/update/language/${ languageList.id }" method = 'POST'>
			<div class="conContainerForm">
                <div class="containerFormData">
                	<input class="formInput" type="hidden" name="id" id="id" value="${ languageList.id }">
                    <label class="formLabel" for="editlanguageName">
                        Name
                    </label>
                    <input class="formInput" type="text" name="editlanguageName" id="editlanguageName" value="${ languageList.languageName }">
                </div>
                <div class="containerFormData">
                    <label class="formLabel" for="editcreatorName">
                        Creator 
                    </label>
                    <input class="formInput" type="text" name="editcreatorName" id="editcreatorName" value="${ languageList.creatorName }">
                </div>
                <div class="containerFormData">
                    <label class="formLabel" for="editlanguageVersion">
                        Version 
                    </label>
                    <input class="formInput" type="text" name="editlanguageVersion" id="editlanguageVersion" value="${ languageList.languageVersion }">
                </div>
                <input class="submitButton" type="submit" value="Submit">
           	</div>
		</form>
	</body>
</html>