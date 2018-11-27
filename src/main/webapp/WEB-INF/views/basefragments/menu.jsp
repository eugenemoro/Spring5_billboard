<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:message code="label_menu_home" var="menuHome" />
<spring:message code="label_menu_new_advertisement" var="menuNewAd" />
<spring:message code="label_menu_contact_us" var="menuContactUs" />
<div style="padding: 5px;">

    <ul>

        <li><a href="${pageContext.request.contextPath}/">${menuHome}</a></li>
        <li><a href="${pageContext.request.contextPath}/ads/add">${menuNewAd}</a></li>
        <li><a href="${pageContext.request.contextPath}/contact_us">${menuContactUs}</a></li>

    </ul>

</div>