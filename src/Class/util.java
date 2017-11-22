/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ART
 */
public class util extends JPanel {


    
    
    
    
    
    
  public static int checkUser(String user, String pass){
      int res = 0;
      if(user.equalsIgnoreCase("emp")){
         res = 1;
      }
      else if(user.equalsIgnoreCase("admin")){
         res = 2;
      }
      return res;
  }
  public static void connect() throws SQLException{
      
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
          Logger.getLogger(util.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  public static void addFood(String n,float p){
      try {
          Connection con = ConnectionBuilder.getConnection();
          Statement stm = con.createStatement();
            stm.executeUpdate("INSERT INTO Menu(foodname,price) VALUES ('"+n+"','"+p+"')");
            stm.close();
            con.close();
            System.out.println("Finnish");
          
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(util.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(util.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      
      


  
      
      
      
  
   
      
      
      
  
  
  
  
  }
}
  
  
  
  
  
  
  
    

