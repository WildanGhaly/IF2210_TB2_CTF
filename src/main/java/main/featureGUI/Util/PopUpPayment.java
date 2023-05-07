/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.featureGUI.Util;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;

import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.xml.bind.JAXBException;

import customer.Customer;
import datastore.DataStoreMechanism;
import sistemusahabarang.FixedBill;

/**
 *
 * @author user
 */
public class PopUpPayment extends javax.swing.JFrame {

    private final Image boxPopUpPaymentImg = RequestImage.requestImage("pembayaran/popuppayment/boxPopUpPayment.png");
    private final Image boxPopUpBarang = RequestImage.requestImage("pembayaran/popuppayment/boxPopUpBarang.png");
    private final Image boxDiscAndTax = RequestImage.requestImage("pembayaran/popuppayment/boxDiscAndTax.png");
    private String[][] listBarang;
    private String namaCustomer;
    private String[] namaBarang;
    private String[] hargaBarang;
    private String[] jumlahBarang;
    private String[][] customer;
    private String pathCustomer = "src/main/java/datastore/database/Customer/customer.xml";
    private Double total=0.0;
    private Double diskon = 1.0;

    public PopUpPayment(String[][] list, String name){
        this.listBarang = new String[list.length][list[0].length];
        this.listBarang = list;
        this.namaBarang = new String[list.length];
        this.hargaBarang = new String[list.length];
        this.jumlahBarang = new String[list.length];
        this.namaCustomer = name;
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        try {
            customer = DataStoreMechanism.getMembersAsString(pathVIP);
        } catch (ClassNotFoundException | IOException | JAXBException e) {
            e.printStackTrace();
        }
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
        listCountBarang = new javax.swing.JList<>();
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
        buttonSaveBill = new javax.swing.JButton();
        buttonPrintBill = new javax.swing.JButton();
        taxPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxDiscAndTax, 0, 0, null);
            }
        };
        comboBoxTax = new main.featureGUI.Util.customcombobox.Combobox();
        discPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxDiscAndTax, 0, 0, null);
            }
        };
        comboBoxDisc = new main.featureGUI.Util.customcombobox.Combobox();
        jLabel1 = new javax.swing.JLabel();

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
        listBarangTerbeli2.setModel(new javax.swing.DefaultListModel<String>());
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
        listBarangTerbeli1.setModel(new javax.swing.DefaultListModel<String>());
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
        scrollPaneQuantity.setViewportView(listCountBarang);

        listCountBarang.setBackground(new java.awt.Color(0, 0, 0, 0));
        listCountBarang.setBorder(null);
        listCountBarang.setFont(new java.awt.Font("Inter", 0, 20));
        listCountBarang.setForeground(new java.awt.Color(62, 231, 188));
        listCountBarang.setModel(new javax.swing.DefaultListModel<String>());
        listCountBarang.setOpaque(false);
        listCountBarang.setSelectionBackground(new java.awt.Color(62, 231, 188));
        listCountBarang.setSelectionForeground(new java.awt.Color(40, 41, 61));
        listCountBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCountBarangMouseClicked(evt);
            }
        });
        scrollPaneQuantity.setViewportView(listCountBarang);

        javax.swing.GroupLayout popUpScrollPanelLayout = new javax.swing.GroupLayout(popUpScrollPanel);
        popUpScrollPanel.setLayout(popUpScrollPanelLayout);
        popUpScrollPanelLayout.setHorizontalGroup(
            popUpScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popUpScrollPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scrollPaneNama, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBarCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        popUpScrollPanelLayout.setVerticalGroup(
            popUpScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popUpScrollPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(popUpScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPaneQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollBarCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(popUpScrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPaneNama, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPaneHarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(4, Short.MAX_VALUE))
        );

        buttonSaveBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/popuppayment/buttonSaveBill.png"))); // NOI18N
        buttonSaveBill.setBorder(null);
        buttonSaveBill.setBorderPainted(false);
        buttonSaveBill.setContentAreaFilled(false);
        buttonSaveBill.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonSaveBill.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/popuppayment/buttonSaveBillClicked.png"))); // NOI18N
        buttonSaveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveBillActionPerformed(evt);
            }
        });

        buttonPrintBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/popuppayment/buttonPrintBill.png"))); // NOI18N
        buttonPrintBill.setBorder(null);
        buttonPrintBill.setBorderPainted(false);
        buttonPrintBill.setContentAreaFilled(false);
        buttonPrintBill.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonPrintBill.setPreferredSize(new java.awt.Dimension(115, 39));
        buttonPrintBill.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pembayaran/popuppayment/buttonPrintBillClicked.png"))); // NOI18N
        buttonPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintBillActionPerformed(evt);
            }
        });

        taxPanel.setOpaque(false);
        taxPanel.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxTax.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxTax.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxTax.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5%" }));
        comboBoxTax.setSelectedIndex(-1);
        comboBoxTax.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxTax.setLabelText("Tax");
        comboBoxTax.setOpaque(false);
        comboBoxTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTaxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout taxPanelLayout = new javax.swing.GroupLayout(taxPanel);
        taxPanel.setLayout(taxPanelLayout);
        taxPanelLayout.setHorizontalGroup(
            taxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxTax, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        taxPanelLayout.setVerticalGroup(
            taxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxPanelLayout.createSequentialGroup()
                .addComponent(comboBoxTax, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        discPanel.setOpaque(false);
        discPanel.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxDisc.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxDisc.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxDisc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10%" }));
        comboBoxDisc.setSelectedIndex(-1);
        comboBoxDisc.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxDisc.setLabelText("Disc");
        comboBoxDisc.setOpaque(false);
        comboBoxDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDiscActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout discPanelLayout = new javax.swing.GroupLayout(discPanel);
        discPanel.setLayout(discPanelLayout);
        discPanelLayout.setHorizontalGroup(
            discPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        discPanelLayout.setVerticalGroup(
            discPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discPanelLayout.createSequentialGroup()
                .addComponent(comboBoxDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Inter", java.awt.Font.BOLD, 18));
        jLabel1.setForeground(new java.awt.Color(217, 217, 217));
        jLabel1.setText("Total: RpXXXXX");

        javax.swing.GroupLayout boxPopUpLayout = new javax.swing.GroupLayout(boxPopUp);
        boxPopUp.setLayout(boxPopUpLayout);
        boxPopUpLayout.setHorizontalGroup(
            boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPopUpLayout.createSequentialGroup()
                .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxPopUpLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(labelPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(boxPopUpLayout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonSaveBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)
                            .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(discPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(taxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, boxPopUpLayout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(popUpScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boxPopUpLayout.setVerticalGroup(
            boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPopUpLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelPopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(popUpScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(discPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSaveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(boxPopUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        for (int i = 0; i < listBarang.length; i++) {
            namaBarang[i] = listBarang[i][1];
            hargaBarang[i] = listBarang[i][3];
            jumlahBarang[i] = "COUNT";
        }
        listBarangTerbeli1.setListData(hargaBarang);
        listBarangTerbeli2.setListData(namaBarang);
        listCountBarang.setListData(jumlahBarang);
        

    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTaxActionPerformed
        comboBoxTax.setSelectedIndex(-1);
        comboBoxTax.setLabelText("2.5%");
        total = 0.0;
        for (int i = 0; i < listCountBarang.getModel().getSize(); i++) {
            if (listCountBarang.getModel().getElementAt(i) != "COUNT"){
                total += ((Double.valueOf(listCountBarang.getModel().getElementAt(i)) * Double.valueOf(this.listBarang[i][3])) * diskon);
            }
        }
    }//GEN-LAST:event_comboBoxTaxActionPerformed

    private void comboBoxDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDiscActionPerformed
        total = 0.0;
        try {
            if (namaCustomer.isEmpty()){
                comboBoxDisc.setSelectedIndex(0);
                comboBoxDisc.setLabelText("0%");
                
            } else if (DataStoreMechanism.isVIPClass(pathMember, pathVIP, namaCustomer)==0){
                comboBoxDisc.setSelectedIndex(0);
                comboBoxDisc.setLabelText("0%");
            } else {
                diskon = 0.9;
            }
            for (int i = 0; i < listCountBarang.getModel().getSize(); i++) {
                if (listCountBarang.getModel().getElementAt(i) != "COUNT"){
                    total += ((Double.valueOf(listCountBarang.getModel().getElementAt(i)) * Double.valueOf(this.listBarang[i][3])) * diskon);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboBoxDiscActionPerformed

    private void buttonSaveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveBillActionPerformed
        FixedBill fixedBill = new FixedBill();
        String path         = "src/main/java/datastore/database/Barang/barang.xml";
        String historyPath = "src/main/java/datastore/database/History/history.xml";
        //TODO disinii wil
        for (int i = 0; i < listBarang.length; i++) {
            fixedBill.addItem(Integer.valueOf(listBarang[i][0]), Integer.valueOf(listCountBarang.getModel().getElementAt(i)));
            // System.out.println(listBarang[i][0] + " " + listCountBarang.getModel().getElementAt(i));
        }
        try {

            if (namaCustomer.isEmpty()){
                FixedBill.saveHistory(historyPath, path, fixedBill, String.valueOf(namaCustomer), customer.length);    
            } else {
                FixedBill.saveHistory(historyPath, path, fixedBill, namaCustomer, customer.length);
            }
            DataStoreMechanism.getItemsPrice(path, fixedBill.getItems());
            
            JOptionPane.showMessageDialog(null, "Berhasil disimpan!");
        } catch (ClassNotFoundException | IOException | JAXBException e) {
            e.printStackTrace();
        }

        //TODO sampe disini
    }//GEN-LAST:event_buttonSaveBillActionPerformed

    private void buttonPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPrintBillActionPerformed

    private void listCountBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCountBarangMouseClicked
        String jumlah = JOptionPane.showInputDialog("Jumlah barang: ");
        if (comboBoxDisc.getSelectedIndex()!=0 || comboBoxDisc.getSelectedIndex()!=-1){
            diskon = 0.9;
        }
        if (Integer.valueOf(jumlah) <= Integer.valueOf(this.listBarang[listCountBarang.getSelectedIndex()][2])){
            this.jumlahBarang[listCountBarang.getSelectedIndex()] = jumlah;
            total = 0.0;
            for (int i = 0; i < listCountBarang.getModel().getSize(); i++) {
                if (listCountBarang.getModel().getElementAt(i) != "COUNT"){
                    total += ((Double.valueOf(listCountBarang.getModel().getElementAt(i)) * Double.valueOf(this.listBarang[i][3])) * diskon);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Stok hanya tersisa: " + this.listBarang[listCountBarang.getSelectedIndex()][2]);
        }
        jLabel1.setText("Total: " + String.valueOf(total));
    }//GEN-LAST:event_listCountBarangMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boxPopUp;
    private javax.swing.JButton buttonPrintBill;
    private javax.swing.JButton buttonSaveBill;
    private main.featureGUI.Util.customcombobox.Combobox comboBoxDisc;
    private main.featureGUI.Util.customcombobox.Combobox comboBoxTax;
    private javax.swing.JPanel discPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPopUp;
    private javax.swing.JList<String> listBarangTerbeli1;
    private javax.swing.JList<String> listBarangTerbeli2;
    private javax.swing.JList<String> listCountBarang;
    private javax.swing.JPanel popUpScrollPanel;
    private main.featureGUI.Util.customcombobox.ScrollBarCustom scrollBarCustom;
    private javax.swing.JScrollPane scrollPaneHarga;
    private javax.swing.JScrollPane scrollPaneNama;
    private javax.swing.JScrollPane scrollPaneQuantity;
    private javax.swing.JPanel taxPanel;
    private String pathFormat = ".xml";
    private String pathMember = "src/main/java/datastore/database/Member/member" + pathFormat;
    private String pathVIP = "src/main/java/datastore/database/VIP/vip" + pathFormat;

}