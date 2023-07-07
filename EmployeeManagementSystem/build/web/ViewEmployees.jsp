<%-- 
    Document   : ViewEmployees
    Created on : 3 Jul, 2023, 3:25:11 PM
    Author     : yaswa
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Employees</title>
    </head>
    <body>
        <table border="1">
            <tr><th>Action</th><th>Slno</th><th>EmpId</th><th>FirstName</th><th>LastName</th><th>DOB</th><th>Contact</th><th>Email</th><th>Gender</th><th>designation</th><th>Salary</th><th>State</th><th>Country</th><th>JoiningDate</th><th>WorkingHours</th><th>ZipCode</th><th>Password</th><th>EntryDate</th></tr>
        <%
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
            %>
           
            <tr><td><a href="EditEmployeeForm.jsp?empid=<%=empid%>">Edit</a> | <a href="DeleteEmployeeForm.jsp?empid=<%=empid%>">Delete</a></td><td><%=slno%></td><td><%=rs.getString("empid")%></td><td><%=rs.getString("firstname")%></td><td><%=rs.getString("lastname")%></td><td><%=rs.getString("dob")%></td><td><%=rs.getString("contact")%></td><td><%=rs.getString("email")%></td><td><%=rs.getString("gender")%></td><td><%=rs.getString("designation")%></td><td><%=rs.getString("salary")%></td><td><%=rs.getString("state")%></td><td><%=rs.getString("country")%></td><td><%=rs.getString("joiningdate")%></td><td><%=rs.getString("workinghours")%></td><td><%=rs.getString("zipcode")%></td><td><%=rs.getString("password")%></td><td><%=rs.getString("entrydate")%></td></tr>
            
            
            <%
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
        
    </table>
            
    </body>
</html>
