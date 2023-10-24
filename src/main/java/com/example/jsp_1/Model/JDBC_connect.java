package com.example.jsp_1.Model;

import java.sql.*;

public class JDBC_connect {
    protected Connection connection;
    protected PreparedStatement preparedStatement;
    protected ResultSet resultSet;

    public JDBC_connect() {
        this("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/jsp_server?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC",
                "root", "full505");
    }

    public JDBC_connect(String driver, String url, String id, String pass) {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, id, pass);
            System.out.println("DB connect");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DB_open(String driver, String url, String id, String pass) {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, id, pass);
            System.out.println("DB open");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DB_close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
            System.out.println("DB close");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
