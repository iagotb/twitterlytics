<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/resources/css/twitterlytics.css" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Timeline</title>
</head>
<body>
<center><h1>Twitter</h1></center>
<c:forEach items="${twittList}" var="tweet" >
		<div class="profile">
			<img alt="" src="${tweet.profileImageUrl}" height="80px" width="80px">
		</div>
		<div class="tweet">
			<span>${tweet.text}</span>
			<span>${tweet.fromUser}</span>			
		</div>
		<br style="clear: left;" />	
</c:forEach>
</body>
</html>