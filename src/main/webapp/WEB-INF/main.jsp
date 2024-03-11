<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User, model.Movie, java.util.List" %>
<%
User loginUser = (User)session.getAttribute("loginUser");

List<Movie> movieList = (List<Movie>)application.getAttribute("movieList");

String errorMsg = (String)request.getAttribute("errorMsg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>おすすめ映画メイン</title>
</head>
<body>
<h1>おすすめ映画</h1>
<p><%= loginUser.getName() %><a href="Logout">ログアウト</a></p>
<p><a href="Main">更新</a></p>
<form action="Main" method="post">
	<p>タイトル：<input type="text" name="title"></p>
	<p>一言：<textarea name="comment"></textarea></p>
	<input type="submit" value="送信">
</form>
<% if (errorMsg != null){ %>
<p><%=errorMsg %></p>
<%} %>
<table border="1">
<% if (movieList.size() > 0) { %>
	<% for (Movie movie : movieList) { %>
		<tr>
			<td><%= movie.getName() %></td>
			<td><%= movie.getTitle() %></td>
			<td><%= movie.getComment() %></td>
		</tr>
	<% } %>
<% } %>
</table>
</body>
</html>