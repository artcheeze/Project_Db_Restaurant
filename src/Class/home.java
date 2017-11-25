/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ART
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() throws ClassNotFoundException, SQLException, IOException {

        initComponents();
        this.setLocationRelativeTo(null);
       
        Connection con;
        try {
            int nn = 0;
            int nnn = 0;
            int[] num = new int[9];
            while (nn != 9) {
                num[nn] = 0;
                nn++;
            }
            con = ConnectionBuilder.getConnection();
            Statement stm = con.createStatement();
            Statement stm2 = con.createStatement();
            Statement stm3 = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * From Menu");

            ResultSet rs2 = stm3.executeQuery("select distinct count(order_id) AS total1 from Orders where status = 0");
            int n = 0;
            while (rs2.next()) {
                n = rs2.getInt("total1");
            }
            totalQ.setText("" + n);

            ResultSet rs3 = stm3.executeQuery("select distinct count(order_id) AS total2 from Orders where status = 1");
            int nn3 = 0;
            while (rs3.next()) {
                nn3 = rs3.getInt("total2");
            }
            FinQ.setText("" + nn3);

            System.out.println(n);
            System.out.println(nn3);

            while (rs.next()) {
                switch (rs.getInt("menu_id")) {
                    case 1:
                        pic1.setIcon(util.getImage(1));
                        n1.setText(rs.getString("foodname"));
                        p1.setText(rs.getString("price"));
                        num[0] = 1;
                        
                        break;

                    case 2:
                        n2.setText(rs.getString("foodname"));
                        p2.setText(rs.getString("price"));
                        num[1] = 2;
                        pic2.setIcon(util.getImage(2));
                        break;
                    case 3:
                        n3.setText(rs.getString("foodname"));
                        p3.setText(rs.getString("price"));
                        num[2] = 3;
                        pic3.setIcon(util.getImage(3));
                        break;
                    case 4:
                        n4.setText(rs.getString("foodname"));
                        p4.setText(rs.getString("price"));
                        num[3] = 4;
                        pic4.setIcon(util.getImage(4));
                        break;
                    case 5:
                        n5.setText(rs.getString("foodname"));
                        p5.setText(rs.getString("price"));
                        num[4] = 5;
                        pic5.setIcon(util.getImage(5));
                        break;
                    case 6:
                        n6.setText(rs.getString("foodname"));
                        p6.setText(rs.getString("price"));
                        num[5] = 6;
                        pic6.setIcon(util.getImage(6));
                        break;
                    case 7:
                        n7.setText(rs.getString("foodname"));
                        p7.setText(rs.getString("price"));
                        num[6] = 7;
                        pic7.setIcon(util.getImage(7));
                        break;
                    case 8:
                        n8.setText(rs.getString("foodname"));
                        p8.setText(rs.getString("price"));
                        num[7] = 8;
                        pic8.setIcon(util.getImage(8));
                        break;
                       
                    case 9:
                        n9.setText(rs.getString("foodname"));
                        p9.setText(rs.getString("price"));
                        num[8] = 9;
                        pic9.setIcon(util.getImage(9));
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
        s1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        s3 = new javax.swing.JRadioButton();
        s4 = new javax.swing.JRadioButton();
        s5 = new javax.swing.JRadioButton();
        s6 = new javax.swing.JRadioButton();
        s7 = new javax.swing.JRadioButton();
        s8 = new javax.swing.JRadioButton();
        s9 = new javax.swing.JRadioButton();
        p10 = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        p12 = new javax.swing.JLabel();
        p13 = new javax.swing.JLabel();
        p14 = new javax.swing.JLabel();
        p15 = new javax.swing.JLabel();
        p16 = new javax.swing.JLabel();
        p17 = new javax.swing.JLabel();
        p18 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        pic4 = new javax.swing.JLabel();
        pic5 = new javax.swing.JLabel();
        pic6 = new javax.swing.JLabel();
        pic7 = new javax.swing.JLabel();
        pic8 = new javax.swing.JLabel();
        pic9 = new javax.swing.JLabel();
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
        n1.setText("null");
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        n2.setBackground(new java.awt.Color(255, 255, 255));
        n2.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n2.setForeground(new java.awt.Color(255, 255, 255));
        n2.setText("null");
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        n3.setBackground(new java.awt.Color(255, 255, 255));
        n3.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n3.setForeground(new java.awt.Color(255, 255, 255));
        n3.setText("null");
        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        n4.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n4.setForeground(new java.awt.Color(255, 255, 255));
        n4.setText("null");
        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        n5.setBackground(new java.awt.Color(255, 255, 255));
        n5.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n5.setForeground(new java.awt.Color(255, 255, 255));
        n5.setText("null");
        getContentPane().add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        n6.setBackground(new java.awt.Color(255, 255, 255));
        n6.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n6.setForeground(new java.awt.Color(255, 255, 255));
        n6.setText("null");
        getContentPane().add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        n7.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n7.setForeground(new java.awt.Color(255, 255, 255));
        n7.setText("null");
        getContentPane().add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        n8.setBackground(new java.awt.Color(255, 255, 255));
        n8.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n8.setForeground(new java.awt.Color(255, 255, 255));
        n8.setText("null");
        getContentPane().add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        n9.setBackground(new java.awt.Color(255, 255, 255));
        n9.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        n9.setForeground(new java.awt.Color(255, 255, 255));
        n9.setText("null");
        getContentPane().add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        p1.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p1.setForeground(new java.awt.Color(255, 255, 255));
        p1.setText("null");
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p2.setForeground(new java.awt.Color(255, 255, 255));
        p2.setText("null");
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p3.setForeground(new java.awt.Color(255, 255, 255));
        p3.setText("null");
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        p4.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p4.setForeground(new java.awt.Color(255, 255, 255));
        p4.setText("null");
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p5.setForeground(new java.awt.Color(255, 255, 255));
        p5.setText("null");
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p6.setForeground(new java.awt.Color(255, 255, 255));
        p6.setText("null");
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        p7.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p7.setForeground(new java.awt.Color(255, 255, 255));
        p7.setText("null");
        getContentPane().add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        p8.setBackground(new java.awt.Color(255, 255, 255));
        p8.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p8.setForeground(new java.awt.Color(255, 255, 255));
        p8.setText("null");
        getContentPane().add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, -1));

        p9.setBackground(new java.awt.Color(255, 255, 255));
        p9.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p9.setForeground(new java.awt.Color(255, 255, 255));
        p9.setText("null");
        getContentPane().add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        totalQ.setBackground(new java.awt.Color(255, 255, 255));
        totalQ.setFont(new java.awt.Font("Quark", 1, 36)); // NOI18N
        totalQ.setForeground(new java.awt.Color(255, 255, 255));
        totalQ.setText("jLabel13");
        getContentPane().add(totalQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        FinQ.setFont(new java.awt.Font("Quark", 1, 36)); // NOI18N
        FinQ.setForeground(new java.awt.Color(255, 255, 255));
        FinQ.setText("jLabel14");
        getContentPane().add(FinQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ex.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 40, 40));

        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });
        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });
        getContentPane().add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });
        getContentPane().add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });
        getContentPane().add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        s8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s8ActionPerformed(evt);
            }
        });
        getContentPane().add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        s9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s9ActionPerformed(evt);
            }
        });
        getContentPane().add(s9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

        p10.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p10.setForeground(new java.awt.Color(153, 255, 153));
        p10.setText("Bath");
        getContentPane().add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        p11.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p11.setForeground(new java.awt.Color(153, 255, 153));
        p11.setText("Bath");
        getContentPane().add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        p12.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p12.setForeground(new java.awt.Color(153, 255, 153));
        p12.setText("Bath");
        getContentPane().add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        p13.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p13.setForeground(new java.awt.Color(153, 255, 153));
        p13.setText("Bath");
        getContentPane().add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        p14.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p14.setForeground(new java.awt.Color(153, 255, 153));
        p14.setText("Bath");
        getContentPane().add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        p15.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p15.setForeground(new java.awt.Color(153, 255, 153));
        p15.setText("Bath");
        getContentPane().add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        p16.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p16.setForeground(new java.awt.Color(153, 255, 153));
        p16.setText("Bath");
        getContentPane().add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        p17.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p17.setForeground(new java.awt.Color(153, 255, 153));
        p17.setText("Bath");
        getContentPane().add(p17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        p18.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        p18.setForeground(new java.awt.Color(153, 255, 153));
        p18.setText("Bath");
        getContentPane().add(p18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        pic1.setText("pic");
        getContentPane().add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 50, 50));

        pic2.setText("pic");
        getContentPane().add(pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 50, 50));

        pic3.setText("pic");
        getContentPane().add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 50, 50));

        pic4.setText("pic");
        getContentPane().add(pic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 50, 50));

        pic5.setText("pic");
        getContentPane().add(pic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        pic6.setText("pic");
        getContentPane().add(pic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 50, 50));

        pic7.setText("pic");
        getContentPane().add(pic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 50, 50));

        pic8.setText("pic");
        getContentPane().add(pic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 50, 50));

        pic9.setText("pic");
        getContentPane().add(pic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 50, 50));

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
        Connection con;
        int id = 0;
        try {
            con = ConnectionBuilder.getConnection();
            Statement stm = con.createStatement();
            Statement stm2 = con.createStatement();

            ResultSet rs = stm2.executeQuery("Select count(order_id) As total from Orders");
            while (rs.next()) {
                id = rs.getInt("total") + 1;
            }
            util.setTI2(id);

            if (s1.isSelected() == true) {
                stm.executeUpdate("INSERT INTO temp(orderID,menuID,price) VALUES(" + id + ",1," + p1.getText() + ")");
            }
            if (s2.isSelected() == true) {
                stm.executeUpdate("INSERT INTO temp(orderID,menuID,price) VALUES(" + id + ",2," + p2.getText() + ")");
            }
            if (s3.isSelected() == true) {
                stm.executeUpdate("INSERT INTO temp(orderID,menuID,price) VALUES(" + id + ",3," + p3.getText() + ")");
            }
            if (s4.isSelected() == true) {
                stm.executeUpdate("INSERT INTO temp(orderID,menuID,price) VALUES(" + id + ",4," + p4.getText() + ")");
            }
            if (s5.isSelected() == true) {
                stm.executeUpdate("INSERT INTO temp(orderID,menuID,price) VALUES(" + id + ",5," + p5.getText() + ")");
            }
            if (s6.isSelected() == true) {
                stm.executeUpdate("INSERT INTO temp(orderID,menuID,price) VALUES(" + id + ",6," + p6.getText() + ")");
            }
            if (s7.isSelected() == true) {
                stm.executeUpdate("INSERT INTO temp(orderID,menuID,price) VALUES(" + id + ",7," + p7.getText() + ")");
            }
            if (s8.isSelected() == true) {
                stm.executeUpdate("INSERT INTO temp(orderID,menuID,price) VALUES(" + id + ",8," + p8.getText() + ")");
            }
            if (s9.isSelected() == true) {
                stm.executeUpdate("INSERT INTO temp(orderID,menuID,price) VALUES(" + id + ",9," + p9.getText() + ")");
            }

            stm.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            home_popup ap = new home_popup();
            ap.setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed

    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s3ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s5ActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s6ActionPerformed

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s7ActionPerformed

    private void s8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s8ActionPerformed

    private void s9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s9ActionPerformed

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
                } catch (IOException ex) {
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
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p11;
    private javax.swing.JLabel p12;
    private javax.swing.JLabel p13;
    private javax.swing.JLabel p14;
    private javax.swing.JLabel p15;
    private javax.swing.JLabel p16;
    private javax.swing.JLabel p17;
    private javax.swing.JLabel p18;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    private javax.swing.JLabel pic7;
    private javax.swing.JLabel pic8;
    private javax.swing.JLabel pic9;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s2;
    private javax.swing.JRadioButton s3;
    private javax.swing.JRadioButton s4;
    private javax.swing.JRadioButton s5;
    private javax.swing.JRadioButton s6;
    private javax.swing.JRadioButton s7;
    private javax.swing.JRadioButton s8;
    private javax.swing.JRadioButton s9;
    private javax.swing.JLabel totalQ;
    // End of variables declaration//GEN-END:variables
}
