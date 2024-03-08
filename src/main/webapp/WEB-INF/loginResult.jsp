<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User loginUser = (User)session.getAttribute("loginUser");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>おすすめ映画ログイン</title>
</head>
<body>
<h1>おすすめ映画ログイン</h1>
<% if (loginUser != null) { %>
<p>ログインに成功しました</p>
<p>ようこそ<%= loginUser.getName() %>さん</p>
<a href="Main">おすすめ映画投稿・閲覧へ</a>
<% } else { %>
<p>ログインに失敗しました</p>
<a href="Login">TOPへ</a>
<% } %>
</body>
</html>