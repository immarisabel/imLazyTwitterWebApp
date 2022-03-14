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
          <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
          <script src="../js/counter.js"></script>

          <style>
             .counter{
               align: right;
              }

              textarea {
                width:100%;

                }
               .twitter_feed{
               width:50%;
               margin-left: auto;
               margin-right: auto;
               }


          </style>


          </head>
          <body>

          <div class="container" >


                     </p>
            ${headerText}</p>
           <hr>            </p>
            <div class="row" >
              <div class="col order-last" >

              <img src="https://marisabel.nl/wp-content/uploads/2020/11/avatar-e1606738130828-150x150.png" align="right">


               ${aboutContent}</p>


          <p></p>
              </div>
              <div class="col" style="padding-right: 10% !important;">
              <a href="/home"> ${headerTitle} </a>



                <form:form method="POST" action="/addEntry" modelAttribute="journal">

                 <b>Weather:</b> ${weather}</br>
                 <b>Location:</b> ${location}</p>
                <form:textarea rows="8" path="entry" maxlength="280"/></p>
                <form:errors path="entry" cssClass="alert alert-primary"/></p>
                <h5 text-color="e2e2e2">${confirmation}</h5></p>
                ${confirmedTweet}</p>
                <input type="submit" value="Submit"/>
               </form:form>
</p>
                <form:form method="POST" action="/addAutoEntry" modelAttribute="journal">
                <input type="submit" value="Auto generate tweet with weather and greeting."/>
                </form:form>


          </div>
          </div>


          </body>
          </html>
