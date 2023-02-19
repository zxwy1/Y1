package com.swxy.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Usercheck {
    public boolean validate(String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "select * from t_user where t_user.username='" + username + "' and t_user.password='" + password + "'";
        try (
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/book?"
                        + "user=root&password=123456");
                Statement ps = conn.createStatement();
                ResultSet rs = ps.executeQuery(sql)) {
            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}