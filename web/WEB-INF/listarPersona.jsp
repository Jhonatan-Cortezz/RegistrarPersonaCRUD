<%-- 
    Document   : listarPersona
    Created on : 06-09-2020, 09:08:46 PM
    Author     : Cristian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
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
						<a href="">Editar</a>
					</td>
					<td>
						<a href="">Borrar</a>
					</td>
				</tr>
                                </c:forEach>
			</tbody>
		</table>
	</div>
    </body>
</html>
