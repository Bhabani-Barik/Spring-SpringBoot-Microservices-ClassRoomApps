<%@ page  isELIgnored="false"     %>
<%@taglib  uri="http://www.springframework.org/tags/form"  prefix="frm" %>

<h1 style="color:green;text-align:center"> Student registration Page </h1>

<frm:form    modelAttribute="student">
  <table  border="1"  bgcolor="yellow"  align="center">
     <tr>
        <th> sno </th>
        <th> <frm:input type="text" path="sno"/> </th>  
     </tr>
     <tr>
        <th> sname </th>
        <th>  <frm:input type="text"  path="sname"/> </th>
     </tr>
     <tr>
        <th> sadd </th>
        <th>  <frm:input type="text"  path="sadd"/> </th>
     </tr>
     <tr>
        <th> avg </th>
        <th>  <frm:input type="text"  path="avg"/> </th>
     </tr>
     <tr>
        <th> <input type="submit"  value="register"> </th>
        <th>  <input type="reset" value="cancel"> </th>
     </tr>
     
  
  </table>

</frm:form>

