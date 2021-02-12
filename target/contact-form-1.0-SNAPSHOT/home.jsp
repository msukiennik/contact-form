<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact form</title>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <link rel="stylesheet" href="style/style.css"/>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Alfa+Slab+One&family=Pacifico&display=swap" rel="stylesheet">
</head>
<body>

<div id="div-form-and-logo" class="visible">
<div class="naglowek">
    <p class="naglowek-text">Skontaktuj się z nami</p>
    <p class="naglowek-text-2">Odpowiemy najszybciej jak będzie to możliwe</p>
</div>

<div class="contact-form">
    <form method="post" action="/Contact_form/formServlet">
        <p>
            <label class="form-labels">Tytuł wiadomości</label><BR>
            <input type="text" class="form-inputs" name="topic">
        </p>

        <p>
            <label class="form-labels">Treść wiadomości</label><BR>
            <textarea class="form-textarea" name="content"></textarea>
        </p>

        <p>
            <label class="form-labels">Adres e-mial do kontaktu</label><BR>
            <input type="email" class="form-inputs" name="email">
        </p>

        <p>
            <label class="form-labels">Numer telefonu (opcjonalnie)</label><BR>
            <input type="number" class="form-inputs" name="telephone" required>
        </p>

        <p>
            <input type="submit" value="Wyślij" class="form-submit-button" id="submit-button-form">
        </p>

    </form>
</div>
</div>

<p id="p-information-after-form" class="info-for-client" class="invisible">
    <c:out value="${returnInformation}"/>
</p>


<!--
Add js file:
-->
<script src="js/javascript1.js" type="text/javascript"></script>
</body>
</html>