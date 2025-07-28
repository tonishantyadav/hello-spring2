<%@ page language="java" %>

  <html>

  <head>
    <title>Add student</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>

  <body>
    <h2>Add student</h2>
    
    <form action="studentDetails" method="get">
      <label for="id">Enter student id:</label>
      <input type="text" id="id" name="id"><br><br>

      <label for="name">Enter student name:</label>
      <input type="text" id="name" name="name"><br><br>

      <input type="submit" value="Submit">
    </form>
  </body>

  </html>