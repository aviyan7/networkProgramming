package org.example;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
//            PreparedStatement ps = con.prepareStatement("select * from roles");
//            ResultSet rs = ps.executeQuery();

            Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stat.executeQuery("select * from roles");
            rs.last();
            int id = rs.getInt("role_id");
            System.out.println(id);
//            while(rs.next()){
//                int id = rs.getInt("role_id");
//                System.out.println(id);
//            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}