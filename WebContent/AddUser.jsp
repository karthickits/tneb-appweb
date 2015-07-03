<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Customer</title>
</head>
<body>


		
<form action="addCustomer" id="register" method="post">
<table border="0">
<tbody>

<tr>
<td><label for="name">Name: </label> </td>
<td><input id="name" maxlength="45" name="name" type="text" /> </td>
</tr>

<tr>
<td><label for="age">Age:</label> </td>
<td><input id="email" maxlength="45" name="age" type="text" /></td>
</tr>

<tr>
<td><label for="gender">Gender:</label> </td>
<td><input id="gender" maxlength="45" name="gender" type="text" /> </td>
</tr>

<tr>
<td><label for="address">Address:</label></td>
<td><input id="address" maxlength="45" name="address" type="text" /></td>
</tr>


<tr>
<td><label for="email">Email Address:</label> </td>
<td><input id="email" maxlength="45" name="email" type="text" /> </td>
</tr>

<!-- <tr>
<td><label for="password">Password*:</label></td>
<td><input id="password" maxlength="45" name="password" type="password" /></td>
</tr>
<tr> -->
<td align="right"><input name="Submit" type="submit" value="Submit" /></td>
</tr>

</tbody></table>
</form>

	

</body>
</html>




