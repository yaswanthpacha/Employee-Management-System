package controller;

import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.*;

public class Validate extends HttpServlet 
{
     ServletContext jdbc = null;
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
    { PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        jdbc = getServletContext(); // initialize ServletContext or get Object of Servlet Context

        String driver = jdbc.getInitParameter("driver"); // from web.xml file
        String url = jdbc.getInitParameter("url"); // from web.xml file
        String username = jdbc.getInitParameter("user"); // from web.xml file
        String password = jdbc.getInitParameter("pass"); // from web.xml file

        Connection con = null;
        try
        {
             Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
             String email = request.getParameter("email");
            String pass = request.getParameter("password");
            String sqlcheck="select * from employee where email='"+email+"' and password='"+pass+"' ";
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery(sqlcheck);
            boolean status=false;
            while(rs.next())
            {
                status=true;
            }
            if(status==true)
            {
                out.print("Welcome to the dashboard");
            }
            else
            {
                 out.print("invalid username and password");
            }
            
        }
        catch(Exception e)
        {
            out.print(e);
        }
        finally
        {
            try
            {
                con.close();
            }
            catch(Exception e)
            {
                out.print(e);
            }
        }
        
    }
    
}

