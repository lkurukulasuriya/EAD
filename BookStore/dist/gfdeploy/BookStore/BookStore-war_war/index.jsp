<%-- 
    Document   : index
    Created on : Aug 6, 2014, 9:35:25 PM
    Author     : SLC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

                <form action="ListBooks" method="post" class="elegant-aero">


                    <label>
                        <span>&nbsp;</span> 
                        <input type="submit" class="button" value="Show All" name="action"  /> 

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
                        <c:forEach items="${allBooks}" var="book">
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
            <div id="footer">
                <p> S.L. Chandrasinghe (IT11003892)</p>
                <!-- end of footer -->
            </div>

            <!-- end of container -->
        </div></center>
</body>
</html>
