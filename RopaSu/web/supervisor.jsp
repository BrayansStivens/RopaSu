<%-- 
    Document   : supervisor
    Created on : 22/11/2021, 07:44:04 PM
    Author     : braya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supervisores</title>
    </head>
    <body>
        <div class="form">
            <form action="supervisor" method="get">
                <label for="code">Código: </label>
                <input name="code" type="text" placeholder="Código"><br>
                <label for="name">Nombre: </label>
                <input name="name" type="text" placeholder="Nombre"><br>
                <label for="lastname">Apellido: </label>
                <input name="lastname" type="text" placeholder="Apellido"><br>
                <label for="work_day">Jornada: </label>
                <input name="work_day" type="text" placeholder="Jornada"><br>
                <input type="submit" name="btnSend" value="Enviar">
            </form>
        </div>
    </body>
</html>
