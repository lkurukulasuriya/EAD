<%-- 
    Document   : updatebook
    Created on : Aug 6, 2014, 9:51:25 PM
    Author     : SLC
--%>

<%@page import="persist_book.BookEntity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta charset="utf-8">
        <title>Book Store</title>
        <link href="css/template.css" rel="stylesheet" type="text/css">

    </head>

    <body>
        <%
            BookEntity book = (BookEntity) request.getAttribute("book");
        %>
    <center>
        <!-- container  -->
        <div id="container">

            <!-- header -->
            <div id="header">



                <!-- end of header-->
            </div>

            <!-- menu bar -->
            <div id="menu">
                <h1>Online Book Store</h1>
                <!-- Here's all it takes to make this navigation bar. -->
                <ul id="nav">
                    <li><a href="index.jsp">Book List</a></li>
                    <li><a href="authors.jsp">Author List</a></li>
                    <li><a href="addbook.jsp">Add a Book</a></li>
                    <li><a href="searchbook.jsp">Search a Book</a></li>
                </ul>
                <!-- That's it! -->

                <!-- end of menu bar -->
            </div>

            <!-- main area -->
            <div id="main_area">

                 <form action="DoUpdateBook" method="post" class="elegant-aero">
                    <h1>Update a Book

                    </h1>
                    <label>
                        <span>ISBN :</span>
                        <input id="isbn" type="text" name="isbn" value="<%=book.getIsbn().toString()%>" readonly />
                    </label>

                    <label>
                        <span>Title :</span>
                        <input id="title" type="text" name="title" value="<%=book.getTitle().toString()%>" />
                    </label>

                     <label>
                        <span>Price :</span>
                        <input id="price" type="text" name="price" value="<%=book.getPrice()%>" />
                    </label>

                     <label>
                        <span>Year :</span>
                        <input id="year" type="text" name="year" value="<%=book.getYear_book()%>" />
                    </label>
                     
                     <label>
                        <span>Language :</span>
                        <input id="lang" type="text" name="lang" value="<%=book.getLanguage().toString()%>" />
                    </label>
                     
                    
                     
                    <label>
                        <span>&nbsp;</span> 
                        <input type="submit" class="button" value="Update" name="action"  /> 
                    </label>    
                </form>
                


                <!-- end of main area -->
            </div>


            <!-- footer -->
            <div id="footer">
                <p> S.L. Chandrasinghe (IT11003892)</p>
                <!-- end of footer -->
            </div>

            <!-- end of container -->
        </div></center>
</body>
</html>
