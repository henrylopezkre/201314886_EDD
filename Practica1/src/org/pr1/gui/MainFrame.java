/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.pr1.bean.Objects;

/**
 *
 * @author Sorge
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private Font getCustomFont(float size){
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File(this.getClass().getResource("/org/pr1/resources/atari.ttf").getPath())).deriveFont(size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
        } catch (IOException|FontFormatException e) {
            //font = new Font("Segoe UI Semibold", 0, Integer.parseInt((String.valueOf(size))));
        }
        return font;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddGround1 = new javax.swing.JButton();
        txtGroundName1 = new javax.swing.JTextField();
        lblGroundTitle1 = new javax.swing.JLabel();
        lblGroundImage1 = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblGroundImage = new javax.swing.JLabel();
        lblGroundTitle = new javax.swing.JLabel();
        txtGroundName = new javax.swing.JTextField();
        btnAddCoin = new javax.swing.JButton();
        btnAddWall = new javax.swing.JButton();
        txtWallName = new javax.swing.JTextField();
        lblWallTitle = new javax.swing.JLabel();
        lblWallImage = new javax.swing.JLabel();
        lblGoombaImage = new javax.swing.JLabel();
        lblGoombaTitle = new javax.swing.JLabel();
        txtGoombaName = new javax.swing.JTextField();
        btnAddGoomba = new javax.swing.JButton();
        lblKoopaImage = new javax.swing.JLabel();
        txtKoopaName = new javax.swing.JTextField();
        lblKoopaTitle = new javax.swing.JLabel();
        btnAddKoopa = new javax.swing.JButton();
        btnAddCastle = new javax.swing.JButton();
        txtCastleName = new javax.swing.JTextField();
        lblCastleImage = new javax.swing.JLabel();
        lblCastleTitle = new javax.swing.JLabel();
        txtMainName = new javax.swing.JTextField();
        lblMainImage = new javax.swing.JLabel();
        btnAddMain = new javax.swing.JButton();
        btnAddMushRoom = new javax.swing.JButton();
        txtMushRoomName = new javax.swing.JTextField();
        lbMushRoomImage = new javax.swing.JLabel();
        lblMushRoomTitle = new javax.swing.JLabel();
        txtCoinName = new javax.swing.JTextField();
        lblCoinTitle = new javax.swing.JLabel();
        lblCoinImage = new javax.swing.JLabel();
        btnAddGround = new javax.swing.JButton();
        lblMainTitle = new javax.swing.JLabel();
        btnAddCastle1 = new javax.swing.JButton();

        btnAddGround1.setText("Agregar");

        lblGroundTitle1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblGroundTitle1.setText("Suelo");

        lblGroundImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGroundImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png"))); // NOI18N
        lblGroundImage1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblGroundImage1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContainer.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(0, 153, 204));
        lblTitle.setFont(getCustomFont(30));
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Agregar objetos");
        lblTitle.setOpaque(true);

        lblGroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png"))); // NOI18N
        lblGroundImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblGroundImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGroundImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGroundImageMouseClicked(evt);
            }
        });

        lblGroundTitle.setFont(getCustomFont(10));
        lblGroundTitle.setText("Suelo");

        txtGroundName.setFont(getCustomFont(8));
        txtGroundName.setForeground(new java.awt.Color(153, 153, 153));

        btnAddCoin.setFont(getCustomFont(8));
        btnAddCoin.setText("Agregar");

        btnAddWall.setFont(getCustomFont(8));
        btnAddWall.setText("Agregar");

        txtWallName.setFont(getCustomFont(8));
        txtWallName.setForeground(new java.awt.Color(153, 153, 153));

        lblWallTitle.setFont(getCustomFont(10));
        lblWallTitle.setText("Pared");

        lblWallImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWallImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png"))); // NOI18N
        lblWallImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblWallImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblGoombaImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGoombaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png"))); // NOI18N
        lblGoombaImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblGoombaImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblGoombaTitle.setFont(getCustomFont(10));
        lblGoombaTitle.setText("Goomba");

        txtGoombaName.setFont(getCustomFont(8));
        txtGoombaName.setForeground(new java.awt.Color(153, 153, 153));

        btnAddGoomba.setFont(getCustomFont(8));
        btnAddGoomba.setText("Agregar");

        lblKoopaImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKoopaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png"))); // NOI18N
        lblKoopaImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblKoopaImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtKoopaName.setFont(getCustomFont(8));
        txtKoopaName.setForeground(new java.awt.Color(153, 153, 153));

        lblKoopaTitle.setFont(getCustomFont(10));
        lblKoopaTitle.setText("Koopa");

        btnAddKoopa.setFont(getCustomFont(8));
        btnAddKoopa.setText("Agregar");

        btnAddCastle.setFont(getCustomFont(8));
        btnAddCastle.setText("Agregar");

        txtCastleName.setFont(getCustomFont(8));
        txtCastleName.setForeground(new java.awt.Color(153, 153, 153));

        lblCastleImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCastleImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png"))); // NOI18N
        lblCastleImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblCastleImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblCastleTitle.setFont(getCustomFont(10));
        lblCastleTitle.setText("Castillo");

        txtMainName.setFont(getCustomFont(8));
        txtMainName.setForeground(new java.awt.Color(153, 153, 153));

        lblMainImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png"))); // NOI18N
        lblMainImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblMainImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAddMain.setFont(getCustomFont(8));
        btnAddMain.setText("Agregar");

        btnAddMushRoom.setFont(getCustomFont(8));
        btnAddMushRoom.setText("Agregar");

        txtMushRoomName.setFont(getCustomFont(8));
        txtMushRoomName.setForeground(new java.awt.Color(153, 153, 153));

        lbMushRoomImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMushRoomImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png"))); // NOI18N
        lbMushRoomImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbMushRoomImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblMushRoomTitle.setFont(getCustomFont(10));
        lblMushRoomTitle.setText("Hongo");

        txtCoinName.setFont(getCustomFont(8));
        txtCoinName.setForeground(new java.awt.Color(153, 153, 153));

        lblCoinTitle.setFont(getCustomFont(10));
        lblCoinTitle.setText("Ficha");

        lblCoinImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCoinImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png"))); // NOI18N
        lblCoinImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblCoinImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAddGround.setFont(getCustomFont(8));
        btnAddGround.setText("Agregar");
        btnAddGround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGroundActionPerformed(evt);
            }
        });

        lblMainTitle.setFont(getCustomFont(10));
        lblMainTitle.setText("Personaje principal");

        btnAddCastle1.setFont(getCustomFont(8));
        btnAddCastle1.setForeground(new java.awt.Color(0, 153, 204));
        btnAddCastle1.setText("Ver");

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(lblGroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGroundTitle)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(txtGroundName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddGround, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(txtCoinName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCoinTitle)))
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblWallImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWallTitle)
                                    .addGroup(pnlContainerLayout.createSequentialGroup()
                                        .addComponent(txtWallName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddWall, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblGoombaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGoombaTitle)
                                    .addGroup(pnlContainerLayout.createSequentialGroup()
                                        .addComponent(txtGoombaName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddGoomba, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblKoopaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKoopaTitle)
                                    .addGroup(pnlContainerLayout.createSequentialGroup()
                                        .addComponent(txtKoopaName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddKoopa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCastleImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblMainImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbMushRoomImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCastleTitle)
                            .addComponent(lblMainTitle)
                            .addComponent(lblMushRoomTitle)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCastleName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMushRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMainName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddMain, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddCastle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddMushRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddCastle1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(lblGroundTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGroundName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddGround, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblGroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(lblCoinTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCoinName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblWallTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtWallName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddWall, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblWallImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblGoombaTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtGoombaName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddGoomba, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblGoombaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblKoopaTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtKoopaName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddKoopa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblKoopaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblMushRoomTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMushRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddMushRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbMushRoomImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblMainTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMainName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddMain, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblMainImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblCastleTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCastleName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddCastle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCastleImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddCastle1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddGroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGroundActionPerformed
        if(!txtGroundName.getText().isEmpty()){
            Objects object = new Objects();
            object.setName(txtGroundName.getText());
        }
    }//GEN-LAST:event_btnAddGroundActionPerformed

    private void lblGroundImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGroundImageMouseClicked
        JFileChooser fcSearch = new JFileChooser("../Documents/");
        FileFilter ffFilter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png");
        fcSearch.setFileFilter(ffFilter);
        try{
            if(JFileChooser.APPROVE_OPTION == fcSearch.showDialog(this, "Aceptar")){
                String strPath = fcSearch.getSelectedFile().getAbsolutePath();
                ImageIcon img = new ImageIcon(this.getClass().getResource(strPath));
                Icon icon = new ImageIcon(img.getImage().getScaledInstance(lblGroundImage.getWidth(), lblGroundImage.getHeight(), Image.SCALE_DEFAULT));
                lblGroundImage.setIcon(icon);
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_lblGroundImageMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCastle;
    private javax.swing.JButton btnAddCastle1;
    private javax.swing.JButton btnAddCoin;
    private javax.swing.JButton btnAddGoomba;
    private javax.swing.JButton btnAddGround;
    private javax.swing.JButton btnAddGround1;
    private javax.swing.JButton btnAddKoopa;
    private javax.swing.JButton btnAddMain;
    private javax.swing.JButton btnAddMushRoom;
    private javax.swing.JButton btnAddWall;
    private javax.swing.JLabel lbMushRoomImage;
    private javax.swing.JLabel lblCastleImage;
    private javax.swing.JLabel lblCastleTitle;
    private javax.swing.JLabel lblCoinImage;
    private javax.swing.JLabel lblCoinTitle;
    private javax.swing.JLabel lblGoombaImage;
    private javax.swing.JLabel lblGoombaTitle;
    private javax.swing.JLabel lblGroundImage;
    private javax.swing.JLabel lblGroundImage1;
    private javax.swing.JLabel lblGroundTitle;
    private javax.swing.JLabel lblGroundTitle1;
    private javax.swing.JLabel lblKoopaImage;
    private javax.swing.JLabel lblKoopaTitle;
    private javax.swing.JLabel lblMainImage;
    private javax.swing.JLabel lblMainTitle;
    private javax.swing.JLabel lblMushRoomTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWallImage;
    private javax.swing.JLabel lblWallTitle;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JTextField txtCastleName;
    private javax.swing.JTextField txtCoinName;
    private javax.swing.JTextField txtGoombaName;
    private javax.swing.JTextField txtGroundName;
    private javax.swing.JTextField txtGroundName1;
    private javax.swing.JTextField txtKoopaName;
    private javax.swing.JTextField txtMainName;
    private javax.swing.JTextField txtMushRoomName;
    private javax.swing.JTextField txtWallName;
    // End of variables declaration//GEN-END:variables
}
