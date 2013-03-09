<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<%--<jsp:forward page="Welcome.do"/>--%>

<html:html>
    <head>
        <meta charset="utf-8"/>
        <title>:: Prueba Struts ::</title>
        <html:base/>
    </head>
    <body>
        
        <html:form method="post" action="/login.do">
            <table>
                <tr>
                    <td>User:</td>
                    <td><html:text property="user"/></td>
                </tr>                
                <tr>
                    <td>Password:</td>
                    <td><html:password property="password"/></td>
                </tr>
                <tr>
                    <td><html:submit value="Submit"/></td> 
                </tr>
            </table>
            
        </html:form>
        
        <%--<html:link page="/login.do">Login</html:link>--%>
                   
    </body>
</html:html>