<%@ include file="/WEB-INF/views/common/include.jsp" %>
<div class="container">
	Body
	<sec:authentication property="principal.account" var="account" />
	${account.userName}
	<form:form action="${pageContext.request.contextPath}/logout">
                <button>Logout</button>
            </form:form>
</div>
