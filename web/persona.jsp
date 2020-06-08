<%-- 
    Document   : persona
    Created on : 06-08-2020, 09:40:11 AM
    Author     : JHONATAN CORTEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar persona</h1>
        <form action="recibir.do" method="post">
            DUI:&nbsp;<input type="text" name="txtDui"required=""><br>
            Apellidos:&nbsp;<input type="text" name="txtApellidos" required=""><br>
            Nombres:&nbsp;<input type="text" name="txtNombres" required=""><br> 
            <input type="submit" value="GUARDAR DATOS" name="btnEnviar">
        </form>
    </body>
</html>
