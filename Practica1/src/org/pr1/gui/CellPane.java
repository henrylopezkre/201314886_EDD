/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sorge
 */
public class CellPane extends JPanel {
    private Color defaultBackground;
    public static ImageIcon image;
        public CellPane() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    defaultBackground = getBackground();
                    setBackground(new Color(0, 153, 204));
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    setBackground(defaultBackground);
                }
                /*@Override
                public void mousePressed(MouseEvent e){
                    CellPane.image = Const.getImage();
                }*/
            });
        }
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(50, 50);
        }
        /*@Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(image != null){
                Graphics2D g2d = (Graphics2D)g;
                g2d.setPaint(new TexturePaint(createBufferedImage(this,image), new Rectangle(0,0,this.getWidth(),this.getHeight())));
                g2d.fillRect(0,0,this.getWidth(),this.getHeight());   
            }
        }
        private BufferedImage createBufferedImage(Component componente, ImageIcon imagen){
            GraphicsConfiguration gc = componente.getGraphicsConfiguration();
            BufferedImage bimagen = gc.createCompatibleImage(imagen.getIconWidth(),imagen.getIconHeight());
            Graphics2D g2d = bimagen.createGraphics();
            imagen.paintIcon(componente,g2d,0,0);
            g2d.dispose();
            return bimagen;
        } */
}
