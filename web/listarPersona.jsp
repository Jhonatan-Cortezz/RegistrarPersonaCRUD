<%-- 
    Document   : listarPersona
    Created on : 06-10-2020, 08:38:53 AM
    Author     : Cristian
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Listados</title>
    </head>
    <body>
        <h1>Registros Almacenados</h1>
        <div>
            <table border="1">
                    <thead>
                            <tr>
                                    <th>DUI</th>
                                    <th>Apellidos</th>
                                    <th>Nombres</th>
                                    <th>Modificar</th>
                                    <th>Eliminar</th>
                            </tr>
                    </thead>
                    <tbody>
                            <c:forEach var="persona" items="${pers}">
                            <tr>
                                    <td><c:out value="${persona.dui_persona}"/></td>
                                    <td><c:out value="${persona.apellidos_persona}"/></td>
                                    <td><c:out value="${persona.nombres_persona}"/></td>
                                    <td>
                                            <a href="verdatosPersona.do?dui_persona=<c:out value="${persona.dui_persona}" />">Editar</a>
                                    </td>
                                    <td>
                                            <a href="borrar.do?dui_persona=<c:out value=" ${persona.dui_persona}" />">Borrar </a>
                                    </td>
                            </tr>
                            </c:forEach>
                    </tbody>
            </table>
        </div>
    </body>
</html>
