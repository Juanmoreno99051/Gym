/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/gym";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    public static Connection getConnection()
    {
        Connection connection = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return connection;
    }
}