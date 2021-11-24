<%-- 
    Document   : operario
    Created on : 23/11/2021, 02:12:49 PM
    Author     : braya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operarios</title>
    </head>
    <body>
         <div class="form">
            <form action="operario" method="get">
                <label for="code">Código: </label>
                <input name="code" type="text" placeholder="Código"><br>
                <label for="name">Nombre: </label>
                <input name="name" type="text" placeholder="Nombre"><br>
                <label for="lastname">Apellido: </label>
                <input name="lastname" type="text" placeholder="Apellido"><br>
                <label for="lot">Lote: </label>
                <input name="lot" type="text" placeholder="Lote"><br>
                <label for="hour">Hora de ingreso al lote: </label>
                <input name="hour" type="text" placeholder="Hora"><br>
                <input type="submit" name="btnSend" value="Enviar">
            </form>
        </div>
    </body>
</html>
