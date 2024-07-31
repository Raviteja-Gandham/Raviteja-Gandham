package com.raviteja.jdbc;
import java.sql.*;
public class EmployeesDelete {

					public static void main(String[] args) throws Exception  {
						
					
						        // Step 1: Load the JDBC driver
						        Class.forName("com.mysql.cj.jdbc.Driver");

						        // Step 2: Establish the connection
						        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raviteja?useSSL=false", "root", "Raviteja@2001");

						        // Step 3: Create a statement
						        Statement st = con.createStatement();

						        // Step 4: Execute a query
						        String delete = "delete from Employees";

						        // Step 5: Process the result set
						       System.out.println("Deleted data from the table Successfully.....");
						      
						       int rows = st.executeUpdate(delete);
						       System.out.println("Number of rows deleted: "+rows);
						       
						       // Step 6: Close the resources
						     
						        st.close();
						        con.close();
	

	}

}
