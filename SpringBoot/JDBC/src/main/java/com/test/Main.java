package com.test;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;
import java.util.*;
import com.test.Database;

public class Main {
    public static void main(String[] args) {
        Dotenv dt = Dotenv.load();
        String url = dt.get("DB_URL");
        String user = dt.get("DB_USER");
        String password = dt.get("DB_PASSWORD");
        Database db = new Database(url, user, password);
        db.createUser("Lakshya", 18);
        db.getById(1);
    }
}