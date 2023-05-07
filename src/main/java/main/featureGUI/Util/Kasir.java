/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI.Util;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.xml.bind.JAXBException;

import datastore.DataStoreMechanism;
import sistemusahabarang.Barang;

/**
 *
 * @author user
 */
public class Kasir extends javax.swing.JPanel {

    private final Image boxKatalogImg = RequestImage.requestImage("pembayaran/boxKatalogBarang.png");
    private final Image boxKatalog2Img = RequestImage.requestImage("pembayaran/boxHapusBarang.png");
    private final Image boxKatalog3Img = RequestImage.requestImage("pembayaran/customerBox.png");

    private String pathFormat = ".xml";
    private String pathItem = "src/main/java/datastore/database/Barang/barang" + pathFormat;
    private String pathMember = "src/main/java/datastore/database/Member/member" + pathFormat;
    private String pathVIP = "src/main/java/datastore/database/VIP/vip" + pathFormat;
    
    private List<BarangUI> listBarang = new ArrayList<>();

    public Kasir() {
        initComponents();
    }

    public void instantiate(){
        for (Integer i = 0; i < 20; i++) {
            listBarang.add(new BarangUI(new Barang(32, i, ("Barang".concat(i.toString())), 20000, 18000, "Pecahan", null, null)));
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boxKasir = new javax.swing.JPanel();
        boxTambahBarang = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxKatalogImg, 0, 0, null);
            }
        };
        scrollTambahBarang = new javax.swing.JScrollPane();
        listTambahBarang = new javax.swing.JList<>();
        scrollTambahBarang.getViewport().setOpaque(false);
        scrollTambahBarang.setViewportBorder(new Border() {

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
        labelTambahBarang = new javax.swing.JLabel();
        scrollBarCustom1 = new main.featureGUI.Util.customcombobox.ScrollBarCustom();
        boxHapusBarang = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxKatalog2Img, 0, 0, null);
            }
        };
        labelHapusBarang = new javax.swing.JLabel();
        scrollHapusBarang = new javax.swing.JScrollPane();
        listHapusBarang = new javax.swing.JList<>();
        scrollHapusBarang.getViewport().setOpaque(false);
        scrollHapusBarang.setViewportBorder(new Border() {

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
        scrollBarCustom2 = new main.featureGUI.Util.customcombobox.ScrollBarCustom();
        customerPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxKatalog3Img, 0, 0, null);
            }
        };
        comboBoxCustomer = new main.featureGUI.Util.customcombobox.Combobox<>();
        payButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(730, 447));

        boxKasir.setBackground(new java.awt.Color(40, 41, 61));
        boxKasir.setOpaque(false);

        boxTambahBarang.setOpaque(false);

        scrollTambahBarang.setBorder(null);
        scrollTambahBarang.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollTambahBarang.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollTambahBarang.setOpaque(false);
        scrollTambahBarang.setVerticalScrollBar(scrollBarCustom1);
        scrollTambahBarang.setViewportView(listTambahBarang);

        listTambahBarang.setBackground(new java.awt.Color(0,0,0,0));
        listTambahBarang.setBorder(null);
        listTambahBarang.setFont(new java.awt.Font("Inter", 0 ,20));
        listTambahBarang.setForeground(new java.awt.Color(62, 231, 188));
        listTambahBarang.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10", "Item 11", "Item 12", "Item 13", "Item 14", "Item 15" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listTambahBarang.setOpaque(false);
        listTambahBarang.setSelectionBackground(new java.awt.Color(62, 231, 188));
        listTambahBarang.setSelectionForeground(new java.awt.Color(40, 41, 61));
        listTambahBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTambahBarangMouseClicked(evt);
            }
        });
        scrollTambahBarang.setViewportView(listTambahBarang);

        labelTambahBarang.setFont(new java.awt.Font("Inter", 1, 22));
        labelTambahBarang.setForeground(new java.awt.Color(217, 217, 217));
        labelTambahBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTambahBarang.setText(" Tambah Barang");

        javax.swing.GroupLayout boxTambahBarangLayout = new javax.swing.GroupLayout(boxTambahBarang);
        boxTambahBarang.setLayout(boxTambahBarangLayout);
        boxTambahBarangLayout.setHorizontalGroup(
            boxTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxTambahBarangLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(boxTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(boxTambahBarangLayout.createSequentialGroup()
                        .addComponent(scrollTambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        boxTambahBarangLayout.setVerticalGroup(
            boxTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxTambahBarangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollBarCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollTambahBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        boxHapusBarang.setOpaque(false);

        labelHapusBarang.setFont(new java.awt.Font("Inter", 1, 22)
        );
        labelHapusBarang.setForeground(new java.awt.Color(217, 217, 217));
        labelHapusBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHapusBarang.setText("Hapus Barang");

        scrollHapusBarang.setBorder(null);
        scrollHapusBarang.setVerticalScrollBar(scrollBarCustom2);
        scrollHapusBarang.setViewportView(listHapusBarang);

        listHapusBarang.setBackground(new java.awt.Color(0,0,0,0));
        listHapusBarang.setBorder(null);
        listHapusBarang.setFont(new java.awt.Font("Inter", 1 ,12));
        listHapusBarang.setForeground(new java.awt.Color(62, 231, 188));
        listHapusBarang.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listHapusBarang.setOpaque(false);
        listHapusBarang.setSelectionBackground(new java.awt.Color(62, 231, 188));
        listHapusBarang.setSelectionForeground(new java.awt.Color(40, 41, 61));
        listHapusBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listHapusBarangMouseClicked(evt);
            }
        });
        scrollHapusBarang.setViewportView(listHapusBarang);

        javax.swing.GroupLayout boxHapusBarangLayout = new javax.swing.GroupLayout(boxHapusBarang);
        boxHapusBarang.setLayout(boxHapusBarangLayout);
        boxHapusBarangLayout.setHorizontalGroup(
            boxHapusBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxHapusBarangLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(boxHapusBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelHapusBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(boxHapusBarangLayout.createSequentialGroup()
                        .addComponent(scrollHapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollBarCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        boxHapusBarangLayout.setVerticalGroup(
            boxHapusBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxHapusBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHapusBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxHapusBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollBarCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollHapusBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customerPanel.setOpaque(false);
        customerPanel.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxCustomer.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxCustomer.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxCustomer.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Member1", "Member2", "VIP1", "VIP2", "VIP3" }));
        comboBoxCustomer.setSelectedIndex(-1);
        comboBoxCustomer.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxCustomer.setLabelText("Customer");
        comboBoxCustomer.setOpaque(false);
        comboBoxCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(comboBoxCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        payButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/payButton.png"))); // NOI18N
        payButton.setContentAreaFilled(false);
        payButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/payButtonClicked.png"))); // NOI18N
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout boxKasirLayout = new javax.swing.GroupLayout(boxKasir);
        boxKasir.setLayout(boxKasirLayout);
        boxKasirLayout.setHorizontalGroup(
            boxKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxKasirLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(boxTambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxKasirLayout.createSequentialGroup()
                        .addComponent(boxHapusBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(boxKasirLayout.createSequentialGroup()
                        .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        boxKasirLayout.setVerticalGroup(
            boxKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxKasirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(boxKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxTambahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxKasirLayout.createSequentialGroup()
                        .addComponent(boxHapusBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boxKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void listTambahBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTambahBarangMouseClicked
        System.out.println(listTambahBarang.getSelectedValue());
    }//GEN-LAST:event_listTambahBarangMouseClicked

    private void listHapusBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listHapusBarangMouseClicked
        System.out.println(listHapusBarang.getSelectedValue());
    }//GEN-LAST:event_listHapusBarangMouseClicked

    private void comboBoxCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCustomerActionPerformed
        /*TODO ganti statusnya*/
        try {
            String[][] members = DataStoreMechanism.getMembersAsString(pathMember);
            String[][] vip = DataStoreMechanism.getMembersAsString(pathVIP);
        } catch (ClassNotFoundException | IOException | JAXBException e) {
            e.printStackTrace();
        }
        String.valueOf(comboBoxCustomer.getSelectedItem());
        
    }//GEN-LAST:event_comboBoxCustomerActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        JFrame popUpPayment = new PopUpPayment(null);
        popUpPayment.setVisible(true);
    }//GEN-LAST:event_payButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boxHapusBarang;
    private javax.swing.JPanel boxKasir;
    private javax.swing.JPanel boxTambahBarang;
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxCustomer;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelHapusBarang;
    private javax.swing.JLabel labelTambahBarang;
    private javax.swing.JList<String> listHapusBarang;
    private javax.swing.JList<String> listTambahBarang;
    private javax.swing.JButton payButton;
    private main.featureGUI.Util.customcombobox.ScrollBarCustom scrollBarCustom1;
    private main.featureGUI.Util.customcombobox.ScrollBarCustom scrollBarCustom2;
    private javax.swing.JScrollPane scrollHapusBarang;
    private javax.swing.JScrollPane scrollTambahBarang;
    // End of variables declaration//GEN-END:variables
}
