package CRUD;

import Main.JDBC;

import java.sql.*;
import java.sql.SQLException;

public final class CreateTable{

     public static void createDbUserTable() throws SQLException {
        Statement statement = null;
        String createTableSQL =String.format("CREATE TABLE person(id int ,firstName VARCHAR(20) NOT NULL, secondName VARCHAR(20) NOT NULL)" );

        try {
            statement = JDBC.con.createStatement();
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
