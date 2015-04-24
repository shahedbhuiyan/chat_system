<%--
  Created by IntelliJ IDEA.
  User: SHAHED
  Date: 4/24/2015
  Time: 4:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="chat" method="post">
  <table align="center" border="1">
    <tr><td colspan="6" align="left"><a href="/viewAllMsg">View All Message</a> </td></tr>
    <tr>
      <td>Name</td>
      <td>:</td>
      <td><input type="text" value = "${user}" name="user" readonly/> </td>
      <td>Gender</td>
      <td>:</td>
      <td><input type="text" value="${sex}" name="sex" readonly/> </td>
    </tr>

    <tr>
      <td>Date</td>
      <td>:</td>
      <td colspan="4"><input type="text" name="date" value="<%=java.util.Calendar.getInstance().getTime()%>" readonly></td>
    </tr>

    <tr>
      <td valign="top">Message</td>
      <td>:</td>
      <td valign="top" colspan="4"><textarea name="text"></textarea></td>
    </tr>
    <tr><td colspan="6"><input type="submit" value="Send"></td></tr>
  </table>
  </form>
</body>
</html>
