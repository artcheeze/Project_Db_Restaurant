/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ART
 */
public class home_popup extends javax.swing.JFrame {
    
    
    

    int numOfT = 0;
    int sum = 0;
    int dis1 = 0;
    int dis2 = 0;
    int dis3 = 0;
    int sum1 = 0;
    int pro = 0;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
    /**
     * Creates new form home_popup
     */
    public home_popup() throws ClassNotFoundException, SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        
        System.out.println(dateFormat.format(date)); 
       

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        float mon = 0;

        try {
            Connection con;
            con = ConnectionBuilder.getConnection();
            Statement stm = con.createStatement();
            Statement stm2 = con.createStatement();
            Statement stm3 = con.createStatement();
            Statement stm4 = con.createStatement();

            ResultSet rs = stm.executeQuery("Select * From temp");
            ResultSet rs2 = stm2.executeQuery("Select * From Promotion where pro_id = 1");
            ResultSet rs3 = stm3.executeQuery("Select * From Promotion where pro_id = 2");
            ResultSet rs4 = stm4.executeQuery("Select * From Promotion where pro_id = 3");

            Object rowData[] = new Object[3];
            util.getF();
            while (rs.next()) {
                rowData[0] = rs.getInt("menuID");
                if (rs.getInt("menuId") == 1) {
                    rowData[1] = util.getNameF(1);
                } else if (rs.getInt("menuId") == 2) {
                    rowData[1] = util.getNameF(2);
                } else if (rs.getInt("menuId") == 3) {
                    rowData[1] = util.getNameF(3);
                } else if (rs.getInt("menuId") == 4) {
                    rowData[1] = util.getNameF(4);
                } else if (rs.getInt("menuId") == 5) {
                    rowData[1] = util.getNameF(5);
                } else if (rs.getInt("menuId") == 6) {
                    rowData[1] = util.getNameF(6);
                } else if (rs.getInt("menuId") == 7) {
                    rowData[1] = util.getNameF(7);
                } else if (rs.getInt("menuId") == 8) {
                    rowData[1] = util.getNameF(8);
                } else if (rs.getInt("menuId") == 9) {
                    rowData[1] = util.getNameF(9);
                }
                rowData[2] = rs.getFloat("price");
                model.addRow(rowData);
            }
            while (rs2.next()) {
                dis1 = rs2.getInt("dis");
            }
            while (rs3.next()) {
                dis2 = rs3.getInt("dis");
            }
            while (rs4.next()) {
                dis3 = rs4.getInt("dis");
            }

            jLabel3.setText("" + util.getTI2());
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(home_popup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(home_popup.class.getName()).log(Level.SEVERE, null, ex);
        }

        numOfT = model.getRowCount();
        for (int a = 0; a != numOfT; a++) {
            mon = (float) jTable1.getValueAt(a, 2);
            sum += mon;
        }
        System.out.println(sum);
        System.out.println(numOfT);
        if (numOfT <= 2) {
            sum1 = sum;
            jLabel9.setText("No Discount!");
            jLabel4.setText("" + sum);
            pro = 0;
        }
        if (numOfT > 2) {
            sum1 = sum - ((sum * dis1) / 100);
            jLabel9.setText("Discount 10% !");
            jLabel4.setText("" + sum1);
            pro = 1;
        }
        if (numOfT > 5) {
            sum1 = sum - ((sum * dis2) / 100);
            jLabel9.setText("Discount 20% !");
            jLabel4.setText("" + sum1);
            pro = 2;
        }
        if (numOfT == 9) {
            sum1 = sum - ((sum * dis3) / 100);
            jLabel9.setText("Discount 40% !");
            jLabel4.setText("" + sum1);
            pro = 3;
        }

        System.out.println(numOfT);
        System.out.println(pro);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(798, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jLabel5.setText("jLabel3");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ex.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MenuID", "Foodname", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 760, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/b3.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        jLabel3.setFont(new java.awt.Font("Quark", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("null");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        jLabel4.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("null");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        jLabel7.setFont(new java.awt.Font("Quark", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setText("Bath");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, -1, -1));

        jLabel8.setFont(new java.awt.Font("Quark", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("ส่วนลด");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home/your order.png"))); // NOI18N
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            Connection con = ConnectionBuilder.getConnection();
            Statement stm = con.createStatement();
            stm.executeUpdate("DELETE FROM temp");
            home h = new home();
            h.setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(home_popup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Connection con;
        int id = 0;
        
        try {
            con = ConnectionBuilder.getConnection();
            Statement stm = con.createStatement();
            stm.executeUpdate("INSERT INTO Orders(order_id,totalprice,date,status,pro_id) VALUES(" + util.getTI2() + "," + sum1 + ",'"+ dateFormat.format(date) + "'," + 0 + "," + pro + ")");
            for (int i = 0; i != numOfT; i++) {
                int mID = (int) jTable1.getValueAt(i, 0);
                stm.executeUpdate("INSERT INTO Orders_detail(order_id,menu_id) VALUES(" + util.getTI2() + "," + mID + ")");
            }
            stm.executeUpdate("DELETE FROM temp");
            stm.close();
            con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            home ap = new home();
            ap.setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(home_popup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home_popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new home_popup().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(home_popup.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(home_popup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
