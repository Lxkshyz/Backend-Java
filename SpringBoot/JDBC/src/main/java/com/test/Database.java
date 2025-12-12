package com.test;

import java.sql.*;

public class Database {
    private Connection conn;
    public Database(String url, String username, String password) {
        try {
            this.conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            throw new RuntimeException(e);
        }
    }
    public void createUser(String user, int age) {
        String query = "INSERT INTO user_login(user_name, user_age) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, user);
            ps.setInt(2, age);
            ps.executeUpdate();
            System.out.println("Success !");
        } catch (SQLException e) {
            System.err.println("Error adding " + user + " to DB: " + e.getMessage());
        }
    }
    public void renameName(String newName, int id) {
        String query = "UPDATE user_login SET user_name = ? WHERE user_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newName);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Success !");
        } catch (SQLException e) {
            System.err.println("Error Renaming: " + e.getMessage());
        }
    }
    public void deleteUser(int id) {
        String query = "DELETE FROM user_login WHERE user_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Success !");
        } catch (SQLException e) {
            System.err.println("Error deleting USER " + id + ": " + e.getMessage());
        }
    }
    public void deleteAll() {
        String query = "TRUNCATE TABLE user_login";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.executeUpdate();
            System.out.println("Success !");
        } catch (SQLException e) {
            System.err.println("Error deleting all: " + e.getMessage());
        }
    }
    public void getById(int id) {
        String query = "SELECT * FROM user_login WHERE user_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.println("ID: " + rs.getInt("user_id"));
                System.out.println("Name: " + rs.getString("user_name"));
                System.out.println("Age: " + rs.getInt("user_age"));
            }
            if (!found) {
                System.out.println("No user found with ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching user: " + e.getMessage());
        }
    }
    public void close() {
        try {
            if (conn != null && !conn.isClosed()) conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}