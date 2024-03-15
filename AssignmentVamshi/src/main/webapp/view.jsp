<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="assignment.UserBean"
    import ="java.util.*" 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>User Details</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h2>USERDEtails</h2>
 <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Age</th>
                <th>Date of Birth</th>
            </tr>
        </thead>
        <tbody>
        <% 
    ArrayList< UserBean > users = (ArrayList) request.getAttribute("User");
         for (UserBean u: users) {
            %>
            <tr>
                <td><%= u.getId() %></td>
                <td><%= u.getName() %></td>
                <td><%= u.getEmail() %></td>
               <td><%=u.getAge() %>
               <td><%=u.getDate() %>
            </tr>
            <% }
            %>
        </tbody>
    </table>
</body>
</html>