/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import ejb_book.BookEntityFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persist_book.BookEntity;

/**
 *
 * @author SLC
 */
@WebServlet(name = "DoUpdateBook", urlPatterns = {"/DoUpdateBook"})
public class DoUpdateBook extends HttpServlet {
    @EJB
    private BookEntityFacadeLocal bookEntityFacade;

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
        PrintWriter out = response.getWriter();
        
        String isbn = request.getParameter("isbn");
        String title = request.getParameter("title");
        String price = request.getParameter("price");
        String year  = request.getParameter("year");
        String lang  = request.getParameter("lang");
        
        double book_price = 0.0;
        int book_year = 0;
        
        BookEntity book = new BookEntity();
        
        if(isbn!=null && !"".equals(isbn)){
            book.setIsbn(isbn);
        }
        if(title!=null && !"".equals(title)){
            book.setTitle(title);
        }
        if(price!=null && !"".equals(price)){
            book_price = Double.parseDouble(price);
            book.setPrice(book_price);
        }
        if(year!=null && !"".equals(year)){
            book_year = Integer.parseInt(year);
            book.setYear_book(book_year);
        }
        if(lang!=null && !"".equals(lang)){
            book.setLanguage(lang);
        }
        
        bookEntityFacade.edit(book);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
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
