package Inquiries;

import Main.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class ThirdTask_3_1 {
   public static void thirdTask_3_1(){
        try {
            Statement stmt = null;
            stmt = JDBC.con.createStatement();
            String sql = "select Organization, Quantity from waybills inner join  waybillPosition on waybills.WaybillsID = waybillPosition.WaybillsID ORDER BY Quantity DESC LIMIT 10";
            ResultSet rs =stmt.executeQuery(sql);
            while(rs.next()) {
                String organization = rs.getString( "Organization" );
                int quantity = rs.getInt( "Quantity" );
                System.out.println(organization+"  "+ quantity);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
