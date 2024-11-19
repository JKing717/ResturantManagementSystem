<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<!-- Link to the stylesheet -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Dish</title>
</head>
<body>
<h1>Add New Dish</h1> <!-- Heading for the form -->

<form:form action="/addDish" modelAttribute="dish" method="POST"> <!-- Form to submit a new dish -->

    <label for="name">Name:</label> <!-- Input field for dish name -->
    <input type="text" id="name" name="name"><br><br>
    <form:errors path="name" cssClass="error-message"/>

    <label for="description">Description:</label> <!-- Input field for dish description -->
    <input type="text" id="description" name="description"><br><br>
    <form:errors path="description" cssClass="error-message"/>

    <label for="dietary">Dietary Requirements:</label> <!-- Input field for dish description -->
    <input type="text" id="dietary" name="dietary"><br><br>
    <form:errors path="dietary" cssClass="error-message"/>

    <label for="rating">rating:</label> <!-- Input field for dish description -->
    <input type="text" id="rating" name="rating"><br><br>
    <form:errors path="rating" cssClass="error-message"/>

    <input type = "hidden" name = "menu" value="${menu}"> <!-- menuID is passed as a hidden value to the POST method-->

    <!-- Submit button to add the dish -->
    <input type="submit" value="Add Dish">
</form:form>
</body>
</html>