package CRUD;

import Main.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public final class DeleteTable {

    public static void deleteTable() {
        try {
            Statement stmt=null;
            stmt=JDBC.con.createStatement();
            String sql="drop table person ";
            stmt.executeUpdate( sql );
        } catch (SQLException err) {
            System.out.println( err.getMessage() );
        }
    }
}



