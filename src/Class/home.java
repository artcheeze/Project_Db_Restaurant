/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ART
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() throws ClassNotFoundException, SQLException {
          
        initComponents();
        this.setLocationRelativeTo(null);
           Connection con;
        try {
            con = ConnectionBuilder.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * From Menu");
            while(rs.next()){
                switch(rs.getInt("menu_id")){
                    case 1: n1.setText(rs.getString("foodname"));
                            p1.setText(rs.getString("price"));
                            break;
                    case 2: n2.setText(rs.getString("foodname"));
                            p2.setText(rs.getString("price"));
                            break;
                    case 3: n3.setText(rs.getString("foodname"));
                            p3.setText(rs.getString("price"));
                            break;
                    case 4: n4.setText(rs.getString("foodname"));
                            p4.setText(rs.getString("price"));
                            break;
                    case 5: n5.setText(rs.getString("foodname"));
                            p5.setText(rs.getString("price"));
                            break;
                    case 6: n6.setText(rs.getString("foodname"));
                            p6.setText(rs.getString("price"));
                            break;
                    case 7: n7.setText(rs.getString("foodname"));
                            p7.setText(rs.getString("price"));
                            break;
                    case 8: n8.setText(rs.getString("foodname"));
                            p8.setText(rs.getString("price"));
                            break;
                    case 9: n9.setText(rs.getString("foodname"));
                            p9.setText(rs.getString("price"));
                            break;
                    
                }
            }
           
            
            stm.close();
            con.close();
            System.out.println("Finnish");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n6 = new javax.swing.JLabel();
        n7 = new javax.swing.JLabel();
        n8 = new javax.swing.JLabel();
        n9 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        totalQ = new javax.swing.JLabel();
        FinQ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home/b1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home/b2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, 50, 50));

        n1.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n1.setForeground(new java.awt.Color(255, 255, 255));
        n1.setText("n1");
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        n2.setBackground(new java.awt.Color(255, 255, 255));
        n2.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n2.setForeground(new java.awt.Color(255, 255, 255));
        n2.setText("n2");
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        n3.setBackground(new java.awt.Color(255, 255, 255));
        n3.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n3.setForeground(null);
        n3.setText("n3");
        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        n4.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n4.setForeground(new java.awt.Color(255, 255, 255));
        n4.setText("n4");
        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        n5.setBackground(new java.awt.Color(255, 255, 255));
        n5.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n5.setForeground(new java.awt.Color(255, 255, 255));
        n5.setText("n5");
        getContentPane().add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        n6.setBackground(new java.awt.Color(255, 255, 255));
        n6.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n6.setForeground(null);
        n6.setText("n6");
        getContentPane().add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        n7.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n7.setForeground(new java.awt.Color(255, 255, 255));
        n7.setText("n7");
        getContentPane().add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        n8.setBackground(new java.awt.Color(255, 255, 255));
        n8.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n8.setForeground(null);
        n8.setText("n8");
        getContentPane().add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        n9.setBackground(new java.awt.Color(255, 255, 255));
        n9.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n9.setForeground(null);
        n9.setText("n9");
        getContentPane().add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        p1.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p1.setForeground(new java.awt.Color(255, 255, 255));
        p1.setText("p1");
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p2.setForeground(null);
        p2.setText("p2");
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p3.setForeground(null);
        p3.setText("p3");
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        p4.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p4.setForeground(new java.awt.Color(255, 255, 255));
        p4.setText("p4");
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p5.setForeground(null);
        p5.setText("p5");
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p6.setForeground(null);
        p6.setText("p6");
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        p7.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p7.setForeground(new java.awt.Color(255, 255, 255));
        p7.setText("p7");
        getContentPane().add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        p8.setBackground(new java.awt.Color(255, 255, 255));
        p8.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p8.setForeground(null);
        p8.setText("p9");
        getContentPane().add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        p9.setBackground(new java.awt.Color(255, 255, 255));
        p9.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p9.setForeground(null);
        p9.setText("p8");
        getContentPane().add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        totalQ.setText("jLabel13");
        getContentPane().add(totalQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        FinQ.setText("jLabel14");
        getContentPane().add(FinQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ex.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home/BG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      login l = new login();
      l.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       home_popup hp = new home_popup();
       hp.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new home().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FinQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n8;
    private javax.swing.JLabel n9;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    private javax.swing.JLabel totalQ;
    // End of variables declaration//GEN-END:variables
}
