package Library.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    private static final String url = "jdbc:mysql://localhost:3306/library";
    private static final String username = "DB_username";
    private static final String password = "DB_password";

    public static Connection connection()
    {
        Connection con = null;
        try{
            con =  DriverManager.getConnection(url,username,password);
            return con;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
