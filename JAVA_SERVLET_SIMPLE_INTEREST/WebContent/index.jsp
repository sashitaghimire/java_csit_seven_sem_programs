<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Interest Form</title>
<script type="text/javascript">
	function validateForm()
	{
		var p = document.myForm.principle.value;
		var t = document.myForm.time.value;
		var r = document.myForm.rate.value;
		
		if(p!="" && t!="" && r!=""){
			var numRegex = /^[0-9]+$/;
			var doubleRegex = /^[0-9]+.[0-9]+$/;
			if(!(p.match(doubleRegex) || p.match(numRegex))){
				alert('Principle Must be Integer or Double');
				return false;
			}
			if(!(t.match(numRegex))){
				alert('Time Must be Integer');
				return false;
			}
			if(!(r.match(doubleRegex) || r.match(numRegex))){
				alert('Rate can be double or Integer');
				return false;
			}
			
		}else{
			alert('Text Field cannot be Empty');
			return false;
		}
		
	}
</script>
</head>
<body>
	<h2>Enter detail here</h2>
	<form name="myForm" action="simple_interest" onsubmit="return validateForm()">
		<h3>
			Principle : <input type="text" name="principle" required="required">
			<br /> Time : <input type="text" name="time" required="required"><br />
			Rate : <input type="text" name="rate" required="required"><br />
			<br /> <input type="submit" value="Submit">
		</h3>
	</form>

</body>
</html>