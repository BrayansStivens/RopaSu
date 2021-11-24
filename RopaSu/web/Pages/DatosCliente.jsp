<%-- 
    Document   : index
    Created on : 18/10/2017, 10:51:30 AM
    Author     : docenteitm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
        
        String cedula="", nombre="";
        
        boolean respuesta= false;
        
         if(request.getParameter("btnCons") != null){
             
             
             Cliente cli = new Cliente();
             
             cedula = request.getParameter("txtcedula");
             
             cli.setCedula(cedula);
                
             cli.consultar();
                
             nombre = cli.getNombre();
             
             
             
         }
         

         if(request.getParameter("btnIns") != null){
             
             
             
             
             Cliente cli = new Cliente();
             
             cedula = request.getParameter("txtcedula");
             
             nombre = request.getParameter("txtnombre");
             
             cli.setCedula(cedula);
             
             cli.setNombre(nombre);
             
             respuesta = cli.insertar();
             
             
         }
         
         
         
         
         
        %>
        
        <form action="DatosCliente.jsp" method="get">
            
            Digite la cédula:<INPUT TYPE=TEXT NAME=txtcedula value='<%=cedula%>'><BR>
            Nombre del cliente:<INPUT TYPE=TEXT NAME=txtnombre value='<%=nombre%>'><BR>
            
            <% 
            if((respuesta == false) && (request.getParameter("btnIns") != null)){
            
            %>
            
            <H1> No se ingresó ningun registro </H1>
            
            <% } else {
                
                    if((respuesta == true) && (request.getParameter("btnIns") != null)){
             %>
             
             <H1> Ingreso exitoso </H1>
             
               <% }%>
           <% }%>
            
            <INPUT TYPE=SUBMIT NAME=btnCons VALUE=Consultar >
            <br>
            <INPUT TYPE=SUBMIT NAME=btnIns VALUE=Insertar >
            
        </form>
            
        
        
    </body>
</html>
