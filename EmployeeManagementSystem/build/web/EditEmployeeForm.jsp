<%-- 
    Document   : EditEmployeeForm
    Created on : 3 Jul, 2023, 4:37:08 PM
    Author     : yaswa
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Employee Form</title>
    </head>
    <body>
        <form action="EditEmployee.jsp" method="post" onsubmit="confirm('Record is updated');">
            <table>
        <%
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
        %>
        <tr>
        <tr><td>Employee ID</td><td><input type="text" name="empid" value="<%=rs.getString("empid")%>" readonly/></td></tr>
        <tr><td>First Name</td><td><input type="text" name="firstname" value="<%=rs.getString("firstname")%>"/></td></tr>
            <tr><td>Last Name</td><td><input type="text" name="lastname" value="<%=rs.getString("lastname")%>"/></td></tr>
            <tr><td>Date Of Birth</td><td><input type="date" name="dob" value="<%=rs.getString("dob")%>"/></td></tr>
            <tr><td>Contact Number</td><td><input type="number" name="contact" value="<%=rs.getString("contact")%>"/></td></tr>
            <tr><td>Email</td><td><input type="emai" name="email" value="<%=rs.getString("email")%>"/></td></tr>
            
            <tr><td>Gender</td>
                        <td><select name="gender">
                                <option style="background-color: yellow;"><%=rs.getString("gender")%></option>
                                <option>Male</option>
                                <option>Female</option>
                                <option>Other</option>
                    </select>
                        </td></tr>
            <tr><td>Designation</td>
                <td>
                    <select name="designation">
                        <option style="background-color: yellow;"><%=rs.getString("designation")%></option>
                        <option>Java Developer</option>
                    <option>Junior Java Developer</option>
                    <option>Android Developer</option>
                    <option>Python Developer</option>
                    <option>Technical Support</option>
                    <option>Web Developer</option>
                    <option>Backend Developer</option>
                    <option>Frontend Developer</option>
                    <option>Full Stack Java Developer</option>
                    </select> 
                </td></tr>
            <tr><td>Salary</td><td><input type="number" name="salary" value="<%=rs.getString("salary")%>"/></td></tr>
            <tr><td>State</td>
                <td>
                    <select name="state">
                        <option style="background-color: yellow;"><%=rs.getString("state")%></option>
                         <option value="Andhra Pradesh">Andhra Pradesh</option>
                          <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                          <option value="Assam">Assam</option>
                          <option value="Bihar">Bihar</option>
                          <option value="Chhattisgarh">Chattisgarh</option>
                          <option value="Goa">Goa</option>
                          <option value="Gujarat">Gujarat</option>
                          <option value="Haryana">Haryana</option>
                          <option value="Himachal Pradesh">Himachal Pradesh</option>
                          <option value="Jammu and Kashmir">Jammu and Kashmir</option>
                          <option value="Jharkhand">Jharkhand</option>
                          <option value="Karnataka">Karnataka</option>
                          <option value="Kerala">Kerala</option>
                          <option value="Madhya Pradesh">Madhya Pradesh</option>
                          <option value="Maharashtra">Maharashtra</option>
                          <option value="Manipur">Manipur</option>
                          <option value="Meghalaya">Meghalaya</option>
                          <option value="Mizoram">Mizoram</option>
                          <option value="Nagaland">Nagaland</option>
                          <option value="Odisha">Odisha</option>
                          <option value="Punjab">Punjab</option>
                          <option value="Rajasthan">Rajasthan</option>
                          <option value="Sikkim">Sikkim</option>
                          <option value="Tamil Nadu">Tamil Nadu</option>
                          <option value="Telangana">Telangana</option>
                          <option value="Tripura">Tripura</option>
                          <option value="Uttar Pradesh">Uttar Pradesh</option>
                          <option value="Uttarakhand">Uttarakhand</option>
                          <option value="West Bengal">West Bengal</option>
                    </select> 
                </td></tr>
            <tr><td>Country</td>
                <td>
                    <select name="country">
                        <option style="background-color: yellow;"><%=rs.getString("country")%></option>
                        <option value="India">India</option>
                    <option value="australia">Australia</option>
                    <option value="canada">Canada</option>
                    <option value="Usa">USA</option>
                    <option value="Nepal">Nepal</option>
                    <option value="China">China</option>
                    <option value="Sri Lanka">Sri Lanka</option>
                    <option value="Uganda">Uganda</option>
                    <option value="Pakistan">Pakistan</option>
                    </select> 
                </td></tr>
            <tr><td>Joining Date</td><td><input type="date" name="joiningdate" value="<%=rs.getString("joiningdate")%>"/></td></tr>
            <tr><td>Working Hours</td><td><input type="number" name="workinghours" value="<%=rs.getString("workinghours")%>"/></td></tr>
            <tr><td>Zip Code</td><td><input type="number" name="zipcode" value="<%=rs.getString("zipcode")%>"/></td></tr>
            <tr><td>Password</td><td><input type="password" name="password" value="<%=rs.getString("password")%>"/></td></tr>
            
        </tr>    
        
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
            <tr>
            <td colspan="2"><input type="submit" value="Update Employee"/></td>
        </tr>
            </table>
        </form>
    </body>
</html>