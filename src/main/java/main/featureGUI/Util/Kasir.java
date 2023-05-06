/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI.Util;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Kasir extends javax.swing.JPanel {

    private final Image boxKasirImg = RequestImage.requestImage("pembayaran/boxKasir.png");
    private final Image boxKatalogImg = RequestImage.requestImage("pembayaran/boxKatalogBarang.png");


    public Kasir() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxKasir = new javax.swing.JPanel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(730, 447));

        boxKasir.setBackground(new java.awt.Color(40, 41, 61));
        boxKasir.setOpaque(false);

        javax.swing.GroupLayout boxKasirLayout = new javax.swing.GroupLayout(boxKasir);
        boxKasir.setLayout(boxKasirLayout);
        boxKasirLayout.setHorizontalGroup(
            boxKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        boxKasirLayout.setVerticalGroup(
            boxKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boxKasir;
    // End of variables declaration//GEN-END:variables
}
