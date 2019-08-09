package Inquiries;

import Main.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class ThirdTask_3_2 {
   public static void thirdTask_3_2(int quantitySum){
        try {
            Statement stmt = null;
            stmt = JDBC.con.createStatement();
            String sql = "select Organization, sum(Quantity) as QuantitySum  from waybills inner join  waybillPosition on waybills.WaybillsID = waybillPosition.WaybillsID  where Quantity >"+quantitySum+" GROUP BY waybills.Organization, waybillPosition.Quantity";

            ResultSet rs =stmt.executeQuery(sql);
            while(rs.next()) {
                String organization = rs.getString( "Organization" );
                int quantity = rs.getInt( "QuantitySum" );
                System.out.println(organization+"  "+ quantity);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
