/*
 * Document: MyPage.java
 * Unitec Institute of Technology
 * @authors Natasha Bettridge, Taylor Tran and Michael Yin
 * Document: contains database connect
 */

/**
 *

 */
package Lumen;
import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectDB {
    Connection conn = null;
/* In this section please change the path to connect to the database.
*/
    public static Connection connectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
           //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Richard David/Desktop/UPH/SEMESTER 7/INTERAKSI MANUSIA DAN KOMPUTER/Lumen Netbeans/Lumen/src/bin/words.db");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:src\\Lumen\\words.db");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    public static Connection connectLogin(){
        try{
            Class.forName("org.sqlite.JDBC");
           //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Richard David/Desktop/UPH/SEMESTER 7/INTERAKSI MANUSIA DAN KOMPUTER/Lumen Netbeans/Lumen/src/bin/words.db");
            Connection login = DriverManager.getConnection("jdbc:sqlite:src\\Lumen\\login.db");
            return login;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    

}

    
