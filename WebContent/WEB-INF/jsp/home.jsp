<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.UserInfoBean,model.TimeLineBean,java.util.List" %>
<%
//セッションスコープからユーザ情報を取得
UserInfoBean userInfo = (UserInfoBean) session.getAttribute("userInfo");
//リクエストスコープからタイムラインを取得
List<TimeLineBean> arrTimeLine = (List<TimeLineBean>) request.getAttribute("arrTimeLine");
TimeLineBean timeLine = new TimeLineBean();
timeLine = (TimeLineBean) arrTimeLine.get(1);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width">
		<title>Quetana</title>
		<link rel="stylesheet" type="text/css" href="/quetana/css/main.css">
		<link rel="stylesheet" type="text/css" href="/quetana/css/menu.css">
	</head>
	<body>
		<jsp:include page="../jsp/parts/mainheader.jsp" flush="true" />
		<div class="Contents" id="main_div">
			<table id="main_tbl" border="1">
				<tr><td align="left">
					<font color="#FFFFFF" size="3">タイムライン</font>
				</td></tr>
				<tr><td align="center">
					<input id="submit_btn" type="submit" id="button" name="all" value="すべて">
					<input id="submit_btn" type="submit" id="button" name="event" value="ライブ/イベント">
					<input id="submit_btn" type="submit" id="button" name="member" value="メンバー募集">
				</td></tr>
				<tr><td align="center" bgcolor="#FFFFFF">
					<br>
						<%
							for (int i = 0; i < 4; i++) {
								
							}
						%>
					<br>
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
<td width="85%"><%= timeLine.getStUserName() %></td>
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