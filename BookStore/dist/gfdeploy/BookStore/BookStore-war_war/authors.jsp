<%-- 
    Document   : authors
    Created on : Aug 6, 2014, 9:50:35 PM
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
                    <li><a href="updatebook.jsp">Update a Book</a></li>
                </ul>
                <!-- That's it! -->

                <!-- end of menu bar -->
            </div>

            <!-- main area -->
            <div id="main_area">

                <form action="Author" method="post" class="elegant-aero">
                    <h1>Author

                    </h1>
                    <label>
                        <span>Author ID :</span>
                        <input id="authorID" type="text" name="authorID"  />
                    </label>

                    <label>
                        <span>Author Name :</span>
                        <input id="author_name" type="text" name="author_name"  />
                    </label>


                    <label>
                        <span>&nbsp;</span> 
                        <input type="submit" class="button" value="Show All" name="action"  /> 
                        
                        <input type="submit" class="button" value="Edit" name="action" /> 
                        <input type="submit" class="button" value="Delete" name="action"  /> 
                        

                    </label>    
                </form>



                <div class="CSSTableGenerator" >
                    <table >

                        <tr>
                            <td>
                                Author ID
                            </td>
                            <td >
                                Author Name
                            </td>

                        </tr>
                        <c:forEach items="${allAuthors}" var="auth">
                            <tr>
                                <td><c:out value="${auth.id}" /></td>
                                <td><c:out value="${auth.name}" /></td>
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
