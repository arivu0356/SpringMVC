<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculate BMI</title>
</head>
<body>
    <h2>Calculate BMI</h2>
    <form action="bmi" method="post">
        Height (in inches): <input type="text" name="height"><br>
        Weight (in pounds): <input type="text" name="weight"><br>
        <input type="submit" value="Calculate BMI">
    </form>
</body>
</html>