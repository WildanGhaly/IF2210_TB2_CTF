/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import main.featureGUI.Util.RequestImage;
import main.featureGUI.GudangGUI;
import main.featureGUI.HalamanUtamaGUI;
import main.featureGUI.HistoriTransaksiGUI;
import main.featureGUI.LaporanPenjualanGUI;
import main.featureGUI.PembayaranGUI;
import main.featureGUI.PendaftaranMemberGUI;
import main.featureGUI.PengaturanGUI;
import main.featureGUI.UpdateMemberGUI;
/**
 *
 * @author ChizuruTheFinest
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    private final Image leftBarBg = RequestImage.requestImage("leftBarUtama.png");
    private final Image buttonContainerBg = RequestImage.requestImage("allButtonPanel.png");
    private final ArrayList<JButton> buttonList;
    private HalamanUtamaGUI halamanUtamaGUI = new HalamanUtamaGUI();
    private GudangGUI gudangGUI = new GudangGUI();
    private HistoriTransaksiGUI historiTransaksiGUI = new HistoriTransaksiGUI();
    private LaporanPenjualanGUI laporanPenjualanGUI = new LaporanPenjualanGUI();
    private PembayaranGUI pembayaranGUI = new PembayaranGUI();
    private PendaftaranMemberGUI pendaftaranMemberGUI = new PendaftaranMemberGUI();
    private PengaturanGUI pengaturanGUI = new PengaturanGUI();
    private UpdateMemberGUI updateMemberGUI = new UpdateMemberGUI();

    public MainUI() {
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
    
    public JPanel getMainPanel(){
        return this.mainPanel;
    }

    public void setForm(JComponent panel){
        mainPanel.removeAll();
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        leftBarPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(leftBarBg, 0, 0, null);
            }
        };
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
        dateTime2 = new main.featureGUI.Util.DateTime();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TEST");
        setBackground(new java.awt.Color(40, 41, 61));
        setName("jFrame"); // NOI18N
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        background.setBackground(new java.awt.Color(40, 41, 61));
        background.setPreferredSize(new java.awt.Dimension(1280, 720));

        leftBarPanel.setBackground(new java.awt.Color(40, 41, 61));
        leftBarPanel.setForeground(new java.awt.Color(40, 41, 61));
        leftBarPanel.setPreferredSize(new java.awt.Dimension(376, 720));

        buttonContainer.setBackground(new java.awt.Color(255, 255, 255));
        buttonContainer.setForeground(new java.awt.Color(255, 255, 255));
        buttonContainer.setOpaque(false);
        buttonContainer.setPreferredSize(new java.awt.Dimension(312, 360));

        buttonHalamanUtama.setBackground(new java.awt.Color(40, 41, 61));
        buttonHalamanUtama.setForeground(new java.awt.Color(217, 217, 217));
        buttonHalamanUtama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonDefault/buttonHalamanUtama.png"))); // NOI18N
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
        buttonPendaftaranMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonDefault/buttonPendaftaranmember.png"))); // NOI18N
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
        buttonPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonDefault/buttonPembayaran.png"))); // NOI18N
        buttonPembayaran.setToolTipText("");
        buttonPembayaran.setBorder(null);
        buttonPembayaran.setBorderPainted(false);
        buttonPembayaran.setContentAreaFilled(false);
        buttonPembayaran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPembayaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonPembayaran.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonPembayaran.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonPembayaran.setPreferredSize(new java.awt.Dimension(153, 37));
        buttonPembayaran.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Pembayaran.png"))); // NOI18N
        buttonPembayaran.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Pembayaran.png"))); // NOI18N
        buttonPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPembayaranActionPerformed(evt);
            }
        });

        buttonUpdateMember.setBackground(new java.awt.Color(40, 41, 61));
        buttonUpdateMember.setForeground(new java.awt.Color(217, 217, 217));
        buttonUpdateMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonDefault/buttonUpdatemember.png"))); // NOI18N
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
        buttonHistoriTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonDefault/buttonHistoritransaksi.png"))); // NOI18N
        buttonHistoriTransaksi.setToolTipText("");
        buttonHistoriTransaksi.setBorder(null);
        buttonHistoriTransaksi.setBorderPainted(false);
        buttonHistoriTransaksi.setContentAreaFilled(false);
        buttonHistoriTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHistoriTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonHistoriTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonHistoriTransaksi.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonHistoriTransaksi.setName(""); // NOI18N
        buttonHistoriTransaksi.setPreferredSize(new java.awt.Dimension(194, 37));
        buttonHistoriTransaksi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Histori transaksi.png"))); // NOI18N
        buttonHistoriTransaksi.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Histori Transaksi.png"))); // NOI18N
        buttonHistoriTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHistoriTransaksiActionPerformed(evt);
            }
        });

        buttonGudang.setBackground(new java.awt.Color(40, 41, 61));
        buttonGudang.setForeground(new java.awt.Color(217, 217, 217));
        buttonGudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonDefault/buttonGudang.png"))); // NOI18N
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
        buttonSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonDefault/buttonPengaturan.png"))); // NOI18N
        buttonSetting.setToolTipText("");
        buttonSetting.setBorder(null);
        buttonSetting.setBorderPainted(false);
        buttonSetting.setContentAreaFilled(false);
        buttonSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSetting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonSetting.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonSetting.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonSetting.setPreferredSize(new java.awt.Dimension(144, 37));
        buttonSetting.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonHover/Pengaturan.png"))); // NOI18N
        buttonSetting.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonSelected/Pengaturan.png"))); // NOI18N
        buttonSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSettingActionPerformed(evt);
            }
        });

        buttonLaporanPenjualan.setBackground(new java.awt.Color(40, 41, 61));
        buttonLaporanPenjualan.setForeground(new java.awt.Color(217, 217, 217));
        buttonLaporanPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonDefault/buttonLaporanpenjualan.png"))); // NOI18N
        buttonLaporanPenjualan.setToolTipText("");
        buttonLaporanPenjualan.setBorder(null);
        buttonLaporanPenjualan.setBorderPainted(false);
        buttonLaporanPenjualan.setContentAreaFilled(false);
        buttonLaporanPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLaporanPenjualan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonLaporanPenjualan.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonLaporanPenjualan.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonLaporanPenjualan.setMinimumSize(new java.awt.Dimension(216, 27));
        buttonLaporanPenjualan.setPreferredSize(new java.awt.Dimension(216, 37));
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
                .addGap(29, 29, 29)
                .addGroup(buttonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonHalamanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPendaftaranMember, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHistoriTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGudang, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLaporanPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        buttonContainerLayout.setVerticalGroup(
            buttonContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonContainerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(buttonHalamanUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(buttonPendaftaranMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(buttonUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(buttonPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(buttonHistoriTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(buttonGudang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(buttonLaporanPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(buttonSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        dateTime2.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoChizuruKecil.png"))); // NOI18N

        javax.swing.GroupLayout leftBarPanelLayout = new javax.swing.GroupLayout(leftBarPanel);
        leftBarPanel.setLayout(leftBarPanelLayout);
        leftBarPanelLayout.setHorizontalGroup(
            leftBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftBarPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(leftBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonContainer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        leftBarPanelLayout.setVerticalGroup(
            leftBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftBarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(buttonContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dateTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        mainPanel.setPreferredSize(new java.awt.Dimension(904, 720));
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(leftBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        leftBarPanel.getAccessibleContext().setAccessibleParent(this);
        setForm(new main.featureGUI.HalamanUtamaGUI());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded

    }//GEN-LAST:event_formComponentAdded

    private void buttonHalamanUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHalamanUtamaActionPerformed
        selectedButton(buttonHalamanUtama);
        setForm(halamanUtamaGUI);
    }//GEN-LAST:event_buttonHalamanUtamaActionPerformed

    private void buttonPendaftaranMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPendaftaranMemberActionPerformed
        selectedButton(buttonPendaftaranMember);
        setForm(pendaftaranMemberGUI);
    }//GEN-LAST:event_buttonPendaftaranMemberActionPerformed

    private void buttonPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPembayaranActionPerformed
        selectedButton(buttonPembayaran);
        setForm(pembayaranGUI);
    }//GEN-LAST:event_buttonPembayaranActionPerformed

    private void buttonUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateMemberActionPerformed
        selectedButton(buttonUpdateMember);
        setForm(updateMemberGUI);
    }//GEN-LAST:event_buttonUpdateMemberActionPerformed

    private void buttonHistoriTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHistoriTransaksiActionPerformed
        selectedButton(buttonHistoriTransaksi);
        setForm(historiTransaksiGUI);
    }//GEN-LAST:event_buttonHistoriTransaksiActionPerformed

    private void buttonGudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGudangActionPerformed
        selectedButton(buttonGudang);
        setForm(gudangGUI);
    }//GEN-LAST:event_buttonGudangActionPerformed

    private void buttonSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSettingActionPerformed
        selectedButton(buttonSetting);
        setForm(pengaturanGUI);
    }//GEN-LAST:event_buttonSettingActionPerformed

    private void buttonLaporanPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanPenjualanActionPerformed
        selectedButton(buttonLaporanPenjualan);
        setForm(laporanPenjualanGUI);
    }//GEN-LAST:event_buttonLaporanPenjualanActionPerformed
    
    public void selectedButton (JButton button){
        for (JButton buttons : buttonList) {
            if (buttons.equals(button)){
                buttons.setSelected(true);
            } else {
                buttons.setSelected(false);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel buttonContainer;
    private javax.swing.JButton buttonGudang;
    private javax.swing.JButton buttonHalamanUtama;
    private javax.swing.JButton buttonHistoriTransaksi;
    private javax.swing.JButton buttonLaporanPenjualan;
    private javax.swing.JButton buttonPembayaran;
    private javax.swing.JButton buttonPendaftaranMember;
    private javax.swing.JButton buttonSetting;
    private javax.swing.JButton buttonUpdateMember;
    private main.featureGUI.Util.DateTime dateTime2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel leftBarPanel;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}