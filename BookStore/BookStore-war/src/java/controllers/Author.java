/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import ejb_author.AuthorEntityFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persist_author.AuthorEntity;

/**
 *
 * @author SLC
 */
@WebServlet(name = "Author", urlPatterns = {"/Author"})
public class Author extends HttpServlet {

    @EJB
    private AuthorEntityFacadeLocal authorEntityFacade;

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
        PrintWriter out = response.getWriter();

        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("authorID");
        String au_name = request.getParameter("author_name");

        AuthorEntity author = new AuthorEntity();
        author.setName(au_name);

        String action = request.getParameter("action");
        if ("Add".equalsIgnoreCase(action)) {
            authorEntityFacade.create(author);
        } else if ("Edit".equalsIgnoreCase(action)) {
            if (id != null || "".equalsIgnoreCase("")) {
                author.setId(Long.parseLong(id));
            }
            authorEntityFacade.edit(author);
        } else if ("Delete".equalsIgnoreCase(action)) {
            if (id != null || "".equalsIgnoreCase("")) {
                author.setId(Long.parseLong(id));
            }
            authorEntityFacade.remove(author);
        } else if ("Show All".equalsIgnoreCase(action)){
            
        }

        request.setAttribute("author", author);
        request.setAttribute("allAuthors", authorEntityFacade.findAll());
        request.getRequestDispatcher("authors.jsp").forward(request, response);
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
