<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
    <c:when test="${ad.name eq ''}">
        <h2>Create Advertisement</h2>
    </c:when>
    <c:otherwise>
        <h2>Update Advertisement</h2>
    </c:otherwise>
</c:choose>
<form:form action = "${ad.name eq '' ? '/ads/submit' : '/ads/update'}" modelAttribute="ad" method="POST">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input type="text" path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="company">Company</form:label></td>
            <td>
                <c:choose>
                    <c:when test="${ad.name eq ''}">
                        <form:select path="company">
                            <form:option value="NONE" label="--- Select ---" />
                            <form:options items="${companies}" itemValue="id" itemLabel="name" />
                        </form:select>
                    </c:when>
                    <c:otherwise>
                        <form:label path="company">${ad.company.name}</form:label>
                    </c:otherwise>
                </c:choose>

            </td>
        </tr>
        <tr>
            <td><form:label path="category">Category</form:label></td>
            <td>
                <form:select  path="category">
                    <c:choose>
                        <c:when test="${ad.name eq ''}">
                                <form:option value="NONE" label="--- Select ---" />
                                <form:options items="${categories}" itemValue="id" itemLabel="name" />
                        </c:when>
                        <c:otherwise>
                                <form:option value="${ad.category}" label="${ad.category.name}" />
                                <form:options items="${categories}" itemValue="id" itemLabel="name" />
                        </c:otherwise>
                    </c:choose>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label path="content">Content</form:label></td>
            <td><form:input type="text" path="content"/></td>
        </tr>
        <tr>
            <td><form:label path="phoneNumber">Phone #</form:label></td>
            <td><form:input type="text" path="phoneNumber"/></td>
        </tr>
        <tr>
            <td>
                <c:choose>
                    <c:when test="${ad.name eq ''}">
                        <input type="submit" value="Submit" />
                    </c:when>
                    <c:otherwise>
                        <input type="submit" value="Update" />
                    </c:otherwise>
                </c:choose>
            </td>
            <td><input type="reset" value="Reset"/></td>
        </tr>
    </table>
</form:form>