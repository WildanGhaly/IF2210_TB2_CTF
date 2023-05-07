/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import main.featureGUI.Util.RequestImage;

/**
 *
 * @author user
 */
public class GudangGUI extends javax.swing.JPanel {

    /**
     * Creates new form Gudang
     */
    private static final GudangGUI GUDANG_GUI = new GudangGUI();
    private final Image comboBoxUpdateImg = RequestImage.requestImage("updatemember/comboBoxUpdateMember.png");
    private final Image statusBoxPanelImg = RequestImage.requestImage("updatemember/boxStatus.png");

    private GudangGUI() {
        initComponents();
    }

    public static GudangGUI getInstance(){
        return GudangGUI.GUDANG_GUI;
    }

    public JPanel getPanel(){
        return this.gudangPanel;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gudangPanel = new javax.swing.JPanel();
        logoGudang = new javax.swing.JLabel();
        comboBoxPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(comboBoxUpdateImg, 0, 0, null);
            }
        };
        comboBoxCariBarang = new main.featureGUI.Util.customcombobox.Combobox<>();
        polygonCariMember = new javax.swing.JLabel();
        gambarBarang = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        statusPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(statusBoxPanelImg, 0, 0, null);
            }
        };
        comboBoxJenis = new main.featureGUI.Util.customcombobox.Combobox<>();
        hargaJ = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hargaB1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        namaPanel = new javax.swing.JPanel();
        namaBarang = new javax.swing.JLabel();
        descPanel = new javax.swing.JPanel();
        desc = new javax.swing.JLabel();

        gudangPanel.setBackground(new java.awt.Color(40, 41, 61));
        gudangPanel.setForeground(new java.awt.Color(72, 84, 254));

        logoGudang.setBackground(new java.awt.Color(40, 41, 61));
        logoGudang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoGudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gudang/logoGudang.png"))); // NOI18N

        comboBoxPanel.setOpaque(false);
        comboBoxPanel.setPreferredSize(new java.awt.Dimension(766, 80));

        comboBoxCariBarang.setBackground(new java.awt.Color(0,0,0,0));
        comboBoxCariBarang.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxCariBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ayam bakar", "Ayam goreng", "Jerapah guling"}));
        comboBoxCariBarang.setSelectedIndex(-1);
        comboBoxCariBarang.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxCariBarang.setLabelText("Pilih Barang");
        comboBoxCariBarang.setOpaque(false);
        comboBoxCariBarang.setPreferredSize(new java.awt.Dimension(708, 44));
        comboBoxCariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCariBarangActionPerformed(evt);
            }
        });

        polygonCariMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/updatemember/Polygon1.png"))); // NOI18N

        gambarBarang.setBackground(new java.awt.Color(40, 41, 61));

        javax.swing.GroupLayout comboBoxPanelLayout = new javax.swing.GroupLayout(comboBoxPanel);
        comboBoxPanel.setLayout(comboBoxPanelLayout);
        comboBoxPanelLayout.setHorizontalGroup(
            comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboBoxPanelLayout.createSequentialGroup()
                .addGroup(comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comboBoxPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(comboBoxCariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(polygonCariMember))
                    .addGroup(comboBoxPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(gambarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        comboBoxPanelLayout.setVerticalGroup(
            comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboBoxPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(polygonCariMember)
                    .addComponent(comboBoxCariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gambarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(40, 41, 61));
        jPanel1.setForeground(new java.awt.Color(40, 41, 61));

        jLabel2.setBackground(new java.awt.Color(40, 41, 61));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(62, 231, 188));
        jLabel2.setText("Stock          :");

        jButton1.setBackground(new java.awt.Color(40, 41, 61));
        jButton1.setForeground(new java.awt.Color(40, 41, 61));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gudang/min.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(40, 41, 61));
        jButton2.setForeground(new java.awt.Color(40, 41, 61));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gudang/plus.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        statusPanel.setOpaque(false);
        statusPanel.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxJenis.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxJenis.setForeground(new java.awt.Color(72, 84, 254));
        comboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));
        comboBoxJenis.setSelectedIndex(-1);
        comboBoxJenis.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxJenis.setLabelText("Jenis");
        comboBoxJenis.setOpaque(false);
        comboBoxJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxJenisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(comboBoxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(comboBoxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        hargaJ.setBackground(new java.awt.Color(40, 41, 61));
        hargaJ.setForeground(new java.awt.Color(40, 41, 61));

        jLabel3.setBackground(new java.awt.Color(40, 41, 61));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 231, 188));
        jLabel3.setText("Harga jual          :");

        javax.swing.GroupLayout hargaJLayout = new javax.swing.GroupLayout(hargaJ);
        hargaJ.setLayout(hargaJLayout);
        hargaJLayout.setHorizontalGroup(
            hargaJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hargaJLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hargaJLayout.setVerticalGroup(
            hargaJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hargaJLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        hargaB1.setBackground(new java.awt.Color(40, 41, 61));
        hargaB1.setForeground(new java.awt.Color(40, 41, 61));

        jLabel5.setBackground(new java.awt.Color(40, 41, 61));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(62, 231, 188));
        jLabel5.setText("Harga beli          :");

        javax.swing.GroupLayout hargaB1Layout = new javax.swing.GroupLayout(hargaB1);
        hargaB1.setLayout(hargaB1Layout);
        hargaB1Layout.setHorizontalGroup(
            hargaB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hargaB1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hargaB1Layout.setVerticalGroup(
            hargaB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hargaB1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        namaPanel.setBackground(new java.awt.Color(40, 41, 61));
        namaPanel.setForeground(new java.awt.Color(40, 41, 61));

        namaBarang.setBackground(new java.awt.Color(40, 41, 61));
        namaBarang.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        namaBarang.setForeground(new java.awt.Color(62, 231, 188));
        namaBarang.setText("Ayam Goreng Enak");

        javax.swing.GroupLayout namaPanelLayout = new javax.swing.GroupLayout(namaPanel);
        namaPanel.setLayout(namaPanelLayout);
        namaPanelLayout.setHorizontalGroup(
            namaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        namaPanelLayout.setVerticalGroup(
            namaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        descPanel.setBackground(new java.awt.Color(40, 41, 61));
        descPanel.setForeground(new java.awt.Color(40, 41, 61));

        desc.setBackground(new java.awt.Color(40, 41, 61));
        desc.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        desc.setForeground(new java.awt.Color(62, 231, 188));
        desc.setText("Ayam Goreng Enak");

        javax.swing.GroupLayout descPanelLayout = new javax.swing.GroupLayout(descPanel);
        descPanel.setLayout(descPanelLayout);
        descPanelLayout.setHorizontalGroup(
            descPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        descPanelLayout.setVerticalGroup(
            descPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gudangPanelLayout = new javax.swing.GroupLayout(gudangPanel);
        gudangPanel.setLayout(gudangPanelLayout);
        gudangPanelLayout.setHorizontalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gudangPanelLayout.createSequentialGroup()
                        .addComponent(namaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hargaB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gudangPanelLayout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(hargaJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106))
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(logoGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(comboBoxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        gudangPanelLayout.setVerticalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addComponent(logoGudang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gudangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gudangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxCariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCariBarangActionPerformed
        
    }//GEN-LAST:event_comboBoxCariBarangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBoxJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxJenisActionPerformed

    }//GEN-LAST:event_comboBoxJenisActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxCariBarang;
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxJenis;
    private javax.swing.JPanel comboBoxPanel;
    private javax.swing.JLabel desc;
    private javax.swing.JPanel descPanel;
    private javax.swing.JLabel gambarBarang;
    private javax.swing.JPanel gudangPanel;
    private javax.swing.JPanel hargaB1;
    private javax.swing.JPanel hargaJ;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoGudang;
    private javax.swing.JLabel namaBarang;
    private javax.swing.JPanel namaPanel;
    private javax.swing.JLabel polygonCariMember;
    private javax.swing.JPanel statusPanel;
    // End of variables declaration//GEN-END:variables
}
