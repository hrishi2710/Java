<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<html>
	<body>
		<h1> ${headerMessage}</h1>
		<h3> Student admission form: </h3>
		<form:errors path = "student1.*"/>
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
			<tr> 
				<td> Student's address : </td>
			</tr>
			<tr> 
				<td> country :</td> <td><input type = "text" name = "studentAddress.country"/></td>
			</tr>
			<tr> 
				<td> city :</td> <td><input type = "text" name = "studentAddress.city"/></td>
			</tr>
			<tr> 
				<td> street :</td> <td><input type = "text" name = "studentAddress.street"/></td>
			</tr>
			<tr> 
				<td> pincode :</td> <td><input type = "text" name = "studentAddress.pincode"/></td>
			</tr>
			<tr><td><input type ="submit" value = "Submit this form by clicking here"/></td></tr>
		</table>
		</form>
	</body>	
</html>