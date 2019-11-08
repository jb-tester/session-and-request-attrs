<%--
  Created by IntelliJ IDEA.
  User: Irina.Petrovskaya
  Date: 11/8/2019
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sa_test1</title>
</head>
<body>
<h1>All session- and request attributes from interceptor should be available</h1>
<h1>attribute names are specified as annotation attributes</h1>
<br/>
<p>Global session attribute direct reference: ${sessionScope.globalSessionAttr1}</p>
<p>Global session attribute direct reference: ${sessionScope.globalSessionAttr2}</p>
<p>Global sessions attributes got via method-level model attrs: ${sa}                </p>
<p>Request Attribute added via interceptor - direct reference: ${requestScope.start}             </p>
<p>Request Attribute added via interceptor got via model attr:${ra}             </p>
<p>Global model attribute added via interceptor: ${duration}             </p>
</body>
</html>
