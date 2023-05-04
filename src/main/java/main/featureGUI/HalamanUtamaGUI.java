/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import main.featureGUI.Util.RequestImage;

/**
 *
 * @author user
 */
public class HalamanUtamaGUI extends javax.swing.JPanel {

    /**
     * Creates new form HalamanUtama
     */
    private final Image logoHalamanUtamaBg = RequestImage.requestImage("HalamanUtama.png");
    private final Image logoHalamanUtamaFg = RequestImage.requestImage("logoChizuruBesar.png");

    public HalamanUtamaGUI() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        halamanUtama = new javax.swing.JPanel();
        logoHalamanUtama = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(logoHalamanUtamaBg, 0, 0, null);
            }
        };
        logoCTF = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(logoHalamanUtamaFg, 0, 0, null);
            }
        };

        setPreferredSize(new java.awt.Dimension(904, 720));

        halamanUtama.setBackground(new java.awt.Color(40, 41, 61));

        logoHalamanUtama.setBackground(new java.awt.Color(40, 41, 61));
        logoHalamanUtama.setPreferredSize(new java.awt.Dimension(866, 698));

        logoCTF.setBackground(new java.awt.Color(40, 41, 61));
        logoCTF.setPreferredSize(new java.awt.Dimension(454, 351));

        javax.swing.GroupLayout logoCTFLayout = new javax.swing.GroupLayout(logoCTF);
        logoCTF.setLayout(logoCTFLayout);
        logoCTFLayout.setHorizontalGroup(
            logoCTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        logoCTFLayout.setVerticalGroup(
            logoCTFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout logoHalamanUtamaLayout = new javax.swing.GroupLayout(logoHalamanUtama);
        logoHalamanUtama.setLayout(logoHalamanUtamaLayout);
        logoHalamanUtamaLayout.setHorizontalGroup(
            logoHalamanUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoHalamanUtamaLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(logoCTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        logoHalamanUtamaLayout.setVerticalGroup(
            logoHalamanUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoHalamanUtamaLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(logoCTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout halamanUtamaLayout = new javax.swing.GroupLayout(halamanUtama);
        halamanUtama.setLayout(halamanUtamaLayout);
        halamanUtamaLayout.setHorizontalGroup(
            halamanUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(halamanUtamaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(logoHalamanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        halamanUtamaLayout.setVerticalGroup(
            halamanUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(halamanUtamaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logoHalamanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(halamanUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(halamanUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel halamanUtama;
    private javax.swing.JPanel logoCTF;
    private javax.swing.JPanel logoHalamanUtama;
    // End of variables declaration//GEN-END:variables
}
