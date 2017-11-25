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
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ART
 */
public class util extends JPanel {
public static int tempID=0;
public static int tempID2=0;
public static String tempUn="";
public static String n1,n2,n3,n4,n5,n6,n7,n8,n9="";
public static File ff;





public static void setTI(int e){
    util.tempID = e;
}   
public static int getTI(){
    return util.tempID; 
}
public static void setTI2(int e){
    util.tempID2 = e;
}   
public static int getTI2(){
    return util.tempID2; 
}  
public static void setUn(String e){
    util.tempUn = e;
}   
public static String getUn(){
    return util.tempUn; 
}  
    
    
    
  public static void getF() throws ClassNotFoundException, SQLException{
             Connection con;
            con = ConnectionBuilder.getConnection();
            Statement stm = con.createStatement();
            
            int i = 0;
                while(i!=9){
                    ResultSet rs = stm.executeQuery("Select * From Menu where menu_id ="+(i+1)+"");
                    while(rs.next()){
                        if(rs.getInt("menu_id")==1){
                             n1 =  rs.getString("foodname");
                        }
                        else if(rs.getInt("menu_id")==2){
                             n2 =  rs.getString("foodname");
                        }
                        if(rs.getInt("menu_id")==3){
                             n3 =  rs.getString("foodname");
                        }
                        if(rs.getInt("menu_id")==4){
                             n4 =  rs.getString("foodname");
                        }
                        if(rs.getInt("menu_id")==5){
                             n5 =  rs.getString("foodname");
                        }
                        if(rs.getInt("menu_id")==6){
                             n6 =  rs.getString("foodname");
                        }
                        if(rs.getInt("menu_id")==7){
                             n7 =  rs.getString("foodname");
                        }
                        if(rs.getInt("menu_id")==8){
                             n8 =  rs.getString("foodname");
                        }
                        if(rs.getInt("menu_id")==9){
                             n9 =  rs.getString("foodname");
                        }
                       
                    }
                      
                     i++;
                }
               
        stm.close();
            con.close();
  }  
  public static String getNameF(int a) throws ClassNotFoundException, SQLException{
           
           String nm =""; 
      if(a==1){
           nm = n1;
      }
      else if(a==2){
           nm = n2;
      }
      else if(a==3){
           nm = n3;
      }
      else if(a==4){
            nm = n4;
      }
      else if(a==5){
            nm = n5;
      }
      else if(a==6){
           nm = n6;
      }
      else if(a==7){
            nm = n7;
      }
      else if(a==8){
           nm = n8;
      }
      else if(a==9){
            nm = n9;
      }
      return nm;
  }
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
  
  public static void putfile(File f){
      ff = f;
  }
  public static void uploadImage(int a,String b,String c){
      float cc = Float.parseFloat(c);
      try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://db.int203.phornlert.me:3306/gujarod","gujarod","susu");
            
          
            FileInputStream fis=new FileInputStream(util.ff);
            PreparedStatement ps=con.prepareStatement("INSERT INTO Menu(Menu_id,foodname,price,pic) values(?,?,?,?)"); 
            ps.setInt(1,a);
            ps.setString(2,b);
            ps.setFloat(3,cc);
            ps.setBinaryStream(4,fis,(int)ff.length());
            ps.executeUpdate();
 
            ps.close();
            fis.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
  }
  
  public static ImageIcon getImage(int a){
            try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://db.int203.phornlert.me:3306/gujarod","gujarod","susu");
            
            File file=new File("E:\\pic"+a+".jpg");
            FileOutputStream fos=new FileOutputStream(file);
            byte b[];
            Blob blob;
            
            PreparedStatement ps=con.prepareStatement("select * from Menu where menu_id = "+a+""); 
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                blob=rs.getBlob("pic");
                b=blob.getBytes(1,(int)blob.length());
                fos.write(b);
            }
            
            ps.close();
            fos.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
      
           ImageIcon im = new ImageIcon("E:\\pic"+a+".jpg");
      
      return im;
      
  }
}
  
  
  
  
  
  
  
    

