/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import ejb_author.AuthorEntityFacadeLocal;
import ejb_book.BookEntityFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persist_author.AuthorEntity;
import persist_book.BookEntity;

/**
 *
 * @author SLC
 */
@WebServlet(name = "AddBook", urlPatterns = {"/AddBook"})
public class AddBook extends HttpServlet {
    @EJB
    private AuthorEntityFacadeLocal authorEntityFacade;

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
        PrintWriter out = response.getWriter();

        response.setContentType("text/html;charset=UTF-8");

        double price_book = 0.0;
        int year_book = 0;

        String isbn = request.getParameter("isbn");
        String title = request.getParameter("title");
        String price = request.getParameter("price");
        String year = request.getParameter("year");
        String lang = request.getParameter("lang");
        String author = request.getParameter("author");

        
        

        BookEntity book = new BookEntity();
        AuthorEntity author_object = null;
        //authors for a book
        ArrayList<String> tokens;
        ArrayList<AuthorEntity> authors;

        if (!"".equals(isbn) && null != isbn) {
            book.setIsbn(isbn);
        }
        if (!"".equals(lang) && null != lang) {
            book.setLanguage(lang);
        }
        if(!"".equals(title) && null != title){
            book.setTitle(title);
        }
        if(!"".equals(price) && null != price){
            price_book = Double.parseDouble(price);
            book.setPrice(price_book);
        }
        if(!"".equals(year) && null != year){
            year_book = Integer.parseInt(year);
            book.setYear_book(year_book);
        }
        if(!"".equals(author) && null != author){
            tokens = new ArrayList<String>(Arrays.asList(author.split(",")));
            authors = new ArrayList<AuthorEntity>();
            for(int i=0;i<tokens.size();i++){
                author_object = new AuthorEntity();
                author_object.setName(tokens.get(i).trim());
                author_object.setBook(book);
                authors.add(author_object);
                
            }
            book.setAuthors(authors);
        }

        bookEntityFacade.create(book);
        
        
     
        
        
        out.println("Success");
        
        request.setAttribute("book", book);
        request.setAttribute("allBooks", bookEntityFacade.findAll());
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
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
