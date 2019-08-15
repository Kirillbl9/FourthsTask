package Main;

import CRUD.CreateTable;
import CRUD.DeleteTable;
import CRUD.ReadTable;
import CRUD.UpdateTable;
import Inquiries.*;
import org.jetbrains.annotations.NotNull;

import java.sql.*;

public final class JDBC {
    @NotNull
    public static Connection con=null;

    public static void main(@NotNull String[] args) throws SQLException {

        try {

            con=DriverManager.getConnection( "jdbc:postgresql://localhost:5432/postgres", "postgres", "tsucanovden" );
            //CRUD operation:
            // CreateTable.createDbUserTable();
            // UpdateTable.upDateTable();
            // ReadTable.readTable();
            // DeleteTable.deleteTable();

            //Step 3:
            // ThirdTask_3_1.thirdTask_3_1();
            // ThirdTask_3_2.thirdTask_3_2(1000);
            // ThirdTask_3_3.thirdTask_3_3("'2006-07-07'", "'2010-07-07'");
            // ThirdTask_3_4.thirdTask_3_4("'2006-07-07'", "'2010-07-07'");
             ThirdTask_3_5.thirdTask_3_5("'2006-07-07'", "'2010-07-07'");

        } catch (SQLException err) {
            System.out.println( err.getMessage() );
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}


