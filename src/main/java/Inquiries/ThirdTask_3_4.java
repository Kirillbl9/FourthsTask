package Inquiries;

import Main.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class ThirdTask_3_4 {
  public static void thirdTask_3_4(String firstPeriod,String secondPeriod){
        try {
            Statement stmt = null;
            stmt = JDBC.con.createStatement();
            String sql = "select Organization, avg(price) as avgPrice  from waybills inner join  waybillPosition on waybills.WaybillsID = waybillPosition.WaybillsID WHERE WaybillDate BETWEEN "+firstPeriod+"AND "+secondPeriod+" GROUP BY waybills.Organization, waybillPosition.Price";
            ResultSet rs =stmt.executeQuery(sql);
            while(rs.next()) {
                String organization = rs.getString( "Organization" );
                int avgPrice = rs.getInt( "avgPrice" );
                System.out.println(organization+"  "+ avgPrice);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
