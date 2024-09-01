package movie.ticket.booking.system;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dharsan S
 */
class ConnectionProvider {

    static Connection getCon() {
       try
       {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MTBS","root","");
            return con;
    }
       catch(Exception e)
       {
           return null;
       }
    }
}
    

