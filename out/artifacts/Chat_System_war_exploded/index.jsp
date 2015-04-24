
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>User Registration</title>
    <style type="text/css">
        .header{
          font-family: tahoma;
          font-size: 15px;
          color: black;
          background-color: azure;
          font-weight: bold;
        }
      table{
        font-family: verdana;
        font-size: 13px;
        text-align: left;
      }
    </style>
  </head>
  <body>
    <form action = "signup" method="post">
      <table border="0" align="left" cellspacing="0">
        <tr><td colspan="3">${status}</td></tr>
        <tr>
          <td colspan="3" align="center" class="header">User Information</td>
        </tr>
        <tr>
          <td>Name</td>
          <td>:</td>
          <td><input type="text" name="name"></td>
        </tr>

        <tr>
          <td>Email</td>
          <td>:</td>
          <td><input type="text" name="email"></td>
        </tr>

        <tr>
          <td>Password</td>
          <td>:</td>
          <td><input type="text" name="pass"></td>
        </tr>

        <tr>
          <td>Age</td>
          <td>:</td>
          <td><input type="text" name="age"></td>
        </tr>

        <tr>
          <td>Gender</td>
          <td>:</td>
          <td><select name="gender">
            <option value="">-------</option>
            <option value="M">Male</option>
            <option value="F">Female</option>
          </select> </td>
        </tr>
        <tr><td colspan="3" align="center"><input type="submit" value="Save" name="sub"></td></tr>
      </table>
    </form>
  </body>
</html>
