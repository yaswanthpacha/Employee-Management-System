package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ViewEmployees_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Employees</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr><th>Action</th><th>Slno</th><th>EmpId</th><th>FirstName</th><th>LastName</th><th>DOB</th><th>Contact</th><th>Email</th><th>Gender</th><th>designation</th><th>Salary</th><th>State</th><th>Country</th><th>JoiningDate</th><th>WorkingHours</th><th>ZipCode</th><th>Password</th><th>EntryDate</th></tr>\n");
      out.write("        ");

            //Scriplet tag
            Connection con=null;
            try
            {
               String driver=application.getInitParameter("driver");
               //System.out.println("Driver :"+driver); 
               String url=application.getInitParameter("url");
               String user=application.getInitParameter("user");
               String pass=application.getInitParameter("pass");
               
                Class.forName(driver);
                con=DriverManager.getConnection(url, user, pass);
                
                String sql="select * from employee";
                
                Statement smt=con.createStatement();
                ResultSet rs=smt.executeQuery(sql);
                int slno=0;
                while(rs.next())
                {
                    slno++;
                    int empid=rs.getInt("empid");
            
      out.write("\n");
      out.write("           \n");
      out.write("            <tr><td><a href=\"EditEmployeeForm.jsp?empid=");
      out.print(empid);
      out.write("\">Edit</a> | <a href=\"DeleteEmployeeForm.jsp?empid=");
      out.print(empid);
      out.write("\">Delete</a></td><td>");
      out.print(slno);
      out.write("</td><td>");
      out.print(rs.getString("empid"));
      out.write("</td><td>");
      out.print(rs.getString("firstname"));
      out.write("</td><td>");
      out.print(rs.getString("lastname"));
      out.write("</td><td>");
      out.print(rs.getString("dob"));
      out.write("</td><td>");
      out.print(rs.getString("contact"));
      out.write("</td><td>");
      out.print(rs.getString("email"));
      out.write("</td><td>");
      out.print(rs.getString("gender"));
      out.write("</td><td>");
      out.print(rs.getString("designation"));
      out.write("</td><td>");
      out.print(rs.getString("salary"));
      out.write("</td><td>");
      out.print(rs.getString("state"));
      out.write("</td><td>");
      out.print(rs.getString("country"));
      out.write("</td><td>");
      out.print(rs.getString("joiningdate"));
      out.write("</td><td>");
      out.print(rs.getString("workinghours"));
      out.write("</td><td>");
      out.print(rs.getString("zipcode"));
      out.write("</td><td>");
      out.print(rs.getString("password"));
      out.write("</td><td>");
      out.print(rs.getString("entrydate"));
      out.write("</td></tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");

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
            
        
        
      out.write("\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
