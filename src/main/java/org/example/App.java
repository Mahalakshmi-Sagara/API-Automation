package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try
       {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raghudb?createDatabaseIfNotExist=true","root","tiger");
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery("select * from raghudb.student");
           while(rs.next())
           {
               System.out.println(rs.getInt("id")+"  "+rs.getString("name"));

           }

           System.out.println( "connected" );
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
