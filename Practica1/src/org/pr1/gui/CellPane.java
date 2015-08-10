/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sorge
 */
public class CellPane extends JPanel {
    private Color defaultBackground;
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
            });
        }
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(50, 50);
        }
}
