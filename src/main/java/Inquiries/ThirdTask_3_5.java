package Inquiries;

import Main.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class ThirdTask_3_5 {
   public static void thirdTask_3_5(String firstPeriod,String secondPeriod){
        try {
            Statement stmt = null;
            stmt = JDBC.con.createStatement();
            String sql = "select  Organization,Title from waybills join  waybillPosition on waybills.WaybillsID  = waybillPosition.WaybillsID join nomenclatures on waybillPosition.Nomenclature = nomenclatures.Nomenclature WHERE WaybillDate BETWEEN "+firstPeriod+" AND "+secondPeriod+" GROUP BY nomenclatures.Title, waybills.Organization\n";
            ResultSet rs =stmt.executeQuery(sql);
            while(rs.next()) {
                String organization = rs.getString( "Organization" );
                String title = rs.getString( "Title" );
                System.out.println(organization+"  "+ title);
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}





