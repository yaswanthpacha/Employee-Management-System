package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class EditEmployeeForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Edit Employee Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"EditEmployee.jsp\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("        ");

            int empid=Integer.parseInt(request.getParameter("empid"));
            Connection con=null;
            try
            {
                Class.forName(application.getInitParameter("driver"));
                con=DriverManager.getConnection(application.getInitParameter("url"), application.getInitParameter("user"), application.getInitParameter("pass"));
                String sql="select * from employee where empid=?";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setInt(1,empid);
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("        <tr><td>Employee ID</td><td><input type=\"text\" name=\"empid\" value=\"");
      out.print(rs.getString("empid"));
      out.write("\" readonly/></td></tr>\n");
      out.write("        <tr><td>First Name</td><td><input type=\"text\" name=\"firstname\" value=\"");
      out.print(rs.getString("firstname"));
      out.write("\"/></td></tr>\n");
      out.write("            <tr><td>Last Name</td><td><input type=\"text\" name=\"lastname\" value=\"");
      out.print(rs.getString("lastname"));
      out.write("\"/></td></tr>\n");
      out.write("            <tr><td>Date Of Birth</td><td><input type=\"date\" name=\"dob\" value=\"");
      out.print(rs.getString("dob"));
      out.write("\"/></td></tr>\n");
      out.write("            <tr><td>Contact Number</td><td><input type=\"number\" name=\"contact\" value=\"");
      out.print(rs.getString("contact"));
      out.write("\"/></td></tr>\n");
      out.write("            <tr><td>Email</td><td><input type=\"emai\" name=\"email\" value=\"");
      out.print(rs.getString("email"));
      out.write("\"/></td></tr>\n");
      out.write("            \n");
      out.write("            <tr><td>Gender</td>\n");
      out.write("                        <td><select name=\"gender\">\n");
      out.write("                                <option style=\"background-color: yellow;\">");
      out.print(rs.getString("gender"));
      out.write("</option>\n");
      out.write("                                <option>Male</option>\n");
      out.write("                                <option>Female</option>\n");
      out.write("                                <option>Other</option>\n");
      out.write("                    </select>\n");
      out.write("                        </td></tr>\n");
      out.write("            <tr><td>Designation</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"designation\">\n");
      out.write("                        <option style=\"background-color: yellow;\">");
      out.print(rs.getString("designation"));
      out.write("</option>\n");
      out.write("                        <option>Java Developer</option>\n");
      out.write("                    <option>Junior Java Developer</option>\n");
      out.write("                    <option>Android Developer</option>\n");
      out.write("                    <option>Python Developer</option>\n");
      out.write("                    <option>Technical Support</option>\n");
      out.write("                    <option>Web Developer</option>\n");
      out.write("                    <option>Backend Developer</option>\n");
      out.write("                    <option>Frontend Developer</option>\n");
      out.write("                    <option>Full Stack Java Developer</option>\n");
      out.write("                    </select> \n");
      out.write("                </td></tr>\n");
      out.write("            <tr><td>Salary</td><td><input type=\"number\" name=\"salary\" value=\"");
      out.print(rs.getString("salary"));
      out.write("\"/></td></tr>\n");
      out.write("            <tr><td>State</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"state\">\n");
      out.write("                        <option style=\"background-color: yellow;\">");
      out.print(rs.getString("state"));
      out.write("</option>\n");
      out.write("                         <option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("                          <option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\n");
      out.write("                          <option value=\"Assam\">Assam</option>\n");
      out.write("                          <option value=\"Bihar\">Bihar</option>\n");
      out.write("                          <option value=\"Chhattisgarh\">Chattisgarh</option>\n");
      out.write("                          <option value=\"Goa\">Goa</option>\n");
      out.write("                          <option value=\"Gujarat\">Gujarat</option>\n");
      out.write("                          <option value=\"Haryana\">Haryana</option>\n");
      out.write("                          <option value=\"Himachal Pradesh\">Himachal Pradesh</option>\n");
      out.write("                          <option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\n");
      out.write("                          <option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("                          <option value=\"Karnataka\">Karnataka</option>\n");
      out.write("                          <option value=\"Kerala\">Kerala</option>\n");
      out.write("                          <option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("                          <option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("                          <option value=\"Manipur\">Manipur</option>\n");
      out.write("                          <option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("                          <option value=\"Mizoram\">Mizoram</option>\n");
      out.write("                          <option value=\"Nagaland\">Nagaland</option>\n");
      out.write("                          <option value=\"Odisha\">Odisha</option>\n");
      out.write("                          <option value=\"Punjab\">Punjab</option>\n");
      out.write("                          <option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("                          <option value=\"Sikkim\">Sikkim</option>\n");
      out.write("                          <option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("                          <option value=\"Telangana\">Telangana</option>\n");
      out.write("                          <option value=\"Tripura\">Tripura</option>\n");
      out.write("                          <option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
      out.write("                          <option value=\"Uttarakhand\">Uttarakhand</option>\n");
      out.write("                          <option value=\"West Bengal\">West Bengal</option>\n");
      out.write("                    </select> \n");
      out.write("                </td></tr>\n");
      out.write("            <tr><td>Country</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"country\">\n");
      out.write("                        <option style=\"background-color: yellow;\">");
      out.print(rs.getString("country"));
      out.write("</option>\n");
      out.write("                        <option value=\"India\">India</option>\n");
      out.write("                    <option value=\"australia\">Australia</option>\n");
      out.write("                    <option value=\"canada\">Canada</option>\n");
      out.write("                    <option value=\"Usa\">USA</option>\n");
      out.write("                    <option value=\"Nepal\">Nepal</option>\n");
      out.write("                    <option value=\"China\">China</option>\n");
      out.write("                    <option value=\"Sri Lanka\">Sri Lanka</option>\n");
      out.write("                    <option value=\"Uganda\">Uganda</option>\n");
      out.write("                    <option value=\"Pakistan\">Pakistan</option>\n");
      out.write("                    </select> \n");
      out.write("                </td></tr>\n");
      out.write("            <tr><td>Joining Date</td><td><input type=\"date\" name=\"joiningdate\" value=\"");
      out.print(rs.getString("joiningdate"));
      out.write("\"/></td></tr>\n");
      out.write("            <tr><td>Working Hours</td><td><input type=\"number\" name=\"workinghours\" value=\"");
      out.print(rs.getString("workinghours"));
      out.write("\"/></td></tr>\n");
      out.write("            <tr><td>Zip Code</td><td><input type=\"number\" name=\"zipcode\" value=\"");
      out.print(rs.getString("zipcode"));
      out.write("\"/></td></tr>\n");
      out.write("            <tr><td>Password</td><td><input type=\"password\" name=\"password\" value=\"");
      out.print(rs.getString("password"));
      out.write("\"/></td></tr>\n");
      out.write("            \n");
      out.write("        </tr>    \n");
      out.write("        \n");
      out.write("        ");

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
      out.write("            <tr>\n");
      out.write("            <td colspan=\"2\"><input type=\"submit\" value=\"Update Employee\"/></td>\n");
      out.write("        </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
