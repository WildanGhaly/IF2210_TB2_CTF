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
    private final Image boxDiscAndTax = RequestImage.requestImage("pembayaran/popuppayment/boxDiscAndTax.png");
    private String[][] listBarang;
    
    
    
    public PopUpPayment(String[][] listBarang){
        this.listBarang = listBarang;
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
        scrollPaneNama = new javax.swing.JScrollPane();
        listBarangTerbeli2 = new javax.swing.JList<>();
        scrollPaneNama.getViewport().setOpaque(false);
        scrollPaneNama.setViewportBorder(new Border() {

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
        scrollPaneHarga = new javax.swing.JScrollPane();
        listBarangTerbeli1 = new javax.swing.JList<>();
        scrollPaneHarga.getViewport().setOpaque(false);
        scrollPaneHarga.setViewportBorder(new Border() {

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
        scrollPaneQuantity = new javax.swing.JScrollPane();
        listBarangTerbeli3 = new javax.swing.JList<>();
        scrollPaneQuantity.getViewport().setOpaque(false);
        scrollPaneQuantity.setViewportBorder(new Border() {

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        statusPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxDiscAndTax, 0, 0, null);
            }
        };
        comboBoxStatus = new main.featureGUI.Util.customcombobox.Combobox();
        statusPanel3 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxDiscAndTax, 0, 0, null);
            }
        };
        comboBoxStatus4 = new main.featureGUI.Util.customcombobox.Combobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(40, 41, 61));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(40, 41, 61));
        setType(java.awt.Window.Type.POPUP);

        boxPopUp.setBackground(new java.awt.Color(40, 41, 61));

        labelPopUp.setFont(new java.awt.Font("Inter", java.awt.Font.BOLD, 28));
        labelPopUp.setForeground(new java.awt.Color(217, 217, 217));
        labelPopUp.setText("Customer's Items");

        popUpScrollPanel.setOpaque(false);
        popUpScrollPanel.setPreferredSize(new java.awt.Dimension(612, 301));

        scrollPaneNama.setBackground(new java.awt.Color(0,0,0,0));
        scrollPaneNama.setBorder(null);
        scrollPaneNama.setOpaque(false);
        scrollPaneNama.setVerticalScrollBar(scrollBarCustom);
        scrollPaneNama.setViewportView(listBarangTerbeli2);

        listBarangTerbeli2.setBackground(new java.awt.Color(0, 0, 0, 0));
        listBarangTerbeli2.setBorder(null);
        listBarangTerbeli2.setFont(new java.awt.Font("Inter", 0, 20));
        listBarangTerbeli2.setForeground(new java.awt.Color(62, 231, 188));
        listBarangTerbeli2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1   ", "Item 2   ", "Item 3   ", "Item 4   ", "Item 5   ", "Item 6   ", "Item 7   ", "Item 8   ", "Item 9   ", "Item 10 " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBarangTerbeli2.setFocusable(false);
        listBarangTerbeli2.setOpaque(false);
        listBarangTerbeli2.setRequestFocusEnabled(false);
        listBarangTerbeli2.setSelectionBackground(new java.awt.Color(0, 0, 0, 0));
        listBarangTerbeli2.setSelectionForeground(new java.awt.Color(62, 231, 188));
        scrollPaneNama.setViewportView(listBarangTerbeli2);

        scrollPaneHarga.setBackground(new java.awt.Color(0,0,0,0));
        scrollPaneHarga.setBorder(null);
        scrollPaneHarga.setOpaque(false);
        scrollPaneHarga.setVerticalScrollBar(scrollBarCustom);
        scrollPaneHarga.setViewportView(listBarangTerbeli1);

        listBarangTerbeli1.setBackground(new java.awt.Color(0, 0, 0, 0));
        listBarangTerbeli1.setBorder(null);
        listBarangTerbeli1.setFont(new java.awt.Font("Inter", 0, 20));
        listBarangTerbeli1.setForeground(new java.awt.Color(62, 231, 188));
        listBarangTerbeli1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "RpXXXXX", "RpXXXXX", "RoXXXXX", "RpXXXXX", "RpXXXXX", "RpXXXXX", "RpXXXXX", "RpXXXXX", "RpXXXXX", "RpXXXXX" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBarangTerbeli1.setFocusable(false);
        listBarangTerbeli1.setOpaque(false);
        listBarangTerbeli1.setRequestFocusEnabled(false);
        listBarangTerbeli1.setSelectionBackground(new java.awt.Color(0, 0, 0, 0));
        listBarangTerbeli1.setSelectionForeground(new java.awt.Color(62, 231, 188));
        scrollPaneHarga.setViewportView(listBarangTerbeli1);

        scrollPaneQuantity.setBackground(new java.awt.Color(0,0,0,0));
        scrollPaneQuantity.setBorder(null);
        scrollPaneQuantity.setOpaque(false);
        scrollPaneQuantity.setVerifyInputWhenFocusTarget(false);
        scrollPaneQuantity.setVerticalScrollBar(scrollBarCustom);
        scrollPaneQuantity.setViewportView(listBarangTerbeli3);

        listBarangTerbeli3.setBackground(new java.awt.Color(0, 0, 0, 0));
        listBarangTerbeli3.setBorder(null);
        listBarangTerbeli3.setFont(new java.awt.Font("Inter", 0, 20));
        listBarangTerbeli3.setForeground(new java.awt.Color(62, 231, 188));
        listBarangTerbeli3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "COUNT", "COUNT", "COUNT", "COUNT", "COUNT", "COUNT", "COUNT", "COUNT", "COUNT", "COUNT" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listBarangTerbeli3.setOpaque(false);
        listBarangTerbeli3.setSelectionBackground(new java.awt.Color(62, 231, 188));
        listBarangTerbeli3.setSelectionForeground(new java.awt.Color(40, 41, 61));
        scrollPaneQuantity.setViewportView(listBarangTerbeli3);

        javax.swing.GroupLayout popUpScrollPanelLayout = new javax.swing.GroupLayout(popUpScrollPanel);
        popUpScrollPanel.setLayout(popUpScrollPanelLayout);
        popUpScrollPanelLayout.setHorizontalGroup(
            popUpScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popUpScrollPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scrollPaneNama, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        popUpScrollPanelLayout.setVerticalGroup(
            popUpScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popUpScrollPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(popUpScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneNama, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/popuppayment/buttonSaveBill.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(9999, 9999));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/popuppayment/buttonSaveBillClicked.png"))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/popuppayment/buttonPrintBill.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setMaximumSize(new java.awt.Dimension(9999, 9999));
        jButton2.setPreferredSize(new java.awt.Dimension(115, 39));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/popuppayment/buttonPrintBillClicked.png"))); // NOI18N

        statusPanel.setOpaque(false);
        statusPanel.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxStatus.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxStatus.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10%", "12%", "5%" }));
        comboBoxStatus.setSelectedIndex(-1);
        comboBoxStatus.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxStatus.setLabelText("Tax");
        comboBoxStatus.setOpaque(false);
        comboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        statusPanel3.setOpaque(false);
        statusPanel3.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxStatus4.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxStatus4.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxStatus4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10%", "20%", "13%" }));
        comboBoxStatus4.setSelectedIndex(-1);
        comboBoxStatus4.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxStatus4.setLabelText("Disc");
        comboBoxStatus4.setOpaque(false);
        comboBoxStatus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStatus4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanel3Layout = new javax.swing.GroupLayout(statusPanel3);
        statusPanel3.setLayout(statusPanel3Layout);
        statusPanel3Layout.setHorizontalGroup(
            statusPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statusPanel3Layout.setVerticalGroup(
            statusPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanel3Layout.createSequentialGroup()
                .addComponent(comboBoxStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollBarCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boxPopUpLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statusPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boxPopUpLayout.setVerticalGroup(
            boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPopUpLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxPopUpLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popUpScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boxPopUpLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(scrollBarCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
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

    private void comboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatusActionPerformed
        /*TODO find membernya didatabse*/
        
    }//GEN-LAST:event_comboBoxStatusActionPerformed

    private void comboBoxStatus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatus4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxStatus4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boxPopUp;
    private main.featureGUI.Util.customcombobox.Combobox comboBoxStatus;
    private main.featureGUI.Util.customcombobox.Combobox comboBoxStatus4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel labelPopUp;
    private javax.swing.JList<String> listBarangTerbeli1;
    private javax.swing.JList<String> listBarangTerbeli2;
    private javax.swing.JList<String> listBarangTerbeli3;
    private javax.swing.JPanel popUpScrollPanel;
    private main.featureGUI.Util.customcombobox.ScrollBarCustom scrollBarCustom;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JScrollPane scrollPane4;
    private javax.swing.JScrollPane scrollPaneHarga;
    private javax.swing.JScrollPane scrollPaneNama;
    private javax.swing.JScrollPane scrollPaneQuantity;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JPanel statusPanel3;
    // End of variables declaration//GEN-END:variables
}
