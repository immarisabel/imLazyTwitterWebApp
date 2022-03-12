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
<script>

(function($) {

                  			$.fn.charCount = function(btnsub, options){

                  				this.btnsub = btnsub;

                  				// default configuration properties
                  				var defaults = {
                  					allowed: 280,
                  					warning: 20,
                  					css: 'counter',
                  					counterElement: 'span',
                  					cssWarning: 'warning',
                  					cssExceeded: 'exceeded',
                  					counterText: 'characters left: '
                  				};

                  				var options = $.extend(defaults, options);

                  				function calculate(obj,btnsub){

                  					btnsub.attr("disabled", "disabled");

                  					var count = $(obj).val().length;
                  					var available = options.allowed - count;
                  					if(available <= options.warning && available >= 0){
                  						$(obj).next().addClass(options.cssWarning);
                  					} else {
                  						$(obj).next().removeClass(options.cssWarning);
                  					}
                  					if(available < 0){
                  						$(obj).next().addClass(options.cssExceeded);
                  					} else {
                  						$(obj).next().removeClass(options.cssExceeded);
                  						btnsub.removeAttr("disabled");
                  					}

                  					$(obj).next().html(options.counterText + available);
                  				};

                  				this.each(function() {
                  					$(this).after('<'+ options.counterElement +' class="' + options.css + '">'+ options.counterText +'</'+ options.counterElement +'>');

                  					calculate(this, btnsub);

                  					$(this).keyup(function(){calculate(this,btnsub)});
                  					$(this).change(function(){calculate(this,btnsub)});
                  				});

                  			};

                  		})(jQuery);

                  		$(document).ready(function(){
                  			$("#entry").charCount($("#btnsub"));
                  		});
</script>


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

               ${aboutTitle}</p>
               ${aboutContent}</p>

               ${linksTitle}
                  <ul>
                    <li><a href="${linksSourceURL}" target="new">${linksSource}</a></li>
                    <li><a href="${linksLocationURL}" target="new">${linksLocation}</a></li>
                    <li><a href="${linkWeatherURL}" target="new">${linksWeather}</a></li>
                    <li><a href="${linkTwitterAccountURL}" target="new">${linkTwitterAccount}</a></li>
                  </ul>
          <p></p>
              </div>
              <div class="col" style="padding-right: 10% !important;">
               ${headerTitle}



                <form:form method="POST" action="/addEntry" modelAttribute="journal">

                 <b>Weather:</b> ${weather}</br>
                 <b>Location:</b> ${location}</p>
                <form:textarea rows="8" path="entry" maxlength="280"/></p>
                <form:errors path="entry" cssClass="alert alert-primary"/></p>
                <h5 text-color="e2e2e2">${confirmation}</h5></p>
                <input type="submit" value="Submit"/>
               </form:form>



          </div>
          </div>
          <div class="twitter_feed">
</div>
          </body>
          </html>
