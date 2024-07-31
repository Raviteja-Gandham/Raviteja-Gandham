package com.raviteja.jdbc;
import java.sql.*;
//import java.sql.SSL;
public class EmployeesFetch {

			public static void main(String[] args) throws Exception  {
				
			
				        // Step 1: Load the JDBC driver
				        Class.forName("com.mysql.cj.jdbc.Driver");

				        // Step 2: Establish the connection
				        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raviteja?useSSL=false", "root", "Raviteja@2001");

				        // Step 3: Create a statement
				        Statement st = con.createStatement();

				        // Step 4: Execute a query
				        ResultSet rs = st.executeQuery("SELECT * FROM Employees");

				        // Step 5: Process the result set
				        System.out.println("ID\tFirst_Name\tLast_Name\tAge\tDesignation");
				        System.out.println("-----------------------------------------------------------");
				        while (rs.next()) {
				        	System.out.println(rs.getString(1)+"\t "+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDate(4)+"\t"+rs.getString(5));
							
				        	//System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getString(4));
				        }
				        // Step 6: Close the resources
				        rs.close();
				        st.close();
				        con.close();
			}

	}
