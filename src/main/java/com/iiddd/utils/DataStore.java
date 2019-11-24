package com.iiddd.utils;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DataStore {

    private static final String USERNAME = "test";
    private static final String PASSWORD = "test";
    private static final String DB_PATH = "jdbc:sqlite:water.sqlite.db";

    public static ResultSet getWateringHistory() {
        ResultSet resultSet = null;
        try {
            resultSet = getConnection().prepareStatement("SELECT * FROM history_small").executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    private static Connection getConnection() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", USERNAME);
        connectionProps.put("password", PASSWORD);
        DriverManager.registerDriver(new Driver());
        return DriverManager.getConnection(DB_PATH, connectionProps);
    }
}