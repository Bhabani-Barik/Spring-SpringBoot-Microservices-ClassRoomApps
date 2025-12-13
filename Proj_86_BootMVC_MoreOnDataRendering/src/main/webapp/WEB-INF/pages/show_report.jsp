<%@ page  isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<h1  style="color:red;text-align:center">  Report Page  </h1>

<b> simple model attributes are :: </b>

 <c:if test="${!empty name }">
       ${name },
   </c:if>
   
 <c:if test="${!empty age }">
       ${age },
   </c:if>


   
<br><br>
<b> Fav colors ::
  <c:if test="${!empty favColors }"> 
	   <c:forEach var="color"  items="${favColors}">
	            ${color},
	   </c:forEach>
   </c:if>



 </b> <br>
 <c:if test="${!empty friends }">
    <b>  friends :: ${friends} </b> <br>
</c:if>


<c:if test="${!empty phones }">
   <b>  phones :: ${phones} </b> <br>
</c:if>


<c:if test="${!empty idDetails }">
   <b>  idDetails :: ${idDetails} </b> <br>
</c:if>

<br><br>
<b> Model class obj data ::</b>
<c:if test="${!empty custData }">
       ${custData} <br>
       ${custData.cno} , ${custData.cname } , ${custData.caddrs}
</c:if>

<br><br>
<b> More Customers Info</b>
<c:if test="${!empty custList}">
   <table border="1" bgcolor="yellow" >
     <tr>
       <th> cno </th>
       <th> cname </th>
       <th> caddrs </th>
       <th> billamt </th>
     </tr>
     <c:forEach var="cust"  items="${custList}">
        <tr>
          <td> ${cust.cno} </td>
          <td> ${cust.cname} </td>
          <td> ${cust.caddrs} </td>
          <td> ${cust.billamt} </td>
        </tr>
     </c:forEach>
   
   </table>
</c:if>


