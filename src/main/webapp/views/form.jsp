<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="css/style.css">
    <title>Student Form</title>
</head>
<body>
    <h1>Enter Student Details</h1>
    <form action="submitStudent" method="post">
        <input type="text" name="id" placeholder="Student ID"/><br/>
        <input type="text" name="name" placeholder="Name"/><br/>
        <input type="text" name="major" placeholder="Major"/><br/>
        <input type="number" name="age" placeholder="Age"><br/>
        <input type="email" name="email" placeholder="Email"><br/>
        <label>Honor Student?</label>
        <input type="checkbox" name="honor"><br/>

        <input type="submit" value="Submit"/>
    </form>
</body>
</html>