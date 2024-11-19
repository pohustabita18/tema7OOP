<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Orders Page</title>
</head>
<body>
    <h1>Orders Page</h1>

    <table border="1">
        <tr>
            <th>Id</th>
            <th>Customer Name</th>
            <th>Total Price</th>
            <th>Details</th>
        </tr>
        <c:forEach var="order" items="${all}">
            <tr>
                <td><c:out value="${order.id}" /></td>
                <td><c:out value="${order.customer_name}" /></td>
                <td><c:out value="${order.total_price}" /></td>
                <td>
                    <a href="<c:url value='order?id=${s.id}' />">Detalii</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
