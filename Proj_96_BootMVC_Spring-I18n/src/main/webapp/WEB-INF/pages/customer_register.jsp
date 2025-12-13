<%@ page language="java"  isELIgnored="false"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"   prefix="sp"%>
<%@taglib uri="http://www.springframework.org/tags/form"   prefix="frm"%>


<h1  style="color:red;text-align:center"> <sp:message code="cust.register.title"/>  </h1>
<br><br>
 <frm:form action="register" method="POST"  modelAttribute="cust">
   <table  align="center"  bgcolor="cyan">
   <tr>
      <td> <sp:message code="cust.register.id"/> </td>
      <td>  <frm:input type="text"  path="cno"/> </td>
   </tr>
   <tr>
      <td> <sp:message code="cust.register.name"/> </td>
      <td>  <frm:input type="text"  path="cname"/> </td>
   </tr>
   <tr>
      <td> <sp:message code="cust.register.billamt"/> </td>
      <td>  <frm:input type="text"  path="billamt"/> </td>
   </tr>
   <tr>
      <td colspan="2"> <input type="submit"  value="<sp:message code='cust.register.caption' />" /> </td>
   </tr>
  </frm:form>
 </table>

<br><br>

<center>
<a href="?lang=hi_IN"> हिंदी</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=fr_FR"> French</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=de_DE"> German</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=zh_CN"> Chinese</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=te_IN"> తెలుగు</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=en_US"> English</a> &nbsp;&nbsp;&nbsp;

</center>



 


