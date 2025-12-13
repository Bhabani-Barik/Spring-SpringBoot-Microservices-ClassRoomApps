<%@ page  isELIgnored="false"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h1  style="color:red;text-align:center"> Actors Report By Pagination  ::  ${pageVO.getNumber()+1} / ${pageVO.getTotalPages() }  ---  ${sysDate}</h1>

<c:choose>
  <c:when test="${!empty pageVO }">
     <table  border="1" bgcolor="yellow"  align="center">
       <tr>
          <th> aid </th>
          <th> aname </th>
          <th> address </th>
          <th> category </th>
          <th> remuneration </th>
          <th> operations </th>
       </tr>
       <c:forEach var="vo"  items="${pageVO.getContent()}">
           <tr>
              <td>${vo.aid} </td>
              <td>${vo.aname} </td>
              <td>${vo.addrs} </td>
              <td>${vo.category} </td>
              <td>${vo.remuneration} </td>
              <td> <a href="edit?no=${vo.aid}"><img src="images/edit.jpeg" width="30px" height="30px"></a> 
                         &nbsp;&nbsp;&nbsp;
                       <a href="delete?no=${vo.aid}" onclick="return confirm('Do u Really want to delete the record?')"><img src="images/delete.jpeg" width="30px" height="30px"></a> 
               </td>
           </tr> 
       
       </c:forEach>
     </table> 
     <center>
    <c:if test="${!pageVO.isFirst() }">
        <a href="page_report?page=0">first</a> &nbsp;&nbsp;
     </c:if>
    
    <c:if  test="${pageVO.hasNext() }">
       <a href="page_report?page=${pageVO.getNumber()+1}">next</a> &nbsp;&nbsp;
     </c:if>
     
     
     
     <c:forEach var="i"  begin="1"   end="${pageVO.getTotalPages()}"  step="1">
        <c:if  test="${pageVO.getNumber()!=i-1}">
               [ <a href="page_report?page=${i-1}"> ${i} </a> ] &nbsp;&nbsp;   
          </c:if>
     </c:forEach>
  <c:if  test="${pageVO.hasPrevious() }">
     <a href="page_report?page=${pageVO.getNumber()-1}">previous</a> &nbsp;&nbsp;
    </c:if>
   <c:if  test="${!pageVO.isLast() }">
     <a href="page_report?page=${pageVO.getTotalPages()-1}">Last</a> &nbsp;&nbsp;
     </c:if>
  
     </center>
  
  
  </c:when>
  
  
   <c:otherwise>
        <h1  style="color:red;text-align:center"> Records  not found </h1>
   </c:otherwise>

</c:choose>
 <br><br>
             <h1  style="color:green;text-align:center"> ${resultMsg}   </h1>
<br><br>
     <h1  style="color:red;text-align:center"><a href="add">Add Actor <img src="images/add.jpeg" width="80px" height="80px"></a>  </h1>
 <br><br>     
<h1  style="color:red;text-align:center"><a href="./">  Home<img src="images/home.jpeg" width="80px" height="80px"></a>  </h1>
 
