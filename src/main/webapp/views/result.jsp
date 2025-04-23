<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="css/style.css">
    <title>Student Info</title>
</head>
<body>
    <h1>Student Info Submitted</h1>
    <p>ID: ${student.id}</p>
    <p>Name: ${student.name}</p>
    <p>Major: ${student.major}</p>
    <p>Age: ${student.age}</p>
    <p>Email: ${student.email}</p>
    <p>Honor Student: ${student.honor ? "Yes" : "No"}</p>
</body>
</html>
