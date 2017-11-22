/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ART
 */
public class ShadowPane extends JPanel {

        public ShadowPane() {
            setLayout(new BorderLayout());
            setOpaque(false);
            setBackground(Color.BLACK);
            setBorder(new EmptyBorder(0, 0, 10, 10));
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f));
            g2d.fillRect(10, 10, getWidth(), getHeight());
            g2d.dispose();
        }
    }