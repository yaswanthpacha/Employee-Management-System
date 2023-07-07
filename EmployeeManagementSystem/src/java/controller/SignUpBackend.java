package controller;

import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class SignUpBackend extends HttpServlet {
    ServletContext jdbc = null;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        jdbc = getServletContext(); // initialize ServletContext or get Object of Servlet Context

        String driver = jdbc.getInitParameter("driver"); // from web.xml file
        String url = jdbc.getInitParameter("url"); // from web.xml file
        String username = jdbc.getInitParameter("user"); // from web.xml file
        String password = jdbc.getInitParameter("pass"); // from web.xml file

        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);

            String insert = "insert into employee(firstname,email,password) values(?,?,?)";

            String useremail = request.getParameter("email");
            String userpassword = request.getParameter("password");

            PreparedStatement ps = con.prepareStatement(insert);
            ps.setString(1, request.getParameter("firstname"));
            ps.setString(2, useremail);
            ps.setString(3, userpassword);

            int status = ps.executeUpdate();
            if (status > 0) {
                out.print("<h3>You have registered successfully. Thank You!..</h3>");
            } else {
                out.print("<h3>You have not registered successfully. please check your data.</h3>");
            }
        } catch (Exception e) {
            out.print(e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                out.print(e);
            }
        }
    }
}
