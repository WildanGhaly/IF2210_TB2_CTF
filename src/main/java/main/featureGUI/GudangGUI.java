/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.bind.JAXBException;

import datastore.DataStoreMechanism;
import lombok.Getter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import main.featureGUI.Util.AddBarang;
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
    private final Image descBoxImg = RequestImage.requestImage("gudang/descBox.png");
    private final Image boxAllImg = RequestImage.requestImage("gudang/boxAllGudang.png");
    private String pathFormat = ".xml";
    private String pathItem = "src/main/java/datastore/database/Barang/barang" + pathFormat;
    private String[][] barang;
    private int stock = 0;

    private GudangGUI() {
        try {
            barang = DataStoreMechanism.getBarangAsString(pathItem);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        comboBoxCariBarang = new main.featureGUI.Util.customcombobox.Combobox();
        polygonCariMember = new javax.swing.JLabel();
        gambarBarang = new javax.swing.JLabel();
        stockPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxAllImg, 0, 0, null);
            }
        };
        stockLabel = new javax.swing.JLabel();
        kuranginStock = new javax.swing.JButton();
        tambahStock = new javax.swing.JButton();
        statusPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxAllImg, 0, 0, null);
            }
        };
        comboBoxJenis = new main.featureGUI.Util.customcombobox.Combobox();
        jLabel2 = new javax.swing.JLabel();
        hargaJ = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxAllImg, 0, 0, null);
            }
        };
        jLabel3 = new javax.swing.JLabel();
        gantiHargaJual = new javax.swing.JTextField();
        hargaB1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxAllImg, 0, 0, null);
            }
        };
        jLabel5 = new javax.swing.JLabel();
        gantiHargaBeli = new javax.swing.JTextField();
        descPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(descBoxImg, 0, 0, null);
            }
        };
        descBarang = new javax.swing.JTextArea();
        gambarBarangImg = new javax.swing.JLabel();
        namaBarang = new javax.swing.JLabel();
        addBarang = new javax.swing.JButton();
        saveBarang = new javax.swing.JButton();
        deleteBarang = new javax.swing.JButton();

        gudangPanel.setBackground(new java.awt.Color(40, 41, 61));
        gudangPanel.setForeground(new java.awt.Color(72, 84, 254));

        logoGudang.setBackground(new java.awt.Color(40, 41, 61));
        logoGudang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoGudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gudang/logoGudang.png"))); // NOI18N

        comboBoxPanel.setOpaque(false);
        comboBoxPanel.setPreferredSize(new java.awt.Dimension(766, 80));

        comboBoxCariBarang.setBackground(new java.awt.Color(0,0,0,0));
        comboBoxCariBarang.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxCariBarang.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxCariBarang.setOpaque(false);
        comboBoxCariBarang.setPreferredSize(new java.awt.Dimension(708, 44));
        comboBoxCariBarang.setModel(new DefaultComboBoxModel<>());
        for (int i = 0; i < barang.length; i++) {
            comboBoxCariBarang.addItem(barang[i][1]);
        }
        comboBoxCariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCariBarangActionPerformed(evt);
            }
        });
        comboBoxCariBarang.setSelectedIndex(-1);
        comboBoxCariBarang.setLabelText("Cari barang...");

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

        stockPanel.setBackground(new java.awt.Color(40, 41, 61));
        stockPanel.setForeground(new java.awt.Color(40, 41, 61));
        stockPanel.setPreferredSize(new java.awt.Dimension(430, 77));

        stockLabel.setBackground(new java.awt.Color(40, 41, 61));
        stockLabel.setFont(new java.awt.Font("Inter" , 1, 20));
        stockLabel.setForeground(new java.awt.Color(217, 217, 217));
        stockLabel.setText("Stock        :     ");
        kuranginStock.setBackground(new java.awt.Color(40, 41, 61));
        kuranginStock.setForeground(new java.awt.Color(40, 41, 61));
        kuranginStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gudang/min.png"))); // NOI18N
        kuranginStock.setBorder(null);
        kuranginStock.setBorderPainted(false);
        kuranginStock.setContentAreaFilled(false);
        kuranginStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuranginStockActionPerformed(evt);
            }
        });

        tambahStock.setBackground(new java.awt.Color(40, 41, 61));
        tambahStock.setForeground(new java.awt.Color(40, 41, 61));
        tambahStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gudang/plus.png"))); // NOI18N
        tambahStock.setToolTipText("");
        tambahStock.setBorder(null);
        tambahStock.setBorderPainted(false);
        tambahStock.setContentAreaFilled(false);
        tambahStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stockPanelLayout = new javax.swing.GroupLayout(stockPanel);
        stockPanel.setLayout(stockPanelLayout);
        stockPanelLayout.setHorizontalGroup(
            stockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(stockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kuranginStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tambahStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stockPanelLayout.setVerticalGroup(
            stockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(stockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stockLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kuranginStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        statusPanel.setOpaque(false);
        statusPanel.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxJenis.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxJenis.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxJenis.setFont(new java.awt.Font("Inter", 1, 20));
        comboBoxJenis.setOpaque(false);
        comboBoxJenis.setModel(new DefaultComboBoxModel<>());
        comboBoxJenis.addItem(barang[0][5]);
        for (int i = 1; i < barang.length; i++) {
            for (int j = 0; j < comboBoxJenis.getItemCount(); j++) {
                if (!comboBoxJenis.getItemAt(j).equals(barang[i][5])){
                    comboBoxJenis.addItem(barang[i][5]);
                }
            }
        }
        comboBoxJenis.setLabelText("Jenis");
        comboBoxJenis.setSelectedIndex(-1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/Polygon1.png"))); // NOI18N

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(comboBoxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxJenis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        hargaJ.setBackground(new java.awt.Color(40, 41, 61));
        hargaJ.setForeground(new java.awt.Color(40, 41, 61));

        jLabel3.setBackground(new java.awt.Color(40, 41, 61));
        jLabel3.setFont(new java.awt.Font("Inter", 1, 20));
        jLabel3.setForeground(new java.awt.Color(217, 217, 217));
        jLabel3.setText("Harga jual :");

        gantiHargaJual.setFont(new java.awt.Font("Inter", 1, 20));
        gantiHargaJual.setForeground(new Color(217,217,217));
        gantiHargaJual.setBorder(null);
        gantiHargaJual.setOpaque(false);
        gantiHargaJual.setBackground(new Color(0, 0, 0, 0));
        
        gantiHargaJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gantiHargaJualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hargaJLayout = new javax.swing.GroupLayout(hargaJ);
        hargaJ.setLayout(hargaJLayout);
        hargaJLayout.setHorizontalGroup(
            hargaJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hargaJLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gantiHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hargaJLayout.setVerticalGroup(
            hargaJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hargaJLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(hargaJLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gantiHargaJual, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        hargaB1.setBackground(new java.awt.Color(40, 41, 61));
        hargaB1.setForeground(new java.awt.Color(40, 41, 61));

        jLabel5.setBackground(new java.awt.Color(40, 41, 61));
        jLabel5.setFont(new java.awt.Font("Inter", 1, 20));
        jLabel5.setForeground(new java.awt.Color(217, 217, 217));
        jLabel5.setText("Harga beli :");

        gantiHargaBeli.setFont(new java.awt.Font("Inter", 1, 20));
        gantiHargaBeli.setForeground(new Color(217,217,217));
        gantiHargaBeli.setBorder(null);
        gantiHargaBeli.setOpaque(false);
        gantiHargaBeli.setBackground(new Color(0, 0, 0, 0));
        
        gantiHargaBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gantiHargaBeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hargaB1Layout = new javax.swing.GroupLayout(hargaB1);
        hargaB1.setLayout(hargaB1Layout);
        hargaB1Layout.setHorizontalGroup(
            hargaB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hargaB1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gantiHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hargaB1Layout.setVerticalGroup(
            hargaB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hargaB1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(hargaB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gantiHargaBeli, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        descPanel.setBackground(new java.awt.Color(40, 41, 61));
        descPanel.setForeground(new java.awt.Color(40, 41, 61));
        descPanel.setPreferredSize(new java.awt.Dimension(552, 153));

        descBarang.setBackground(new java.awt.Color(0, 0, 0, 0)
        );
        descBarang.setColumns(20);
        descBarang.setFont(new java.awt.Font("Inter", java.awt.Font.ITALIC, 20));
        descBarang.setForeground(new java.awt.Color(62, 231, 188));
        descBarang.setRows(5);
        
        descBarang.setBorder(null);
        descBarang.setOpaque(false);

        javax.swing.GroupLayout descPanelLayout = new javax.swing.GroupLayout(descPanel);
        descPanel.setLayout(descPanelLayout);
        descPanelLayout.setHorizontalGroup(
            descPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, descPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(descBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        descPanelLayout.setVerticalGroup(
            descPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, descPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(descBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gambarBarangImg.setBackground(new java.awt.Color(62, 231, 188));
        gambarBarangImg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gambarBarangImg.setOpaque(true);

        namaBarang.setBackground(new java.awt.Color(40, 41, 61));
        namaBarang.setFont(new java.awt.Font("Inter", 1, 20));
        namaBarang.setForeground(new java.awt.Color(62, 231, 188));
        

        addBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/addButton.png"))); // NOI18N
        addBarang.setBorder(null);
        addBarang.setBorderPainted(false);
        addBarang.setContentAreaFilled(false);
        addBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBarang.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/addButtonClicked.png"))); // NOI18N
        addBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBarangActionPerformed(evt);
            }
        });

        saveBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/buttonSave.png"))); // NOI18N
        saveBarang.setBorder(null);
        saveBarang.setBorderPainted(false);
        saveBarang.setContentAreaFilled(false);
        saveBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBarang.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/buttonSaveClicked.png"))); // NOI18N
        saveBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBarangActionPerformed(evt);
            }
        });

        deleteBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gudang/del.png"))); // NOI18N
        deleteBarang.setBorder(null);
        deleteBarang.setBorderPainted(false);
        deleteBarang.setContentAreaFilled(false);
        deleteBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gudangPanelLayout = new javax.swing.GroupLayout(gudangPanel);
        gudangPanel.setLayout(gudangPanelLayout);
        gudangPanelLayout.setHorizontalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(comboBoxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(logoGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gudangPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gudangPanelLayout.createSequentialGroup()
                        .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gudangPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(namaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(gambarBarangImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hargaB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stockPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(hargaJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(statusPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
                        .addGap(102, 102, 102))
                    .addGroup(gudangPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(descPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saveBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBarang)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        gudangPanelLayout.setVerticalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addComponent(logoGudang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gudangPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(stockPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargaJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(hargaB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gudangPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(gambarBarangImg, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(gudangPanelLayout.createSequentialGroup()
                        .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBarang)
                            .addComponent(deleteBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBarang))
                    .addComponent(descPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gudangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gudangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
    }// </editor-fold>//GEN-END:initComponents
    
    private void comboBoxCariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCariBarangActionPerformed
        if (comboBoxCariBarang.getSelectedIndex()!=-1){
            stock = Integer.valueOf(barang[comboBoxCariBarang.getSelectedIndex()][2]);
            gambarBarangImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datastore/database/image/" + barang[comboBoxCariBarang.getSelectedIndex()][7])));
            namaBarang.setText(barang[comboBoxCariBarang.getSelectedIndex()][1]);
            stockLabel.setText("Stock        :     " + stock);
            gantiHargaJual.setText(barang[comboBoxCariBarang.getSelectedIndex()][3]);
            gantiHargaBeli.setText(barang[comboBoxCariBarang.getSelectedIndex()][4]);
            comboBoxJenis.setSelectedItem(barang[comboBoxCariBarang.getSelectedIndex()][5]);
            comboBoxJenis.setLabelText("");
            descBarang.setText(barang[comboBoxCariBarang.getSelectedIndex()][6]);
            System.out.println("./datastore/database/image/" + barang[comboBoxCariBarang.getSelectedIndex()][7]);
            gambarBarangImg.setOpaque(false);
            gambarBarangImg.setBorder(null);
        }
    }//GEN-LAST:event_comboBoxCariBarangActionPerformed

    private void kuranginStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuranginStockActionPerformed
        if (stock > 0){
            stock--;
            stockLabel.setText("Stock        :     " + stock);
        }
    }//GEN-LAST:event_kuranginStockActionPerformed

    private void tambahStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahStockActionPerformed
        stock++;
        stockLabel.setText("Stock        :     " + stock);
    }//GEN-LAST:event_tambahStockActionPerformed

    private void addBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBarangActionPerformed
        AddBarang addBarang = new AddBarang();
        addBarang.setVisible(true);
    }//GEN-LAST:event_addBarangActionPerformed

    private void deleteBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBarangActionPerformed
        if (comboBoxCariBarang.getSelectedIndex()!=-1){
            try {
                DataStoreMechanism.deleteBarang(pathItem, barang[comboBoxCariBarang.getSelectedIndex()][1]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        namaBarang.setText("Nama Barang");
        stockLabel.setText("Stock        :     ");
        gantiHargaJual.setText("");
        gantiHargaBeli.setText("");
        comboBoxJenis.setSelectedIndex(-1);
        comboBoxJenis.setLabelText("Jenis");
        descBarang.setText("Deskripsi barang");
        gambarBarangImg.setIcon(null);
    }//GEN-LAST:event_deleteBarangActionPerformed

    private void saveBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBarangActionPerformed
        
        JOptionPane.showMessageDialog(null, "Barang " + barang[comboBoxCariBarang.getSelectedIndex()][1] + " berhasil diupdate");
        
        try {
            DataStoreMechanism.updateBarang(pathItem, 
            barang[comboBoxCariBarang.getSelectedIndex()][1],
            String.valueOf(stock),
            gantiHargaJual.getText(),
            gantiHargaBeli.getText(),
            comboBoxJenis.getSelectedItem().toString(),
            descBarang.getText(), 
            barang[comboBoxCariBarang.getSelectedIndex()][7]
            );
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        namaBarang.setText("Nama Barang");
        stockLabel.setText("Stock        :     ");
        gantiHargaJual.setText("");
        gantiHargaBeli.setText("");
        comboBoxJenis.setSelectedIndex(-1);
        comboBoxJenis.setLabelText("Jenis");
        descBarang.setText("Deskripsi barang");
        gambarBarangImg.setIcon(null);
    }//GEN-LAST:event_saveBarangActionPerformed

    private void gantiHargaJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gantiHargaJualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gantiHargaJualActionPerformed

    private void gantiHargaBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gantiHargaBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gantiHargaBeliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBarang;
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxCariBarang;
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxJenis;
    private javax.swing.JPanel comboBoxPanel;
    private javax.swing.JButton deleteBarang;
    private javax.swing.JPanel descPanel;
    private javax.swing.JLabel gambarBarang;
    private javax.swing.JTextField gantiHargaBeli;
    private javax.swing.JTextField gantiHargaJual;
    private javax.swing.JPanel gudangPanel;
    private javax.swing.JPanel hargaB1;
    private javax.swing.JPanel hargaJ;
    private javax.swing.JLabel gambarBarangImg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextArea descBarang;
    private javax.swing.JButton kuranginStock;
    private javax.swing.JLabel logoGudang;
    private javax.swing.JLabel namaBarang;
    private javax.swing.JLabel polygonCariMember;
    private javax.swing.JButton saveBarang;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JPanel stockPanel;
    private javax.swing.JButton tambahStock;
    // End of variables declaration//GEN-END:variables

    /**
 *
 * @author user
 */
@Getter
public class AddBarang extends javax.swing.JFrame {

    /**
     * Creates new form AddMember
     */
    public AddBarang() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jenis = new javax.swing.JTextField();
        hargabeli = new javax.swing.JTextField();
        hargajual = new javax.swing.JTextField();
        deskripsi = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Add Gambar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama          :");

        jLabel2.setText("Jenis            :");

        jLabel3.setText("Harga Beli  :");

        jLabel4.setText("Harga Jual  :");

        jLabel5.setText("Deskripsi :");

        jLabel6.setText("Stock          :");

        jButton2.setText("ADD");
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
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stock)
                                    .addComponent(deskripsi)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 94, Short.MAX_VALUE)
                        .addComponent(deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hargabeli)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hargajual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DataStoreMechanism.addBarang(pathItem, this.nama.getText(), stock.getText(), jenis.getText(), hargajual.getText(), hargabeli.getText(), deskripsi.getText(), null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private @Getter javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private @Getter javax.swing.JTextField nama;
    private @Getter javax.swing.JTextField jenis;
    private @Getter javax.swing.JTextField hargabeli;
    private @Getter javax.swing.JTextField hargajual;
    private @Getter javax.swing.JTextField deskripsi;
    private @Getter javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables
}
}
