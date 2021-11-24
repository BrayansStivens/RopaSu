<%-- 
    Document   : prendas
    Created on : 23/11/2021, 09:19:22 PM
    Author     : braya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prendas</title>
        <script src="../js/prendas.js" defer ></script>
    </head>
    <body>
        <h1>Prendas</h1>
        <br>
        <button id="btnConsultar">Consultar</button>
        <button id="btnIngresar">Ingresar</button>
        
         <div id="ingresar" style="display: none">
            <form  action="../prendas" method="get" >
                <label for="code">Código: </label>
                <input name="code" type="text" placeholder="Código"><br>
                <label for="name">Nombre: </label>
                <input name="name" type="text" placeholder="Nombre"><br>
                <label for="">Cantidad Producida: </label>
                <input name="amounts" type="text" placeholder="Cantidad Producida"><br>
                <label for="lot">Lote: </label>
                <input name="lot" type="text" placeholder="Lote"><br>
                <label for="time">Tiempo Produccion (Minutos): </label>
                <input name="time" type="text" placeholder="Tiempo Produccion"><br>
                <label for="class">Clasificación: </label>
                <input name="class" type="text" placeholder="Clasificación"><br>
                <input type="submit" name="btnSendI" value="Consultar">
            </form>
         </div> 
        <div id="consultar" style="display: none">
             <form action="../prendas" method="get">
                <label for="code">Código: </label>
                <input name="code" type="text" placeholder="Código"><br>
                <input type="submit" name="btnSendC" value="Consultar">
            </form> 
        </div>
           
    </body>
</html>
