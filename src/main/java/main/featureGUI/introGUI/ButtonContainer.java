/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI.introGUI;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

import main.featureGUI.Util.RequestImage;
/**
 *
 * @author user
 */


public class ButtonContainer extends javax.swing.JPanel {

    private final Image buttonContainerBg = RequestImage.requestImage("allButtonPanel.png");
    /**
     * Creates new form ButtonContainer
     */
    private final ArrayList<JButton> buttonList;
    private EnumPanels panels = EnumPanels.HALAMANUTAMA;

    public ButtonContainer() {
        initComponents();
        buttonList = new ArrayList<>();
        buttonList.add(buttonHalamanUtama);
        buttonList.add(buttonPendaftaranMember);
        buttonList.add(buttonPembayaran);
        buttonList.add(buttonUpdateMember);
        buttonList.add(buttonHistoriTransaksi);
        buttonList.add(buttonGudang);
        buttonList.add(buttonSetting);
        buttonList.add(buttonLaporanPenjualan);
    }

    public EnumPanels getPanels(){
        return this.panels;
    }

    public void selectedButton (JButton button){
        for (JButton buttons : buttonList) {
            if (buttons.equals(button)){
                buttons.setSelected(true);
            } else {
                buttons.setSelected(false);
            }
        }
    }
    
