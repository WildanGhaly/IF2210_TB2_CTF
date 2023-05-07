/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import main.featureGUI.Util.Kasir;

/**
 *
 * @author user
 */
public class PembayaranGUI extends javax.swing.JPanel {

    private static final PembayaranGUI PEMBAYARAN_GUI = new PembayaranGUI();


    private PembayaranGUI() {
        initComponents();
    }

    public static PembayaranGUI getInstance(){
        return PembayaranGUI.PEMBAYARAN_GUI;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pembayaranPanel = new javax.swing.JPanel();
        logoPembayaran = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        customTabbedPanelPembayaran = new main.featureGUI.Util.customtabbedpane.CustomTabbedPane();
        defaultKasir = new main.featureGUI.Util.Kasir();

        pembayaranPanel.setBackground(new java.awt.Color(40, 41, 61));

        logoPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/logoPembayaran.png"))); // NOI18N
        logoPembayaran.setLabelFor(pembayaranPanel);

        jPanel1.setBackground(new java.awt.Color(62, 64, 91));

        customTabbedPanelPembayaran.setForeground(new java.awt.Color(40, 41, 61));
        customTabbedPanelPembayaran.setTabLayoutPolicy(javax.swing.JTabbedPane.WRAP_TAB_LAYOUT);
        customTabbedPanelPembayaran.setFont(new java.awt.Font("Inter", 0, 18));
        customTabbedPanelPembayaran.setPreferredSize(new java.awt.Dimension(730, 447));
        customTabbedPanelPembayaran.setSelectedColor(new java.awt.Color(62,231,188,230));
        customTabbedPanelPembayaran.setUnselectedColor(new java.awt.Color(62, 231, 188, 170));
        customTabbedPanelPembayaran.addTab("Kasir 1", defaultKasir);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customTabbedPanelPembayaran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customTabbedPanelPembayaran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        JButton addButton = new JButton("+");
        addButton.setForeground(new Color(217, 217, 217));
        addButton.setBorder(null);
        addButton.setFocusPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.setPreferredSize(new Dimension(60, 20));
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt){
                Kasir kasir = new Kasir();
                customTabbedPanelPembayaran.removeTabAt(customTabbedPanelPembayaran.getTabCount()-1);
                customTabbedPanelPembayaran.addTab("", kasir);
                customTabbedPanelPembayaran.setTabComponentAt(customTabbedPanelPembayaran.getTabCount()-1, new TabComponent("Kasir " + (customTabbedPanelPembayaran.getTabCount()), kasir));
                customTabbedPanelPembayaran.addTab("", null);
                customTabbedPanelPembayaran.setTabComponentAt(customTabbedPanelPembayaran.getTabCount()-1, addButton);
            }
        });
        customTabbedPanelPembayaran.addTab("", null);
        customTabbedPanelPembayaran.setTabComponentAt(customTabbedPanelPembayaran.getTabCount()-1, addButton);

        javax.swing.GroupLayout pembayaranPanelLayout = new javax.swing.GroupLayout(pembayaranPanel);
        pembayaranPanel.setLayout(pembayaranPanelLayout);
        pembayaranPanelLayout.setHorizontalGroup(
            pembayaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembayaranPanelLayout.createSequentialGroup()
                .addGroup(pembayaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pembayaranPanelLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(logoPembayaran))
                    .addGroup(pembayaranPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pembayaranPanelLayout.setVerticalGroup(
            pembayaranPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembayaranPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(logoPembayaran)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
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
    private main.featureGUI.Util.customtabbedpane.CustomTabbedPane customTabbedPanelPembayaran;
    private main.featureGUI.Util.Kasir defaultKasir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoPembayaran;
    private javax.swing.JPanel pembayaranPanel;
    // End of variables declaration//GEN-END:variables

    public class TabComponent extends javax.swing.JPanel {

        /** Creates new form TabComponent */
        private String title;
        private Component component;
        public TabComponent(String title, Component component) {
            this.title = title;
            this.component = component;
            initComponents();
        }
                       
        private void initComponents() {
    
            deleteButton = new javax.swing.JButton();
            titleTab = new javax.swing.JLabel();
    
            setOpaque(false);
    
            deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/X.png")));
            deleteButton.setBorderPainted(false);
            deleteButton.setContentAreaFilled(false);
            deleteButton.setPreferredSize(new java.awt.Dimension(20, 20));
            deleteButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            deleteButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    deleteButtonActionPerformed(evt);
                }
            });
            titleTab.setFont(new Font("Inter", 0, 18));
            titleTab.setForeground(new Color(40, 41, 61));
            titleTab.setText(this.title);
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(titleTab, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addGap(0, 0, 0)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }// </editor-fold>                        
    
        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
            customTabbedPanelPembayaran.remove(component);
        }                                            
    
    
        // Variables declaration - do not modify                     
        private javax.swing.JButton deleteButton;
        private javax.swing.JLabel titleTab;
        // End of variables declaration                   
    
    }
}
