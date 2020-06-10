<%-- 
    Document   : editarPersona
    Created on : 09-jun-2020, 21:59:54
    Author     : Leonor
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar datos</title>
    </head>
    <body><h1>Editar Persona</h1>
        <form action="modificar.do" method="post">
            <h6>
                DUI:&nbsp;
                <input type="hidden" name="dui_persona" value="<c:out value="${persona.dui_persona}"/>" required=/>
                <input type="txt" name="txtDui" value="<c:out value="${persona.dui_persona}"/>" <br>
            </h6>
                Apellidos:&nbsp;<input type="text" name="txtApellidos" value="<c:out value="${persona.apellidos_persona}"/>"><br>
                Nombres:&nbsp;<input type="text" name="txtNombres" value="<c:out value="${persona.nombres_persona}"/>"><br>
               <input type="submit" value="ACTUALIZAR DATOS" name="btnEnviar">
        </form>
    </body>
</html>
