/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.featureGUI.Util;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author user
 */
public class PopUpPayment extends javax.swing.JFrame {

    private final Image boxPopUpPaymentImg = RequestImage.requestImage("pembayaran/popuppayment/boxPopUpPayment.png");
    private final Image boxPopUpBarang = RequestImage.requestImage("pembayaran/popuppayment/boxPopUpBarang.png");
    public PopUpPayment() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxPopUp = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxPopUpPaymentImg, 0, 0, null);
            }
        };
        labelPopUp = new javax.swing.JLabel();
        popUpScrollPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxPopUpBarang, 0, 0, null);
            }
        };
        scrollPane = new javax.swing.JScrollPane();
        listBarangTerbeli = new javax.swing.JList<>();
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setViewportBorder(new Border() {

            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

            }

            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(0,0,0,0);
            }

            @Override
            public boolean isBorderOpaque() {
                return false;    
            }
        });
        scrollBarCustom = new main.featureGUI.Util.customcombobox.ScrollBarCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(40, 41, 61));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(40, 41, 61));
        setType(java.awt.Window.Type.POPUP);

        boxPopUp.setBackground(new java.awt.Color(40, 41, 61));

        popUpScrollPanel.setOpaque(false);
        popUpScrollPanel.setPreferredSize(new java.awt.Dimension(612, 301));

        scrollPane.setBackground(new java.awt.Color(0,0,0,0));
        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);
        scrollPane.setVerticalScrollBar(scrollBarCustom);
        scrollPane.setViewportView(listBarangTerbeli);

        listBarangTerbeli.setBackground(new java.awt.Color(0, 0, 0, 0));
        listBarangTerbeli.setBorder(null);
        listBarangTerbeli.setFont(new java.awt.Font("Inter", 0, 20));
        listBarangTerbeli.setForeground(new java.awt.Color(217, 217, 217));
        listBarangTerbeli.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBarangTerbeli.setOpaque(false);
        listBarangTerbeli.setSelectionBackground(new java.awt.Color(62, 231, 188));
        listBarangTerbeli.setSelectionForeground(new java.awt.Color(40, 41, 61));
        scrollPane.setViewportView(listBarangTerbeli);

        javax.swing.GroupLayout popUpScrollPanelLayout = new javax.swing.GroupLayout(popUpScrollPanel);
        popUpScrollPanel.setLayout(popUpScrollPanelLayout);
        popUpScrollPanelLayout.setHorizontalGroup(
            popUpScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popUpScrollPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        popUpScrollPanelLayout.setVerticalGroup(
            popUpScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popUpScrollPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout boxPopUpLayout = new javax.swing.GroupLayout(boxPopUp);
        boxPopUp.setLayout(boxPopUpLayout);
        boxPopUpLayout.setHorizontalGroup(
            boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPopUpLayout.createSequentialGroup()
                .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxPopUpLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(labelPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boxPopUpLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(popUpScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollBarCustom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        boxPopUpLayout.setVerticalGroup(
            boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPopUpLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(popUpScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(boxPopUpLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(scrollBarCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxPopUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxPopUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boxPopUp;
    private javax.swing.JLabel labelPopUp;
    private javax.swing.JList<String> listBarangTerbeli;
    private javax.swing.JPanel popUpScrollPanel;
    private main.featureGUI.Util.customcombobox.ScrollBarCustom scrollBarCustom;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
