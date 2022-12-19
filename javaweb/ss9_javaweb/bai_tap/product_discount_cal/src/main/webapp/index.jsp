<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/9/2022
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>product discount calculator</title>
  </head>
  <body>
  <form action="/discount" method="post">
    <input type="number" name="listPrice">
    <input type="number" name="discountPercent">
    <button type="submit">Calculate discount</button>
  </form>
  </body>
</html>
