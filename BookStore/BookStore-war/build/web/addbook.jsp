<%-- 
    Document   : addbook
    Created on : Aug 6, 2014, 9:51:11 PM
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
                    <li><a href="updatebook.jsp">Update a Book</a></li>
                </ul>
                <!-- That's it! -->

                <!-- end of menu bar -->
            </div>

            <!-- main area -->
            <div id="main_area">

                 <form action="AddBook" method="post" class="elegant-aero">
                    <h1>Add a Book

                    </h1>
                    <label>
                        <span>ISBN :</span>
                        <input id="isbn" type="text" name="isbn"  />
                    </label>

                    <label>
                        <span>Title :</span>
                        <input id="title" type="text" name="title"  />
                    </label>

                     <label>
                        <span>Price :</span>
                        <input id="price" type="text" name="price"  />
                    </label>

                     <label>
                        <span>Year :</span>
                        <input id="year" type="text" name="year"  />
                    </label>
                     
                     <label>
                        <span>Language :</span>
                        <input id="lang" type="text" name="lang"  />
                    </label>
                     
                     <label>
                        <span>Author :</span>
                        <input id="author" type="text" name="author" placeholder="add more authors using comma ," />
                    </label>
                     
                    <label>
                        <span>&nbsp;</span> 
                        <input type="submit" class="button" value="Add" name="action"  /> 
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
