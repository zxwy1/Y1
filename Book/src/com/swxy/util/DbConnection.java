package com.swxy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/book?";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            return conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection conn = DbConnection.getConnection();
        System.out.println(conn);
    }

}
