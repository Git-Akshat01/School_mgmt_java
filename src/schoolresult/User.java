/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolresult;

/**
 *
 * @author SAHU COMPUTER
 */

import java.sql.*;
import java.util.*;
public class User {
    String username;
    char password[];
    LoginFail fail = new LoginFail();
    Menu pass = new Menu();
    DbConnection dbc = new DbConnection();
    Connection conn = dbc.connect();
    
    public void login(String usr,char psw[]) throws SQLException
    {
        Statement stmt;
        stmt = conn.createStatement();
        System.out.println("Gadha inside login");
        ResultSet rs = stmt.executeQuery("select * from users where username='"+usr+"'");
        System.out.println("Gadha inside login after resultset");
        if(rs.next())
        {
            System.out.println("Gadha inside if");
            username=rs.getString(1);
            password=rs.getString(2).toCharArray();
        }
        
        if(usr.equals(username) && Arrays.equals(psw,password))
        {
            System.out.println("Gadha inside if of pass");
            pass.setVisible(true);
        }
        else
        {
            System.out.println("Gadha inside else of fail");
            fail.setVisible(true);
        }
                    rs.close();
                    stmt.close();
                    conn.close();
                    
    }
}
