/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolresult;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SAHU COMPUTER
 */
public class DbConnection {
    public Connection connect()
    {
        try
        {
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","akshat","akshat");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("error in connection"+ e);
        }
                    return null;
    }        
}

