<%-- 
    Document   : login
    Created on : 28/03/2013, 02:37:51 PM
    Author     : Oscar
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/general.css" type="text/css" /> 
        <title>Ejemplo Spring</title>
    </head>

    <body>
               
        <form:form action="login.do" method="post" commandName="loginForm">
            
            <form:errors path="*" cssClass="errorblock" element="div"/>
            
            <p>Usuario: <form:input path="nombre" /></p>
            <p>Contraseña: <form:password path="password" /></p>
            <input type="submit" value="Entrar"/>
            
        </form:form>
        
    </body>
</html>
