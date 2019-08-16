<html>
	<body>
		<h1> ${headerMessage}</h1>
		<h3> Student admission form: </h3>
		<form action = "/AdmissionProject/submitAdmissionForm.html" method ="post">
			<p>
				Student's name: <input type = "text" name = "studentName"/>
			</p>
			<p>
				Student's hobby: <input type = "text" name = "studentHobby"/>
			</p>
			<input type ="submit" value = "Submit this form by clicking here"/>
		</form>
	</body>	
</html>