<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Phone Page</h1>

    <table border="1">
        <tr>
            <th>Id</th>
            <th>Model</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Details</th>
        </tr>
        <c:forEach var="phone" items="${all}">
            <tr>
                <td><c:out value="${phone.id}" /></td>
                <td><c:out value="${phone.model}" /></td>
                <td><c:out value="${phone.brand}" /></td>
                <td><c:out value="${phone.price}" /></td>
                <td>
                    <a href="<c:url value='phone?id=${s.id}' />">Detalii</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>