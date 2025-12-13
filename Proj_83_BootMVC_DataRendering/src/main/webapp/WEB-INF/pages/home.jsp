<%@page  isELIgnored="false" %>

<h1  style="color:Green;text-align:center">Welcome to Spring boot MVC (home.jsp)</h1>

<br><br>

<b> Model attribute values ::  ${name}, ${systemDate}</b>
<br>
<b> model attribute values :: <%=request.getAttribute("name") %> , <%=request.getAttribute("systemDate")%></b>

