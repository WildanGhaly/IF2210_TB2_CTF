/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import main.featureGUI.Util.Kasir;

/**
 *
 * @author user
 */
public class PembayaranGUI extends javax.swing.JPanel {

    
    public PembayaranGUI() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pembayaranPanel = new javax.swing.JPanel();
        logoPembayaran = new javax.swing.JLabel();
        customTabbedPanelPembayaran = new main.featureGUI.customtabbedpane.CustomTabbedPane();
        defaultKasir = new main.featureGUI.Util.Kasir();

        pembayaranPanel.setBackground(new java.awt.Color(40, 41, 61));

        logoPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/logoPembayaran.png"))); // NOI18N
        logoPembayaran.setLabelFor(pembayaranPanel);

        customTabbedPanelPembayaran.setForeground(new java.awt.Color(217, 217, 217));
        customTabbedPanelPembayaran.setTabLayoutPolicy(javax.swing.JTabbedPane.WRAP_TAB_LAYOUT);
        customTabbedPanelPembayaran.setFont(new java.awt.Font("Inter", 0, 18));
        customTabbedPanelPembayaran.setPreferredSize(new java.awt.Dimension(730, 447));
        customTabbedPanelPembayaran.setSelectedColor(new java.awt.Color(62,231,188,230));
        customTabbedPanelPembayaran.setUnselectedColor(new java.awt.Color(62, 231, 188, 170));
        customTabbedPanelPembayaran.addTab("Kasir 1", defaultKasir);

        javax.swing.GroupLayout pembayaranPanelLayout = new javax.swing.GroupLayout(pembayaranPanel);
        pembayaranPanel.setLayout(pembayaranPanelLayout);
        pembayaranPanelLayout.setHorizontalGroup(
            pembayaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembayaranPanelLayout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(logoPembayaran)
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pembayaranPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customTabbedPanelPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pembayaranPanelLayout.setVerticalGroup(
            pembayaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembayaranPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(logoPembayaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customTabbedPanelPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pembayaranPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pembayaranPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void temp(){
        JButton addButton = new JButton("+");
        addButton.setForeground(new Color(217, 217, 217));
        addButton.setBorder(null);
        addButton.setFocusPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.setPreferredSize(new Dimension(60, 20));
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt){
                customTabbedPanelPembayaran.removeTabAt(customTabbedPanelPembayaran.getTabCount()-1);
                customTabbedPanelPembayaran.addTab("Kasir " + (customTabbedPanelPembayaran.getTabCount()), new Kasir());
                customTabbedPanelPembayaran.addTab("", null);
                customTabbedPanelPembayaran.setTabComponentAt(customTabbedPanelPembayaran.getTabCount()-1, addButton);
            }
        });
        customTabbedPanelPembayaran.addTab("", null);
                customTabbedPanelPembayaran.setTabComponentAt(customTabbedPanelPembayaran.getTabCount()-1, addButton);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.featureGUI.customtabbedpane.CustomTabbedPane customTabbedPanelPembayaran;
    private main.featureGUI.Util.Kasir defaultKasir;
    private javax.swing.JLabel logoPembayaran;
    private javax.swing.JPanel pembayaranPanel;
    // End of variables declaration//GEN-END:variables
}
