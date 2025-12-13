<%@page  isELIgnored="false" %>

<h1  style="color:red;text-align:center">Welcome to Spring boot MVC (welcome.jsp)</h1>

<br><br>

<b> Model attribute values ::  ${name}, ${systemDate}</b>
<br>
<b> model attribute values :: <%=request.getAttribute("name") %> , <%=request.getAttribute("systemDate")%></b>

