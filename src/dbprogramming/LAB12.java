/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB12 {
    public static void main(String[] args) {
               String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username ="root";
        String password = "mysql@sit";                
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection connection= DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String sql = "Insert into student (StudentID,Firstname,Lastname,Email,DeptID)" + 
                    "VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"651114");
            preparedStatement.setString(2,"Porama");
            preparedStatement.setString(3,"Jirasupadilok");
            preparedStatement.setString(4,"porama.jira@gmail.com");
            preparedStatement.setString(5,"IT");
            statement.executeUpdate(sql);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
