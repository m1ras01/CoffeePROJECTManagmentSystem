package com.example.coffeeprojectmar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class database {

    public static Connection connectDB() {

        String url = "jdbc:mysql://localhost:3306/cafe";
        String username = "root";
        String password = "root";

        try {
            // Загрузка драйвера JDBC для MySQL
            Class.forName("com.mysql.jdbc.Driver");

            // Подключение к базе данных MySQL
            Connection connect = DriverManager.getConnection(url, username, password);

            if (connect != null) {
                System.out.println("Подключение к базе данных MySQL установлено!");
                return connect;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ошибка подключения к базе данных MySQL");
            e.printStackTrace();
        }
        return null;
//        try {
//
//            Class.forName("org.postgresql.Driver");
//
//            Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cafe", "postgres","jailaybai");
//            return connect;
//        } catch (Exception e) {
//            return null;
//        }

    }

}
