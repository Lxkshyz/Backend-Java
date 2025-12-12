package com.test;
import io.github.cdimascio.dotenv.Dotenv;

public class database {
    static Dotenv dt = Dotenv.load();
    private static String url = dt.get("DB_URL");
    private static String user = dt.get("DB_USER");
    private static String password = dt.get("DB_PASSWORD");

}
