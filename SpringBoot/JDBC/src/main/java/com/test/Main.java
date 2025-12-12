package com.test;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        String user = dotenv.get("DB_USER");
        String password = dotenv.get("DB_PASS");
        String url = dotenv.get("DB_URL");
        try (Connection conn = DriverManager.getConnection(url,user,password)) {
            Statement stmt = conn.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.close();

            String query = String.format(
                    "INSERT INTO user_login(user_id, user_name, user_age) VALUES (%d, '%s', %d)",
                    id, name, age
            );

            int rowsAffected = stmt.executeUpdate(query);
            System.out.println("Inserted! Rows affected: " + rowsAffected);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}