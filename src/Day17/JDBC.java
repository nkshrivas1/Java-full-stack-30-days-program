package Day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {
    static void main() {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "admin";
        String password = "admin123";

        try{
            // stores active connection
            Connection con = DriverManager.getConnection(
                    url,username,password // +91
            );
            System.out.println("DB Connected");
            String sql="INSERT INTO students VALUES(?,?,?,?,?,?)";

//            Create
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1,7);
//            ps.setString(2,"Keshav");
//            ps.setString(3,"Keshav@gmail.com");
//            ps.setString(4,"Delhi");
//            ps.setInt(5,24);
//            ps.setInt(6,3);
//            ps.executeUpdate();
//            System.out.println("Student created!");
//
            //Update
            String update="UPDATE students SET city=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(update);
            ps.setInt(2,4);

            ps.setString(1,"Amritsar");

            ps.executeUpdate();
            System.out.println("Student updated!");
            int id =4;
            //Delete
            String deleteQ= "DELETE FROM students WHERE id="+id;
            PreparedStatement psDelete = con.prepareStatement(deleteQ);
//            psDelete.setInt(1,3);//they are secure
            psDelete.executeUpdate();
            System.out.println("Deleted");

            //Read
            String readQuery = "SELECT * FROM students";
            PreparedStatement psRead = con.prepareStatement(readQuery);
            ResultSet rs = psRead.executeQuery();
            System.out.println("Id | Name | Email | City | Age | Dept_id");
            while (rs.next()){
                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("name") + " "
                                + rs.getString("email") + " "
                                + rs.getString("city") + " "
                                +rs.getInt("age") + " "
                                +rs.getInt("dept_id") + " "

                );
            }




            con.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}


//JDBC- java database connectivity - is a java API that enables java application
// to connect to databases, execute SQL queries,and retrieve results
// java program - JDBC - MySQL Database
// JDBC Architecture
//java application - JDBC API - MySQL Driver - MySQL database

// JDBC Components
// DriverManager- for creating db connection
// Connection- represents the connection b/w Java and MySql
// Statement -  Executes SQL queries
// PreparedStatement- executes parameterized queries
// ResultSet -  stores records returned by SELECT queries.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.