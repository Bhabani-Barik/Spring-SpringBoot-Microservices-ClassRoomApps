<%@ page isELIgnored="false"%>

<h1 style="color: green; text-align: center">Student registration
	Page</h1>

<form action="register" method="POST">
	<table border="1" bgcolor="yellow" align="center">
		<tr>
			<th>sno</th>
			<th><input type="text" name="sno"></th>
		</tr>
		<tr>
			<th>sname</th>
			<th><input type="text" name="sname"></th>
		</tr>
		<tr>
			<th>sadd</th>
			<th><input type="text" name="sadd"></th>
		</tr>
		<tr>
			<th>avg</th>
			<th><input type="text" name="avg"></th>
		</tr>
		<tr>
			<th><input type="submit" value="register"></th>
			<th><input type="reset" value="cancel"></th>
		</tr>


	</table>

</form>

