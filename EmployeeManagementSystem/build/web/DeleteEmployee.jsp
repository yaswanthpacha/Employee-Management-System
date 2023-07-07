<%-- 
    Document   : DeleteEmployee
    Created on : 4 Jul, 2023, 11:43:32 AM
    Author     : yaswa
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int empid=Integer.parseInt(request.getParameter("empid"));
            Connection con=null;
            try
            {
                Class.forName(application.getInitParameter("driver"));
                con=DriverManager.getConnection(application.getInitParameter("url"), application.getInitParameter("user"), application.getInitParameter("pass"));
                String delete="delete from employee where empid=?";
                PreparedStatement ps=con.prepareStatement(delete);
                ps.setInt(1,empid);
                int status=ps.executeUpdate();
                
                if(status>0)
                {
                   request.getRequestDispatcher("ViewEmployees.jsp").include(request, response);
                }
                else
                {
                    out.print("Record is not deleted Please check the employee id . Thank you");
                }
                    
            }
            catch(Exception e)
            {
                out.print(e);
            }
            finally
            {
                con.close();
            }
            
            
            
            
            
            
            %>
    </body>
</html>
