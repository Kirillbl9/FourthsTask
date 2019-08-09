package CRUD;

import Main.JDBC;
import DAO.Person;
import java.sql.*;

public final class ReadTable {
    public static void readTable() {
        try {
            Statement stmt=null;
            stmt=JDBC.con.createStatement();
            String sql="select id , firstName , secondName from person";
            ResultSet rs=stmt.executeQuery( sql );
            while (rs.next()) {
                int id=rs.getInt( "id" );
                String firstName=rs.getString( "firstName" );
                String secondName=rs.getString( "secondName" );
                Person person=new Person( id, firstName, secondName );
                System.out.println( person.toString() );
            }
        } catch (SQLException err) {
            System.out.println( err.getMessage() );
        }
    }
}

