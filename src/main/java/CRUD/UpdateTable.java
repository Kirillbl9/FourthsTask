package CRUD;

import Main.JDBC;

import java.sql.*;

public final class UpdateTable {
  public static void upDateTable() {
        try {

            PreparedStatement ps = null;
            ps  = JDBC.con.prepareStatement("insert into person(id, firstname, secondname) values(?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Petr");
            ps.setString(3, "Petrov");
            ps.executeUpdate();
        } catch (SQLException err) {
            System.out.println( err.getMessage() );
        }
    }
}

