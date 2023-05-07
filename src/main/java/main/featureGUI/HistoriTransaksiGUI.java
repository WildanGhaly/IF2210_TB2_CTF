/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import javax.swing.border.Border;
import javax.xml.bind.JAXBException;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;
import javax.swing.JPanel;
import main.featureGUI.Util.RequestImage;
import datastore.DataStoreMechanism;

/**
 *
 * @author user
 */
public class HistoriTransaksiGUI extends javax.swing.JPanel {

    /**
     * Creates new form HistoriTransaksiGUI
     */
    private String historyPath  = "src/main/java/datastore/database/History/history.json";
    private String memberPath = "src/main/java/datastore/database/Member/member.json";
    private String customerPath = "src/main/java/datastore/database/Customer/customer.json";
    private String vipPath = "src/main/java/datastore/database/VIP/vip.json";

    private final Image comboBoxUpdateImg = RequestImage.requestImage("updatemember/comboBoxUpdateMember.png");
    
    public HistoriTransaksiGUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historiPanel = new javax.swing.JPanel();
        logoPendaftaran = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        comboBoxPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(comboBoxUpdateImg, 0, 0, null);
            }
        };
        comboBoxCariMember = new main.featureGUI.Util.customcombobox.Combobox<>();
        polygonCariMember = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(904, 720));

        historiPanel.setBackground(new java.awt.Color(40, 41, 61));
        historiPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        logoPendaftaran.setBackground(new java.awt.Color(40, 41, 61));
        logoPendaftaran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historiTransaksi/pageHistori.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N

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
        // change header background
        jTable1.getTableHeader().setBackground(new java.awt.Color(40, 41, 61));
        jTable1.getTableHeader().setForeground(new java.awt.Color(72, 84, 254));
        jTable1.getTableHeader().setBorder(null);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        comboBoxPanel.setOpaque(false);
        comboBoxPanel.setPreferredSize(new java.awt.Dimension(766, 80));

        comboBoxCariMember.setBackground(new java.awt.Color(0,0,0,0));
        comboBoxCariMember.setForeground(new java.awt.Color(217, 217, 217));
        try {
            comboBoxCariMember.setModel(new javax.swing.DefaultComboBoxModel<>(DataStoreMechanism.readName(vipPath)));
            for (String i : DataStoreMechanism.readName(memberPath)) {
                comboBoxCariMember.addItem(i);
            }
            for (String i : DataStoreMechanism.readName(customerPath)) {
                comboBoxCariMember.addItem(i);
            }
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
        comboBoxCariMember.setSelectedIndex(-1);
        comboBoxCariMember.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxCariMember.setLabelText("Pilih customer");
        comboBoxCariMember.setOpaque(false);
        comboBoxCariMember.setPreferredSize(new java.awt.Dimension(708, 44));
        comboBoxCariMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCariMemberActionPerformed(evt);
            }
        });

        polygonCariMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/updatemember/Polygon1.png"))); // NOI18N

        javax.swing.GroupLayout comboBoxPanelLayout = new javax.swing.GroupLayout(comboBoxPanel);
        comboBoxPanel.setLayout(comboBoxPanelLayout);
        comboBoxPanelLayout.setHorizontalGroup(
            comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboBoxPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(comboBoxCariMember, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(polygonCariMember)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        comboBoxPanelLayout.setVerticalGroup(
            comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboBoxPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(comboBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(polygonCariMember)
                    .addComponent(comboBoxCariMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout historiPanelLayout = new javax.swing.GroupLayout(historiPanel);
        historiPanel.setLayout(historiPanelLayout);
        historiPanelLayout.setHorizontalGroup(
            historiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historiPanelLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(historiPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(comboBoxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(historiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(historiPanelLayout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(logoPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(184, Short.MAX_VALUE)))
        );
        historiPanelLayout.setVerticalGroup(
            historiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historiPanelLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(comboBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(historiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historiPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(202, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historiPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
            .addGroup(historiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(historiPanelLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(logoPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(633, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(historiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(historiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxCariMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCariMemberActionPerformed
                try {
					jTable1.setModel(new javax.swing.table.DefaultTableModel(
					    DataStoreMechanism.getHistoryTransaction(historyPath, String.valueOf(comboBoxCariMember.getSelectedItem()))
					,
					    new String [] {
					        "Nama Barang", "Tanggal", "Kuantitas", "Harga", "Total Harga"
					    }
					) {
					    Class<?>[] types = new Class<?>[] {
					        java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
					    };
					    boolean[] canEdit = new boolean [] {
					        false, false, false, false, false
					    };

					    public Class<?> getColumnClass(int columnIndex) {
					        return types [columnIndex];
					    }

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
    }//GEN-LAST:event_comboBoxCariMemberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxCariMember;
    private javax.swing.JPanel comboBoxPanel;
    private javax.swing.JPanel historiPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoPendaftaran;
    private javax.swing.JLabel polygonCariMember;
    // End of variables declaration//GEN-END:variables
}