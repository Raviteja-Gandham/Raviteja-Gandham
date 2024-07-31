package com.raviteja.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class DemojdbcSingletonPattern {

	  // step1: creating the singleton class
    private static DemojdbcSingletonPattern jdbc;

    private DemojdbcSingletonPattern() {
    }
     // to make the global access
    public static DemojdbcSingletonPattern getInstance() {
        if (jdbc == null) {
            jdbc = new DemojdbcSingletonPattern();
        }
        return jdbc;
    }

    private static Connection getConnection() throws ClassNotFoundException, SQLException {   // TODO Auto-generated method 
        Class.forName("com.mysql.cj.jdbc.Driver"); //create a new table under the Jdbc crud
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raviteja?autoReconnect=true&useSSL=false", "root", "Raviteja@2001");
        return con;
    }
  //to insert the record into the database 
    public int insert(String name, String pass) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;

        try {
            c = this.getConnection();
            ps = c.prepareStatement("insert into SingleTon(username, password) values(?, ?)");
            ps.setString(1, name);
            ps.setString(2, pass);
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }
  //to view the data from the database 
    public void view(String name) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = this.getConnection();
            ps = con.prepareStatement("select * from SingleTon where username=?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Name= " + rs.getString(2) + "\t" + "Password= " + rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
 // to update the password for the given username 
    public int update(String name, String password) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;
        try {
            c = this.getConnection();
            ps = c.prepareStatement("update SingleTon set password=? where username=?");
            ps.setString(1, password);
            ps.setString(2, name);
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }
 // to delete the data from the database
    public int delete(int userid) throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        int recordCounter = 0;
        try {
            c = this.getConnection();
            ps = c.prepareStatement("delete from SingleTon where uid=?");
            ps.setInt(1, userid);
            recordCounter = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }
        }
        return recordCounter;
    }
}

public class DemojdbcSingletonPatternTest {
	
	static int choice;
    static int count = 1;
    public static void main(String[] args) throws Exception {

    	// object will create only once for jdbc the instance
        DemojdbcSingletonPattern jdbc = DemojdbcSingletonPattern.getInstance();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("CRUD operation:");
        System.out.println("===============================");
        System.out.println("Press 1 : for Insertion:");
        System.out.println("Press 2 : for display or view:");
        System.out.println("Press 3 : for delete:");
        System.out.println("Press 4 : for update:");
        System.out.println("Press 5 : for stop or Exit:");

        // do while loop here

        do {
            System.out.print("Pls enter above any one of your choices: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    System.out.println("Enter the user name you want to insert:");
                    String username = br.readLine();

                    System.out.println("Enter the password you want to insert:");
                    String password = br.readLine();
                    try {
                        int i = jdbc.insert(username, password);
                        if (i > 0) {
                            System.out.println((count++) + " Number of data inserted successfully");
                        } else {
                            System.out.println("Not inserted ");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }// case 1 completed break; // stop the process if press 5
                break;

                case 2: {
                    System.out.println("Enter user name:");
                    String username = br.readLine();
                    try {
                        jdbc.view(username);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }// case 2 completed

                break;

                case 3: {
                    System.out.println("Enter the userId you want to delete:");
                    int userid = Integer.parseInt(br.readLine());

                    try {
                        int i = jdbc.delete(userid);
                        if (i > 0) {
                            System.out.println((count++) + " Number of data deleted successfully");
                        } else {
                            System.out.println("Not deleted...! ");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }// case 3 completed break;

                break;

                case 4: {
                    System.out.println("Enter username you want to update:");
                    String username = br.readLine();
                    System.out.println("Please enter new password:");
                    String password = br.readLine();

                    try {
                        int i = jdbc.update(username, password);
                        if (i > 0) {
                            System.out.println((count++) + " Number of data updated successfully");
                        } else {
                            System.out.println("Not updated...! ");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }// case 4 completed break;
                break;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        } while (choice != 4);
    }
}
