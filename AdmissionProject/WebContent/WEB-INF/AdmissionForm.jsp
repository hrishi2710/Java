<html>
	<body>
		<h1> ${headerMessage}</h1>
		<h3> Student admission form: </h3>
		<form action = "/AdmissionProject/submitAdmissionForm.html" method ="post">
		<table> 
			<tr>
				<td>Student's name:</td> <td><input type = "text" name = "studentName"/></td>
			</tr> 
			<tr>
				<td>Student's hobby:</td> <td><input type = "text" name = "studentHobby"/></td>
			</tr>
			<tr>
				<td>Student's Mobile:</td> <td><input type = "text" name = "studentMobile"/></td>
			</tr>
			<tr>
				<td>Student's Dob:</td> <td><input type = "text" name = "studentDob"/></td>
			</tr>
			<tr>
				<td>Student's skills:</td> <td>
											<select name="studentSkills" multiple>
											<option value="Java Core">Java Core</option>
											<option value="Spring Core">Spring Core</option>
											<option value="Spring MVC">Spring MVC</option>
											</select>
											</td>
			</tr>
			<tr><td><input type ="submit" value = "Submit this form by clicking here"/></td></tr>
		</table>
		</form>
	</body>	
</html>