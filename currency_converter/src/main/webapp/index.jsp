<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h1>Currency Converter</h1>
<form action="convert.jsp" method="get">
    <label>Rate: </label><br>
    <label>
        <input type="text" name="rate" placeholder="rate" value="22000">
    </label>
    <label>USD: </label><br>
    <label>
        <input type="text" name="usd" placeholder="USD" value="0">
    </label>
    <input type="submit" id="submit" value="Converter">
</form>
<br/>
</body>
</html>