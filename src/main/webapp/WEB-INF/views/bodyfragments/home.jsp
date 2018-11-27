<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:message code="label_button_query" var="lblBtnQuery" />
<spring:message code="label_button_update" var="lblBtnUpdate" />
<spring:message code="label_button_delete" var="lblBtnDelete" />
<h2>Advertisements</h2>
<c:forEach items="${ad}" var="element">
    <p>
        <div>
            ${element.name} <br/>
            ${element.category.name} <br/>
            ${element.company.name} <br/>
            ${element.content} <br/>
            ${element.phoneNumber} <br/>
             <button class="btn btn-info"
                onclick="location.href='/ads/${element.id}'">${lblBtnQuery}</button>
             <button class="btn btn-primary"
                onclick="location.href='/ads/${element.id}/update'">${lblBtnUpdate}</button>
             <button class="btn btn-danger"
                onclick="location.href='/ads/${element.id}/delete'">${lblBtnDelete}</button>
            <hr/>
        </div>
    </p>
</c:forEach>