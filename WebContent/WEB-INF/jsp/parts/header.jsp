<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.UserInfoBean" %>
<%
//セッションスコープからユーザ情報を取得
UserInfoBean userInfo = (UserInfoBean) session.getAttribute("userInfo");
%>
<div class="Header">
	<div class="Logo">8tana</div>
	<div id="nav-drawer">
		<input id="nav-input" type="checkbox" class="nav-unshown">
		<label id="nav-open" for="nav-input"><div class="Menu">≡</div></label>
		<label class="nav-unshown" id="nav-close" for="nav-input"></label>
		<div id="nav-content">ここに中身を入れる</div>
	</div>
	<div class="LoginUser">
		<div class="Username"><%= userInfo.getStUserName() %></div>
		<div class="Icon"><img src="<%= userInfo.getStIconURL() %>" width="30" height="30"></div>
	</div>
</div>
<div class="HiddenHeader"></div>
<div style="width: 100%; height: 50px; background-color: #0000FF;">
	<div class="Menu">≡</div>
</div>