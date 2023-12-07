<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Product Discount Calculator</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="/calculate" method="get">
  <table>
    <tr>
      <td>Product Description</td>
      <td>
        <label>
          <input type="text" name="description" placeholder="Description">
        </label>
      </td>
    </tr>
    <tr>
      <td>List Price</td>
      <td>
        <label>
          <input type="number" name="listPrice" placeholder="List Price">
        </label>
      </td>
    </tr>
    <tr>
      <td>Discount Percent</td>
      <td>
        <label>
          <input type="number" name="discountPercent" placeholder="Discount Percent">
        </label>
      </td>
    </tr>
    <tr>
      <td colspan="2" style="text-align: center">
        <label>
          <input type="submit" value="Calculate">
        </label>
      </td>
    </tr>
  </table>
</form>
</body>
</html>