<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<!-- Link to the stylesheet -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Menus List</title> <!-- Title of the page -->
</head>
<body>

<c:forEach items="${menus}" var="menu"> <!-- Iterate through the list of menus -->
        <h1>Menu Type: ${menu.type}</h1> <!-- Display menu type -->
    <h2>Chef: ${menu.chef}</h2> <!-- Display chef name -->
    <a href = "/dishes?menu=${menu.id}">View Dishes</a> <!-- Link to view dishes for the current menu -->
</c:forEach>

</body>
</html>