<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Quản lý sinh viên</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="../resources/css/dashboard.css" rel="stylesheet">
</head>
<body>
	<tiles:insertAttribute name="header" />
	<div class="container-fluid">
		<div class="row"></div>
	</div>
	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="body" />
</body>
</html>