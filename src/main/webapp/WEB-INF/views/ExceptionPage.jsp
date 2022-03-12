<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="text" uri="http://www.springframework.org/tags" %>

    <%@page contentType="text/html;charset=UTF-8" language="java" %>
        <%@page isELIgnored="false" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <title></title>
          <link rel="preconnect" href="https://fonts.googleapis.com">
          <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
          <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;400&family=Poppins:wght@100&display=swap" rel="stylesheet">
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

          </head>
          <body>

          <div class="container" >
             <spam class="alert alert-danger" th:text="${text}"></spam>

                <form:form method="GET" action="/home" modelAttribute="journal">
                 <input type="submit" value="Submit"/>
               </form:form>
</div>
          </body>
          </html>
