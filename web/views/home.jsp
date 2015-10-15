<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<br>
  <head>
    <title>Log In Page</title>
  </head>

<br/>
${message}
  <br/>
  <form action="login" method="post">
      name:<input type="text" name="userName" placeholder="User Name">
      <button type="submit" name="submit">Sign in</button>
  </form>

  </body>
</html>
