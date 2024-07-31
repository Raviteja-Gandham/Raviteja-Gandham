package com.raviteja.jdbc;
import java.sql.*;
//import javax.net.ssl.SSLException;
public class EmployeesTable {

	public static void main(String[] args) throws Exception {
			
				        // Step 1: Load the JDBC driver
				        Class.forName("com.mysql.cj.jdbc.Driver");

				        // create a table
				        String q = "create table Employees(id int auto_Increment primary key,First_Name varchar(50),Last_Name varchar(50),age int);";
				        
				        // Step 2: Establish the connection
				        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raviteja?useSSL=false", "root", "Raviteja@2001");

				        // Step 3: Create a statement
				        Statement st = con.createStatement();
				        
				        // Step 4: Execute a query
				        st.executeUpdate(q);

				        // Step 5: Process the result set
				       System.out.println("Table created successfully...");
				       
				        // Step 6: Close the resources
				        
				        st.close();
				        con.close();

	}

}
