/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.gui;

import javax.swing.ImageIcon;

/**
 *
 * @author Sorge
 */
public class Const {
    private static ImageIcon image = null;

    public static ImageIcon getImage() {
        return image;
    }

    public static void setImage(ImageIcon image) {
        Const.image = image;
    }
    
}
