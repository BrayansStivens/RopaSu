/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Negocio.negocioLote;
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
@WebServlet(name = "ServletLotes", urlPatterns = {"/ServletLotes"})
public class ServletLotes extends HttpServlet {

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
            out.println("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n"
                    + "        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n"
                    + "        <link href=\"https://fonts.googleapis.com/css2?family=Poppins&display=swap\" rel=\"stylesheet\"> \n"
                    + "        <link rel=\"icon\" href=\"https://img.icons8.com/dotty/80/000000/button.png\"/>");
            out.println("<title>Servlet prendas</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n"
                    + "");
            out.println("<link rel=\"stylesheet\" href=\"./css/estilos.css\">");
            out.println("</head>");
            out.println("<body class=\"body_registro\">");
            if (request.getParameter("btnSendI") != null) {

                boolean r = false;

                int proceso = Integer.parseInt(request.getParameter("process").toString());

                negocioLote objL = new negocioLote(codigo, proceso);

                r = objL.insertar();

                if (r = true) {
                    out.println("<div class=\"container\">\n"
                            + "\n"
                            + "            <div class=\"titulo\">Se agrego correctamente: "+codigo+"</div>\n"
                            + "            <a href=\"./Pages/prendas.jsp\" class=\"link-color\">Volver</a>\n"
                            + "        </div>");
                } else {
                    out.println("<div class=\"container\">\n"
                            + "\n"
                            + "            <div class=\"titulo\">No se agrego correctamente: "+codigo+"</div>\n"
                            + "            <a href=\"./Pages/prendas.jsp\" class=\"link-color\">Volver</a>\n"
                            + "        </div>");
                }

            }
            if (request.getParameter("btnSendC") != null) {

                negocioLote objL = new negocioLote(codigo);
                objL.consultar();
                out.println("<br><br>");
                out.println("<div class=\"container\">\n"
                        + "\n"
                        + "            <div class=\"titulo\">Resultado Consulta</div>\n"
                        + "            <br><h3> Codigo: " + objL.getCodigo() + " </h3>\n"
                        + "            <h3> Proceso: " + objL.getProceso() + "</h3>\n"
                        + "             <a href=\"./Pages/lote.jsp\" class=\"link-color\" >Volver</a>"
                        + "        </div>");

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
