package com.raviteja.jdbc;
import java.sql.*;
public class EmployeeTableInsertData {

			public static void main(String[] args) throws Exception {
					
						        // Step 1: Load the JDBC driver
						        Class.forName("com.mysql.cj.jdbc.Driver");

						        // insert data into a table
						        String q = "insert into Employees values(1,'John','Doe',30);";
						        
						        // Step 2: Establish the connection
						        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raviteja?useSSL=false", "root", "Raviteja@2001");

						        // Step 3: Create a statement
						        Statement st = con.createStatement();
						        
						        // Step 4: Execute a query
						        st.executeUpdate(q);

						        // Step 5: Process the result set
						       System.out.println("Inserted data into the table successfully...");
						       
						        // Step 6: Close the resources
						        
						        st.close();
						        con.close();
			}

}
