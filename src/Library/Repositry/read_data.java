package Library.Repositry;

import Library.Connection.Connect;
import Library.Query.Query;

import java.sql.*;

public class read_data {
    public read_data()
    {
        Connection con =  Connect.connection();
        String select = Query.select;
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(select);
            while(rs.next())
            {
                System.out.println("Book Id :- " + rs.getInt(1));
                System.out.println("Book Name :- " + rs.getString(2));
                System.out.println("Book Author :- " + rs.getString(3));
                System.out.println("Book Year :- " + rs.getInt(4));
                System.out.println("-------------------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void search_data(String Query, String val)
    {
        Connection con_search = Connect.connection();
        try{
            PreparedStatement pst = con_search.prepareStatement(Query);
            pst.setString(1,val + "%");
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                System.out.println("Book Id :- " + rs.getInt(1));
                System.out.println("Book Name :- " + rs.getString(2));
                System.out.println("Book Author :- " + rs.getString(3));
                System.out.println("Book Year :- " + rs.getInt(4));
                System.out.println("-------------------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

