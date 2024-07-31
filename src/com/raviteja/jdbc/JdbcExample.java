package com.raviteja.jdbc;
import java.sql.*;
import javax.net.ssl.SSLException;
public class JdbcExample {

    public static void main(String[] args) throws NumberFormatException, SSLException, Exception{
        // Step 1: Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raviteja?useSSL=false", "root", "Raviteja@2001");

        // Step 3: Create a statement
        Statement st = con.createStatement();

        // Step 4: Execute a query
        ResultSet rs = st.executeQuery("SELECT * FROM student");

        // Step 5: Process the result set
       // System.out.println("CUSTOMER_ID\tACC_NO\tNAME\tDOB\tAGE\tADDRESS\tSTATUS");
        System.out.println("StudentID\tFirstName\tLastName");
        System.out.println("-----------------------------------------------------------");
        while (rs.next()) {
        	//System.out.println(rs.getString(1)+"\t "+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDate(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			
        	System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
        }

        // Step 6: Close the resources
        rs.close();
        st.close();
        con.close();
    }
}