package com.raviteja.jdbc;
import java.sql.*;
public class EmployeeTableUpdate {

					public static void main(String[] args) throws Exception {
							
								        // Step 1: Load the JDBC driver
								        Class.forName("com.mysql.cj.jdbc.Driver");

								        // update table
								        String q = "alter table employees add column designation varchar(50);";
								        String q1 = "update employees set designation = 'Trainee_Engineer' where First_Name = 'John';";
								        String q2 = "update employees set age = 35, designation = 'Software_Engineer' where First_Name = 'John';";
								        // Step 2: Establish the connection
								        String url = "jdbc:mysql://localhost:3306/raviteja?useSSL=false";
								        String username = "root";
								        String password = "Raviteja@2001";
								        Connection con = DriverManager.getConnection(url, username, password);

								        // Step 3: Create a statement
								        Statement st = con.createStatement();
								        
								      // Step 4: Execute a query
								        st.executeUpdate(q);
								        st.executeUpdate(q1);
								        st.executeUpdate(q2); 

								        // Step 5: Process the result set
								       System.out.println("Updated table successfully...");
								       
								        // Step 6: Close the resources
								        
								        st.close();
								        con.close();
			}

}
