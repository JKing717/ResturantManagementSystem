<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<!-- Link to the stylesheet -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Menu</title>
</head>
<body>
<h1>Add New Menu</h1>

<form:form action="/addMenu" modelAttribute="menu" method="POST"> <!-- Form to submit a new menu -->
    <label for="id">ID:</label>
    <form:input path="id" id="id" required="true"/> <!-- Input field for menu id -->
    <form:errors path="id" cssClass="error-message"/><br/>

    <label for="type">Menu Type:</label> <!-- Drop down selection for menu type -->
    <form:select path="type" id="type">
        <form:option value="" label="Select a menu type" />
        <form:option value="Breakfast" label="Breakfast"/>
        <form:option value="Lunch" label="Lunch"/>
        <form:option value="Dinner" label="Dinner"/>
        <form:option value="Dessert" label="Dessert"/>
    </form:select>
    <form:errors path="type" cssClass="error-message"/><br/>

    <label for="chef">Chef:</label> <!-- Input field for menu chef -->
    <form:input path="chef" id="chef"/>
    <form:errors path="chef" cssClass="error-message"/><br/>

    <input type="submit" value="Add Menu"/> <!-- upon submitting form, the values are bound to a new menu instance in the POSTRQ controller method -->
</form:form>
</body>
</html>
