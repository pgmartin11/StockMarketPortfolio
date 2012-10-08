<html>
  <head>
    <title>
      Demo of a simple JSP page
    </title>
  </head>
  <body>

   <!-- This is example of a directive defining a page-wide attribute. It sets global 
        information for the page. 
    -->
   <%@ page language="java" %>

   <!-- Declaration creates page-wide definitions, such as instance variables of the page servlet. 
        Here we declare the character variable -->
   <%! char c = 0; %>

   <!-- Scriptlet - Java code -->
   <%
     for (int i = 0; i < 26; i++) {
      for (int j = 0; j < 26; j++) {
         // Output capital letters of the alphabet, and change starting letter.
         //It means that the second line will start with Z, the third with Y, etc
         //Ox41 is hexadecimal ASCII representation of "A"
        c = (char)(0x41 + (26 - i + j)%26);
   %>

   <!-- Expressions define statements evaluated on the server before sending the page output
     to the client. Here we output the value of c.toString() to the HTML page -->
   <%= c %>  

   <%
      }
   %>
   <br>
   <%
   }
   %>

  </body>
</html>
