<%@page language="java" %>
  <html>

  <head>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  </body>
  <!-- Access the data via session object-->
  <!-- <h2>Result is: <%= session.getAttribute("result") %></h2> -->
  
  <!-- Access the data via JSTL -->
  <h2>Result is: ${result}</h2>
  </body>

  </html>