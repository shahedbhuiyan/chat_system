
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form action="login" method="post">
    <table>
      <tr><td></td><td><a href="view">View All User</a> </td><td><a href="index.jsp">SignUp</a> </td></tr>
      <tr>
        <td colspan="3" align="center">Login Info</td>
      </tr>

      <tr>
        <td>Email</td>
        <td>:</td>
        <td><input type="text" name="email"></td>
      </tr>

      <tr>
        <td>Password</td>
        <td>:</td>
        <td><input type="password" name="pass"></td>
      </tr>
      <tr><td colspan="3" align="center"><input type="submit" name="sub" value="LogIn"></td></tr>
    </table>
  </form>
</body>
</html>
