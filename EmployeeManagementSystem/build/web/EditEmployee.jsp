<%-- 
    Document   : EditEmployee
    Created on : 4 Jul, 2023, 9:30:32 AM
    Author     : yaswa
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Employee</title>
    </head>
    <body>
        <%
             int empid=Integer.parseInt(request.getParameter("empid"));
             String firstname=request.getParameter("firstname");
             String lastname=request.getParameter("lastname");
             String dob=request.getParameter("dob");
             String contact=request.getParameter("contact");
             String email=request.getParameter("email");
             String gender=request.getParameter("gender");
             String designation=request.getParameter("designation");
             float salary=Float.parseFloat(request.getParameter("salary"));
             String state=request.getParameter("state");
             String country=request.getParameter("country");
             String joiningdate=request.getParameter("joiningdate");
             float workinghours=Float.parseFloat(request.getParameter("workinghours"));
             int zipcode=Integer.parseInt(request.getParameter("zipcode"));
             String password=request.getParameter("password");
             
             Connection con=null;
             try
             {
                 Class.forName(application.getInitParameter("driver"));
                 con=DriverManager.getConnection(application.getInitParameter("url"), application.getInitParameter("user"), application.getInitParameter("pass"));
                 String update="update employee set firstname=?,lastname=?,dob=?,contact=?,email=?,gender=?,designation=?,salary=?,state=?,country=?,joiningdate=?,workinghours=?,zipcode=?,password=? where empid=?";
                 PreparedStatement ps=con.prepareStatement(update);
                 ps.setString(1, firstname);
                 ps.setString(2, lastname);
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
                 ps.setString(14, password);
                 ps.setInt(15, empid);
                 
                 int status=ps.executeUpdate();
                 if(status>0)
                 {
                     String msg="<script>Record is updated</script>";
                     request.getRequestDispatcher("ViewEmployees.jsp?msg="+msg).include(request, response);
                 }
                 else
                 {
                     out.print("<script>Record is not updated</scrpit>");
                     request.getRequestDispatcher("EditEmployeeForm.jsp?empid="+empid).include(request, response);
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
