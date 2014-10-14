<%-- 
    Document   : searchbook
    Created on : Aug 6, 2014, 9:51:42 PM
    Author     : SLC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Book Store</title>
        <link href="css/template.css" rel="stylesheet" type="text/css">
    </head>

    <body>
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

                <form action="SearchBook" method="post" class="elegant-aero">
                    <h1>Search Books

                    </h1>
                    <label>
                        <span>Search By :</span>
                        <select name="search" id="search">
                            <option value="isbn">ISBN</option>
                            <option value="title">Title</option>
                            <option value="price">Price</option>
                            <option value="year_book">Year</option>
                            <option value="language">Language</option>
                            <option value="author">Author</option>
                        </select>
                    </label>

                    <label>
                        <span>Search Value :</span>
                        <input id="search_value" type="text" name="search_value"  />
                    </label>


                    <label>
                        <span>&nbsp;</span> 
                        <input type="submit" class="button" value="Search" name="action"  /> 
                        
                    </label>    
                </form>



                <div class="CSSTableGenerator" >
                    <table >

                        <tr>
                            <td >
                                ISBN
                            </td>
                            <td >
                                Language
                            </td>
                            <td >
                                Price
                            </td>
                            <td >
                                Title
                            </td>
                            <td >
                                Book Year
                            </td>
                            <td>

                            </td>
                            <td>

                            </td>

                        </tr>
                        <c:forEach items="${allAuthors}" var="auth">
                            <tr>
                               
                                <td><c:out value="${book.isbn}" /></td>
                                <td><c:out value="${book.language}" /></td>
                                <td><c:out value="${book.price}" /></td>
                                <td><c:out value="${book.title}" /></td>
                                <td><c:out value="${book.year_book}" /></td>
                                <td><a href="<%=request.getContextPath()%>/UpdateBook?id=<c:out value='${book.isbn}' />">edit</a></td>
                                <td><a href="<%=request.getContextPath()%>/ViewBook?id=<c:out value='${book.isbn}' />">view</a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>

                <!-- end of main area -->
            </div>


            <!-- footer -->


            <!-- end of container -->
        </div></center>
</body>
</html>
