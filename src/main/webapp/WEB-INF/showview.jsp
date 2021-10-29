<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show</title>
	</head>
	<body>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<a href="/languages">
			home
		</a>
		<div>
			<h1><c:out value="${languageList.languageName}"/></h1>
			<p>Creator Name: <c:out value="${languageList.creatorName}"/></p>
			<p>Language Version: <c:out value="${languageList.languageVersion}"/></p>
			<a href="/languages/edit/${languageList.id}">Edit</a>
			<form action="/delete/${languageList.id}" method='POST'>
          		<input type="hidden" name="_method" value="DELETE">
				<input class="btn btn-danger" type="submit" value="DELETE">
          	</form>	
		</div>
	</body>
</html>
