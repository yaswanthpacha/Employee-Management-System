package controller;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class AddEmployee extends HttpServlet 
{
    ServletContext jdbc=null;
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException
    {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        
        jdbc=getServletContext();//initialize ServletContext or get Object of Servlet Context
        
        String driver=jdbc.getInitParameter("driver");//from web.xml file
        String url=jdbc.getInitParameter("url");//from web.xml file
        String username=jdbc.getInitParameter("user");//from web.xml file
        String password=jdbc.getInitParameter("pass");//from web.xml file
        
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String dob=request.getParameter("dob");
        String contact=request.getParameter("contact");
        String email=request.getParameter("empemail");
        String gender=request.getParameter("gender");
        String designation=request.getParameter("designation");
        float salary=Float.parseFloat(request.getParameter("salary"));
        String state=request.getParameter("state");
        String country=request.getParameter("country");
        String joiningdate=request.getParameter("joiningdate");
        float workinghours=Float.parseFloat(request.getParameter("workinghours"));
        int zipcode=Integer.parseInt(request.getParameter("zipcode"));
        String emppassword=request.getParameter("emppassword");
        
    //Above data are from AddEmployeeForm.html    
        
        Connection con=null;
        try
        {
           Class.forName(driver);
           con=DriverManager.getConnection(url, username, password);
           String insert = "INSERT INTO employee(firstname, lastname, dob, contact, email, gender, designation, salary, state, country, joiningdate, workinghours, zipcode, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement ps=con.prepareStatement(insert);
           ps.setString(1, fname);
           ps.setString(2, lname);
           ps.setString(3, dob);
           ps.setString(4, contact);
           ps.setString(5, email);
           ps.setString(6, gender);
           ps.setString(7, designation);
           ps.setFloat(8, salary);
           ps.setString(9, state);
           ps.setString(10, country);
           ps.setString(11, joiningdate);
           ps.setFloat(12, workinghours);
           ps.setInt(13, zipcode);
           ps.setString(14, emppassword);
           
           int status=ps.executeUpdate();
           
           if(status>0)
           {
               out.print("Employee is added successfully");
           }
           else
           {
               out.print("Employee is not added successfully! Please check your data");
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
