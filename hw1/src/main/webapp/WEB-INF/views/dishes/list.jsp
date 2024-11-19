<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<!-- Link to the stylesheet -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dishes</title> <!-- Title of the page -->
</head>
<body>
<c:forEach items="${dishes}" var="dish"><!-- Iterate through the list of dishes -->
    <h1>Dish name: ${dish.getName()}</h1> <!-- Display dish name -->
    <h2>Description: ${dish.getDescription()}</h2> <!-- Display dish description -->
    <h3>Dietary info.: ${dish.getDietary()}</h3> <!-- Display dietary information -->
    <h4>Rating: ${dish.getRating()}</h4> <!-- Display dish rating -->
</c:forEach>
<a href = "/newDish?menu=${menuID}">Add a new dish</a> <!-- Link to take user to add a new dish -->

</body>
</html>