    public void setForm(JComponent panel, JComponent mainPanel){
        mainPanel.removeAll();
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonContainer = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 65, 65);
                g2.drawImage(buttonContainerBg, 0, 0, null);
                super.paintComponent(g);
            }
        };
        buttonHalamanUtama = new javax.swing.JButton();
        buttonPendaftaranMember = new javax.swing.JButton();
        buttonPembayaran = new javax.swing.JButton();
        buttonUpdateMember = new javax.swing.JButton();
        buttonHistoriTransaksi = new javax.swing.JButton();
        buttonGudang = new javax.swing.JButton();
        buttonSetting = new javax.swing.JButton();
        buttonLaporanPenjualan = new javax.swing.JButton();

        setOpaque(false);

        buttonContainer.setBackground(new java.awt.Color(255, 255, 255));
        buttonContainer.setForeground(new java.awt.Color(255, 255, 255));
        buttonContainer.setOpaque(false);
        buttonContainer.setPreferredSize(new java.awt.Dimension(312, 360));

        buttonHalamanUtama.setBackground(new java.awt.Color(40, 41, 61));
        buttonHalamanUtama.setForeground(new java.awt.Color(217, 217, 217));
        buttonHalamanUtama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonHalamanUtama.png"))); // NOI18N
        buttonHalamanUtama.setToolTipText("");
        buttonHalamanUtama.setBorder(null);
        buttonHalamanUtama.setBorderPainted(false);
        buttonHalamanUtama.setContentAreaFilled(false);
        buttonHalamanUtama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHalamanUtama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonHalamanUtama.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonHalamanUtama.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonHalamanUtama.setPreferredSize(new java.awt.Dimension(169, 27));
        buttonHalamanUtama.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Halaman Utama.png"))); // NOI18N
        buttonHalamanUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHalamanUtamaActionPerformed(evt);
            }
        });

        buttonPendaftaranMember.setBackground(new java.awt.Color(40, 41, 61));
        buttonPendaftaranMember.setForeground(new java.awt.Color(217, 217, 217));
        buttonPendaftaranMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonPendaftaranmember.png"))); // NOI18N
        buttonPendaftaranMember.setToolTipText("");
        buttonPendaftaranMember.setBorder(null);
        buttonPendaftaranMember.setBorderPainted(false);
        buttonPendaftaranMember.setContentAreaFilled(false);
        buttonPendaftaranMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPendaftaranMember.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonPendaftaranMember.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonPendaftaranMember.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonPendaftaranMember.setPreferredSize(new java.awt.Dimension(229, 37));
        buttonPendaftaranMember.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Pendaftaran member.png"))); // NOI18N
        buttonPendaftaranMember.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Pendaftaran Member.png"))); // NOI18N
        buttonPendaftaranMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPendaftaranMemberActionPerformed(evt);
            }
        });

        buttonPembayaran.setBackground(new java.awt.Color(40, 41, 61));
        buttonPembayaran.setForeground(new java.awt.Color(217, 217, 217));
        buttonPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonPembayaran.png"))); // NOI18N
        buttonPembayaran.setToolTipText("");
        buttonPembayaran.setBorder(null);
        buttonPembayaran.setBorderPainted(false);
        buttonPembayaran.setContentAreaFilled(false);
        buttonPembayaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPembayaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonPembayaran.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonPembayaran.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonPembayaran.setPreferredSize(new java.awt.Dimension(153, 47));
        buttonPembayaran.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Pembayaran.png"))); // NOI18N
        buttonPembayaran.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Pembayaran.png"))); // NOI18N
        buttonPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPembayaranActionPerformed(evt);
            }
        });

        buttonUpdateMember.setBackground(new java.awt.Color(40, 41, 61));
        buttonUpdateMember.setForeground(new java.awt.Color(217, 217, 217));
        buttonUpdateMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonUpdatemember.png"))); // NOI18N
        buttonUpdateMember.setToolTipText("");
        buttonUpdateMember.setBorder(null);
        buttonUpdateMember.setBorderPainted(false);
        buttonUpdateMember.setContentAreaFilled(false);
        buttonUpdateMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonUpdateMember.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonUpdateMember.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonUpdateMember.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonUpdateMember.setPreferredSize(new java.awt.Dimension(169, 37));
        buttonUpdateMember.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Update member.png"))); // NOI18N
        buttonUpdateMember.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Update Member.png"))); // NOI18N
        buttonUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateMemberActionPerformed(evt);
            }
        });

        buttonHistoriTransaksi.setBackground(new java.awt.Color(40, 41, 61));
        buttonHistoriTransaksi.setForeground(new java.awt.Color(217, 217, 217));
        buttonHistoriTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonHistoritransaksi.png"))); // NOI18N
        buttonHistoriTransaksi.setToolTipText("");
        buttonHistoriTransaksi.setBorder(null);
        buttonHistoriTransaksi.setBorderPainted(false);
        buttonHistoriTransaksi.setContentAreaFilled(false);
        buttonHistoriTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHistoriTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonHistoriTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonHistoriTransaksi.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonHistoriTransaksi.setName(""); // NOI18N
        buttonHistoriTransaksi.setPreferredSize(new java.awt.Dimension(194, 47));
        buttonHistoriTransaksi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Histori transaksi.png"))); // NOI18N
        buttonHistoriTransaksi.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Histori Transaksi.png"))); // NOI18N
        buttonHistoriTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHistoriTransaksiActionPerformed(evt);
            }
        });

        buttonGudang.setBackground(new java.awt.Color(40, 41, 61));
        buttonGudang.setForeground(new java.awt.Color(217, 217, 217));
        buttonGudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonGudang.png"))); // NOI18N
        buttonGudang.setToolTipText("");
        buttonGudang.setBorder(null);
        buttonGudang.setBorderPainted(false);
        buttonGudang.setContentAreaFilled(false);
        buttonGudang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGudang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonGudang.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonGudang.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonGudang.setPreferredSize(new java.awt.Dimension(88, 37));
        buttonGudang.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Gudang.png"))); // NOI18N
        buttonGudang.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Gudang.png"))); // NOI18N
        buttonGudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGudangActionPerformed(evt);
            }
        });

        buttonSetting.setBackground(new java.awt.Color(40, 41, 61));
        buttonSetting.setForeground(new java.awt.Color(217, 217, 217));
        buttonSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonPengaturan.png"))); // NOI18N
        buttonSetting.setToolTipText("");
        buttonSetting.setBorder(null);
        buttonSetting.setBorderPainted(false);
        buttonSetting.setContentAreaFilled(false);
        buttonSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSetting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonSetting.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonSetting.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonSetting.setPreferredSize(new java.awt.Dimension(144, 47));
        buttonSetting.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Pengaturan.png"))); // NOI18N
        buttonSetting.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Pengaturan.png"))); // NOI18N
        buttonSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSettingActionPerformed(evt);
            }
        });

        buttonLaporanPenjualan.setBackground(new java.awt.Color(40, 41, 61));
        buttonLaporanPenjualan.setForeground(new java.awt.Color(217, 217, 217));
        buttonLaporanPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonLaporanpenjualan.png"))); // NOI18N
        buttonLaporanPenjualan.setToolTipText("");
        buttonLaporanPenjualan.setBorder(null);
        buttonLaporanPenjualan.setBorderPainted(false);
        buttonLaporanPenjualan.setContentAreaFilled(false);
        buttonLaporanPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLaporanPenjualan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonLaporanPenjualan.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonLaporanPenjualan.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonLaporanPenjualan.setMinimumSize(new java.awt.Dimension(216, 47));
        buttonLaporanPenjualan.setPreferredSize(new java.awt.Dimension(216, 47));
        buttonLaporanPenjualan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Laporan penjualan.png"))); // NOI18N
        buttonLaporanPenjualan.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Laporan Penjualan.png"))); // NOI18N
        buttonLaporanPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaporanPenjualanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonContainerLayout = new javax.swing.GroupLayout(buttonContainer);
        buttonContainer.setLayout(buttonContainerLayout);
        buttonContainerLayout.setHorizontalGroup(
            buttonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonContainerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(buttonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonHalamanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPendaftaranMember, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHistoriTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLaporanPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        buttonContainerLayout.setVerticalGroup(
            buttonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonContainerLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(buttonHalamanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPendaftaranMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(buttonUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonHistoriTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonLaporanPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHalamanUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHalamanUtamaActionPerformed
        selectedButton(buttonHalamanUtama);
        panels = EnumPanels.HALAMANUTAMA;
    }//GEN-LAST:event_buttonHalamanUtamaActionPerformed

    private void buttonPendaftaranMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPendaftaranMemberActionPerformed
        selectedButton(buttonPendaftaranMember);
        panels = EnumPanels.PENDAFTARANMEMBER;
    }//GEN-LAST:event_buttonPendaftaranMemberActionPerformed

    private void buttonPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPembayaranActionPerformed
        selectedButton(buttonPembayaran);
        panels = EnumPanels.PEMBAYARAN;
    }//GEN-LAST:event_buttonPembayaranActionPerformed

    private void buttonUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateMemberActionPerformed
        selectedButton(buttonUpdateMember);
        panels = EnumPanels.UPDATEMEMBER;
    }//GEN-LAST:event_buttonUpdateMemberActionPerformed

    private void buttonHistoriTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHistoriTransaksiActionPerformed
        selectedButton(buttonHistoriTransaksi);
        panels = EnumPanels.HISTORITRANSAKSI;
    }//GEN-LAST:event_buttonHistoriTransaksiActionPerformed

    private void buttonGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGudangActionPerformed
        selectedButton(buttonGudang);
        panels = EnumPanels.GUDANG;
    }//GEN-LAST:event_buttonGudangActionPerformed

    private void buttonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSettingActionPerformed
        selectedButton(buttonSetting);
        panels = EnumPanels.SETTING;
    }//GEN-LAST:event_buttonSettingActionPerformed

    private void buttonLaporanPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanPenjualanActionPerformed
        selectedButton(buttonLaporanPenjualan);
        panels = EnumPanels.LAPORANPENJUALAN;
    }//GEN-LAST:event_buttonLaporanPenjualanActionPerformed

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        buttonContainer.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        buttonContainer.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonContainer;
    private javax.swing.JButton buttonGudang;
    private javax.swing.JButton buttonHalamanUtama;
    private javax.swing.JButton buttonHistoriTransaksi;
    private javax.swing.JButton buttonLaporanPenjualan;
    private javax.swing.JButton buttonPembayaran;
    private javax.swing.JButton buttonPendaftaranMember;
    private javax.swing.JButton buttonSetting;
    private javax.swing.JButton buttonUpdateMember;
    // End of variables declaration//GEN-END:variables
}