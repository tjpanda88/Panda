<%@ include file="/WEB-INF/views/common/include.jsp" %>
<%@ pagepageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1">

	<%@ include file="/WEB-INF/views/common/includeCss.jsp" %>
	<%@ include file="/WEB-INF/views/common/includeJavascript.jsp" %>


	<title><tiles:insertAttribute name="title" /></title>
</head>

<body>
	<tiles:insertAttribute name="header" />
	<div class="container-fluid">
		<div class="row">
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<tiles:insertAttribute name="footer" />
</body>
</html>