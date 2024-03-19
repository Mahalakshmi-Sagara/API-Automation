package DatabaseAutomation;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseClass
{
    public  Connection connector()
    {
        Connection con=null;
        try
        {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
