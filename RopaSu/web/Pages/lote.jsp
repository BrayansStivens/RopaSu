<%-- 
    Document   : lote
    Created on : 24/11/2021, 09:21:15 PM
    Author     : braya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lotes</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet"> 
        <link rel="icon" href="https://img.icons8.com/dotty/80/000000/button.png"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/estilos.css">
        <script src="../js/prendas.js" defer ></script>
    </head>
    <body class="body_registro">
        <nav class="navbar navbar-light bg-light">
            <a class="navbar-brand" href="prendas.jsp">
                <img src="https://img.icons8.com/dotty/80/000000/button.png" width="30" height="30" class="d-inline-block align-top" alt="">
                LOTES
            </a>
            <ul class="nav justify-content-center">
                <li class="nav-item " id="btnConsultar">
                    <a class="nav-link " href="#">Consultar</a>
                </li>
                <li class="nav-item" id="btnIngresar">
                    <a class="nav-link " href="#">Ingresar</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="../index.jsp">Volver</a>
                </li>
            </ul>            
        </nav>
        <br>
        <div class="container">

            <div id="ingresar" style="display: none" >
                <div class="titulo">Ingresar</div>
                <form  action="../ServletLotes" method="get" id="form-registro" >
                    <div class="detalles-usuario">
                        <div class="input_box">
                            <label for="code">Código: </label>
                            <input name="code" type="text" placeholder="Código">
                        </div>
                        <div class="input_box">
                            <label for="process">Proceso(1-5): </label>
                            <input name="process" type="text" placeholder="Proceso">
                        </div>

                        <input type="submit" name="btnSendI" value="Ingresar" id="btn-submit-form">

                    </div>
                </form>
            </div> 

            <div id="consultar" style="display: none" id="form-registro">
                <div class="titulo">Consultar</div>
                <form action="../ServletLotes" method="get">
                    <div class="detalles-usuario">
                        <div class="input_box">
                            <label for="code">Código: </label>
                            <input name="code" type="text" placeholder="Código">
                        </div>
                        <input type="submit" name="btnSendC" value="Consultar" id="btn-submit-form">
                    </div>
                </form> 
            </div>
            <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    </body>
</html>
