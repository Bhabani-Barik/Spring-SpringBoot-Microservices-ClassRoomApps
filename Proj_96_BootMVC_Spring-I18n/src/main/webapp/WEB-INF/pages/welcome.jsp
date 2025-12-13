<%@ page language="java"  isELIgnored="false"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"   prefix="sp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"   prefix="fmt"%>


<b><i> Current Active Locale :: ${pageContext.response.locale}</i></b>

<h1  style="color:red;text-align:center"> <sp:message code="home.title"/>  </h1>
<br><br>

<h3  style="color:green;text-align:center"><a href="register"> <sp:message code="home.link1"/> </a> </h3>
<hr>
<br><br>

<fmt:setLocale  value="${pageContext.response.locale}"/>

<fmt:formatDate var="fdate"  value="${sysDate}"  type="date"  dateStyle="FULL"/>
<fmt:formatDate var="ftime"  value="${sysDate}"  type="time"  dateStyle="FULL"/>
<fmt:formatDate var="fdatetime"  value="${sysDate}"  type="both"  dateStyle="FULL"/>

<fmt:formatNumber  var="fprice"   value="${price}"   type="currency"/>
<fmt:formatNumber  var="fdistance"   value="${distance}"   type="number"/>
<fmt:formatNumber  var="favg"   value="${avg}"   type="percent"/>




<b> Formatteed  date :: ${fdate}</b> <br>
<b> Formatteed  time :: ${ftime}</b> <br>
<b> Formatteed  date-time :: ${fdatetime}</b> <br>
<b> Formatted  price :: ${fprice}</b><br>
<b> Formatted  distance :: ${fdistance}</b><br>
<b> Formatted  avg :: ${favg}</b><br>











<center>
<a href="?lang=hi_IN"> हिंदी</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=fr_FR"> French</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=de_DE"> German</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=zh_CN"> Chinese</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=te_IN"> తెలుగు</a> &nbsp;&nbsp;&nbsp;
<a href="?lang=en_US"> English</a> &nbsp;&nbsp;&nbsp;

</center>



 


