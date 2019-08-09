package Inquiries;


import Main.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class ThirdTask_3_3 {
    public static void thirdTask_3_3(String firstPeriod,String secondPeriod){
        try {
            Statement stmt = null;
            stmt = JDBC.con.createStatement();
            String sql = "SELECT Sum(Price) as SumPrice,Sum(Quantity) as SumQuantity  from waybills  join  waybillPosition on waybills.WaybillsID  = waybillPosition.WaybillsID   WHERE WaybillDate between '2007-07-07' and '2010-07-07'";
            ResultSet rs =stmt.executeQuery(sql);
            while(rs.next()) {
                int SumPrice = rs.getInt( "SumPrice" );
                int SumQuantity = rs.getInt( "SumQuantity" );
                System.out.println(SumPrice+"  "+ SumQuantity);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}



