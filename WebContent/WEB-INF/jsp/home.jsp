<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.UserInfoBean" %>
<%
//セッションスコープからユーザ情報を取得
UserInfoBean userInfo = (UserInfoBean) session.getAttribute("userInfo");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width">
<title>Quetana</title>
<link rel="stylesheet" type="text/css" href="/quetana/css/main.css">
</head>
<body>
<div class="Header"><font color="#FFFFFF" size="5"></font>
<table width="100%" border="1">
<tr>
<td align="center" width="150px"><font color="#FFFFFF" size="5">Quetana</font></td>
<td></td>
<td align="center"  width="100px" style="vertical-align:middle;"><img src="/quetana/img/r-zoon.png" width="20" height="20"><%= userInfo.getIdUser() %></td>
<td align="center"  width="50px">三</td>
</tr>
</table>
</div>
<div class="Contents" id="main_div">
<font size="6" ><br></font>
<table id="main_tbl" border="1">
<tr><td align="left"><font color="#FFFFFF" size="3">タイムライン</font></td></tr>
<tr><td align="center">
<input id="submit_btn" type="submit" id="button" name="all" value="すべて">
<input id="submit_btn" type="submit" id="button" name="event" value="ライブ/イベント">
<input id="submit_btn" type="submit" id="button" name="member" value="メンバー募集">
</td></tr>
<tr><td align="center" bgcolor="#FFFFFF">
<table id="post_tbl" border="1">
<tr>
<td rowspan="2" width="15%">アイコン</td>
<td width="85%">ライブ/イベント</td>
</tr>
<tr><td width="85%">r-zoon</td></tr>
<tr><td colspan="2">OB/OGライブ 2018</td></tr>
<tr><td colspan="2">2018/02/09　＠池袋ロサ</td></tr>
<tr><td colspan="2">皆様、いかがお過ごしでしょうか。<br>
今年もOB/OGライブの季節がやってまいりました。<br>
OB/OGの方も、現役のみんなも、ごちゃまぜのライ</td></tr>
</table>
</td></tr>
<tr><td align="center" bgcolor="#FFFFFF">
<table id="post_tbl" border="1">
<tr>
<td rowspan="2" width="15%">アイコン</td>
<td width="85%">メンバー募集</td>
</tr>
<tr><td width="85%">kazzool</td></tr>
<tr><td colspan="2">Beatles（コピー）のメンバーを探しています！</td></tr>
<tr><td colspan="2">募集パート：ベース ドラム</td></tr>
<tr><td colspan="2">ライブの日取りはまだ決まっていないのですが、theBeatlesのコピーバンドを組んでスタジオで合わせたいと思っています！！興味のある方はぜひ、私のアカウ</td></tr>
</table>
</td></tr>
<tr><td align="center" bgcolor="#FFFFFF">
<table id="post_tbl" border="1">
<tr>
<td rowspan="2" width="15%">アイコン</td>
<td width="85%">ライブ/イベント</td>
</tr>
<tr><td width="85%">r-zoon</td></tr>
<tr><td colspan="2">OB/OGライブ 2018</td></tr>
<tr><td colspan="2">2018/02/09　＠池袋ロサ</td></tr>
<tr><td colspan="2">皆様、いかがお過ごしでしょうか。<br>
今年もOB/OGライブの季節がやってまいりました。<br>
OB/OGの方も、現役のみんなも、ごちゃまぜのライ</td></tr>
</table>
</td></tr>
<tr><td align="center" bgcolor="#FFFFFF">
<table id="post_tbl" border="1">
<tr>
<td rowspan="2" width="15%">アイコン</td>
<td width="85%">メンバー募集</td>
</tr>
<tr><td width="85%">kazzool</td></tr>
<tr><td colspan="2">Beatles（コピー）のメンバーを探しています！</td></tr>
<tr><td colspan="2">募集パート：ベース ドラム</td></tr>
<tr><td colspan="2">ライブの日取りはまだ決まっていないのですが、theBeatlesのコピーバンドを組んでスタジオで合わせたいと思っています！！興味のある方はぜひ、私のアカウ</td></tr>
</table>
</td></tr>
</table>
</div>
</body>
</html>