package Class;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

public class ConnectionBuilder {
    private static String url = "jdbc:mysql://db.int203.phornlert.me:3306/gujarod";
    private static String user = "gujarod";
    private static String pwd = "susu";
    private static String driver = "com.mysql.jdbc.Driver";
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
       Connection connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect =  DriverManager.getConnection("jdbc:mysql://db.int203.phornlert.me:3306/gujarod" +
					"?user=gujarod&password=susu");
          if(connect != null){
				System.out.println("Database Connected.");
			} else {
				System.out.println("Database Connect Failed.");
			}
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }

}
