/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import javax.swing.border.Border;
import javax.xml.bind.JAXBException;
import datastore.DataStoreMechanism;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;
import java.awt.Font;
import javax.swing.JPanel;
import main.featureGUI.Util.RequestImage;
// import javax.xml.bind.JAXBException;
// import datastore.DataStoreMechanism;

/**
 *
 * @author user
 */
public class LaporanPenjualanGUI extends javax.swing.JPanel {

    /**
     * Creates new form LaporanPenjualanGUI
     */
    private String historyPath = "src/main/java/datastore/database/History/history.xml";

    private static final LaporanPenjualanGUI LAPORAN_PENJUALAN_GUI = new LaporanPenjualanGUI();

    private LaporanPenjualanGUI() {
        initComponents();
    }

    public static LaporanPenjualanGUI getInstance(){
        return LaporanPenjualanGUI.LAPORAN_PENJUALAN_GUI;
    }

    private final Image statusBoxPanelImg = RequestImage.requestImage("updatemember/boxStatus.png");


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laporanPanel = new javax.swing.JPanel();
        logoLaporan = new javax.swing.JLabel();
        statusPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(statusBoxPanelImg, 0, 0, null);
            }
        };
        comboBoxBulan = new main.featureGUI.Util.customcombobox.Combobox<>();
        statusPanel4 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(statusBoxPanelImg, 0, 0, null);
            }
        };
        comboBoxTahun = new main.featureGUI.Util.customcombobox.Combobox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setViewportBorder(new Border() {

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
        jTable1 = new javax.swing.JTable();

        laporanPanel.setBackground(new java.awt.Color(40, 41, 61));

        logoLaporan.setBackground(new java.awt.Color(40, 41, 61));
        logoLaporan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laporanpenjualan/logopenjualan.png"))); // NOI18N

        statusPanel.setOpaque(false);
        statusPanel.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxBulan.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxBulan.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        comboBoxBulan.setSelectedIndex(-1);
        comboBoxBulan.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxBulan.setLabelText("Bulan");
        comboBoxBulan.setOpaque(false);
        comboBoxBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBulanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(comboBoxBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        statusPanel4.setOpaque(false);
        statusPanel4.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxTahun.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxTahun.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025" }));
        comboBoxTahun.setSelectedIndex(-1);
        comboBoxTahun.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxTahun.setLabelText("Tahun");
        comboBoxTahun.setOpaque(false);
        comboBoxTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTahunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanel4Layout = new javax.swing.GroupLayout(statusPanel4);
        statusPanel4.setLayout(statusPanel4Layout);
        statusPanel4Layout.setHorizontalGroup(
            statusPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(comboBoxTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        statusPanel4Layout.setVerticalGroup(
            statusPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(40, 41, 61));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(72, 84, 254));
        jTable1.setGridColor(new java.awt.Color(72, 84, 254));
        jTable1.setRowHeight(50);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setSelectionBackground(new java.awt.Color(40, 41, 61));
        jTable1.setSelectionForeground(new java.awt.Color(40, 41, 61));
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTable1.getTableHeader().setBackground(new java.awt.Color(40, 41, 61));
        jTable1.getTableHeader().setForeground(new java.awt.Color(72, 84, 254));
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout laporanPanelLayout = new javax.swing.GroupLayout(laporanPanel);
        laporanPanel.setLayout(laporanPanelLayout);
        laporanPanelLayout.setHorizontalGroup(
            laporanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporanPanelLayout.createSequentialGroup()
                .addGroup(laporanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(laporanPanelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(laporanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(laporanPanelLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(logoLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(laporanPanelLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(statusPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        laporanPanelLayout.setVerticalGroup(
            laporanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporanPanelLayout.createSequentialGroup()
                .addComponent(logoLaporan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(laporanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laporanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laporanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBulanActionPerformed
        try {
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                DataStoreMechanism.getTransactionReport(historyPath, String.valueOf(comboBoxBulan.getSelectedItem()), String.valueOf(comboBoxTahun.getSelectedItem()))
                ,
                new String [] {
                    "Nama Barang", "Tanggal", "Kuantitas", "Harga", "Total Harga"
                }
            ) {
                Class<?>[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboBoxBulanActionPerformed

    private void comboBoxTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTahunActionPerformed
        try {
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                DataStoreMechanism.getTransactionReport(historyPath, String.valueOf(comboBoxBulan.getSelectedItem()), String.valueOf(comboBoxTahun.getSelectedItem()))
                ,
                new String [] {
                    "Nama Barang", "Tanggal", "Kuantitas", "Harga", "Total Harga"
                }
            ) {
                Class<?>[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_comboBoxTahunActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxBulan;
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxTahun;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel laporanPanel;
    private javax.swing.JLabel logoLaporan;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JPanel statusPanel4;
    // End of variables declaration//GEN-END:variables
}
