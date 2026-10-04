/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package my.webapp.employee;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {

@Override
protected void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {  
List<Employee> employeeList = new ArrayList<>();

try {

Database db = new Database();

    Connection con = db.getConnection();

String sql = "SELECT * FROM empleados";

Statement st = con.createStatement();

ResultSet rs = st.executeQuery(sql);

while (rs.next()) {

Employee employee = new Employee(
rs.getInt("id"),
rs.getString("nombre"),
rs.getString("departamento"));

employeeList.add(employee);
}

con.close();

} catch (Exception e) {

e.printStackTrace();

}

request.setAttribute(
"employeeList",
employeeList);

RequestDispatcher dispatcher =
request.getRequestDispatcher("employee.jsp");

dispatcher.forward(request, response);
}
}



