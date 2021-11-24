/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Negocio.Prendas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author braya
 */
@WebServlet(name = "prendas", urlPatterns = {"/prendas"})
public class prendas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           String codigo = request.getParameter("code").toString();
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet prendas</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if(request.getParameter("btnSendI")!=null){
                
                boolean r =false;
                
                String nombre = request.getParameter("name").toString();
                String classi = request.getParameter("class").toString();
                String lote = request.getParameter("lot").toString();
                String tiempo = request.getParameter("time").toString();
                int cantidad = Integer.parseInt(request.getParameter("amounts").toString());
            
                Prendas objP = new Prendas(codigo, nombre, classi, tiempo, cantidad);
                
                r= objP.insertar();
                
                if(r=true){
                    out.println("<h1>Ingresado con exito: "  +nombre+ "</h1>");
                }else{
                    out.println("<h1>Ingresado sin exito: "  +nombre+ "</h1>");
                }
                
            }
            if(request.getParameter("btnSendC")!=null){
                
                out.println("<h1>Consultar "  + codigo + "</h1>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
