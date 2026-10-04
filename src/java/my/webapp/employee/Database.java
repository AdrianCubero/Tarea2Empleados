/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package my.webapp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

private final String url = "jdbc:mysql://localhost:3306/empresa";
private final String user = "root";
private final String password = "Admin$1234";

public Connection getConnection() {

Connection con = null;

try {

Class.forName("com.mysql.cj.jdbc.Driver");

con = DriverManager.getConnection(
url,
user,
password);

} catch (ClassNotFoundException | SQLException e) {
}

return con;
}
}
