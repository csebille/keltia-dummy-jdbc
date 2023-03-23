package io.keltia.driver.dummy;


import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:keltia:dummy://hello-world";
    // static final String USER = "guest";
    // static final String PASS = "guest123";
    static final String QUERY = "SELECT id, text FROM dummy";

    public static void main(String[] args) {

        try {
            Driver instanceDriver = new DummyDriver();
            DriverManager.registerDriver(instanceDriver);

            Class.forName("io.keltia.driver.dummy.DummyDriver");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL); //, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY);) {

            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.println(", Text: " + rs.getString("text"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}