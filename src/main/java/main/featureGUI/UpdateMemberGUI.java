/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import main.featureGUI.Util.UtilFunction;

import main.featureGUI.Util.RequestImage;

/**
 *
 * @author user
 */
public class UpdateMemberGUI extends javax.swing.JPanel {

    /**
     * Creates new form UpdateMemberGUI
     */
    private final Image comboBoxUpdateImg = RequestImage.requestImage("updatemember/comboBoxUpdateMember.png");
    private final Image updateBoxPanelImg = RequestImage.requestImage("updatemember/boxUpdateMember.png");
    private final Image statusBoxPanelImg = RequestImage.requestImage("updatemember/boxStatus.png");

    public UpdateMemberGUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateMemberPanel = new javax.swing.JPanel();
        logoUpdateMember = new javax.swing.JLabel();
        updateBoxPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(updateBoxPanelImg, 0, 0, null);
            }
        };
        labelNama = new javax.swing.JLabel();
        ubahNama = new javax.swing.JTextField();
        labelNoTelepon = new javax.swing.JLabel();
        ubahNoTelepon = new javax.swing.JTextField();
        statusPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(statusBoxPanelImg, 0, 0, null);
            }
        };
        comboBoxStatus = new main.featureGUI.Util.customcombobox.Combobox<>();
        buttonSaveUpdateMember = new javax.swing.JButton();
        buttonActivation = new javax.swing.JButton();
        comboBoxPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(comboBoxUpdateImg, 0, 0, null);
            }
        };
        comboBoxCariMember = new main.featureGUI.Util.customcombobox.Combobox<>();
        polygonCariMember = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(904, 680));

        updateMemberPanel.setBackground(new java.awt.Color(40, 41, 61));

        logoUpdateMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/updatemember/logoUpdateMember.png"))); // NOI18N

        updateBoxPanel.setBackground(new java.awt.Color(40, 41, 61));
        updateBoxPanel.setPreferredSize(new java.awt.Dimension(762, 509));

        labelNama.setFont(new java.awt.Font("Inter", 1, 30));
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Nama");
        labelNama.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelNama.setMaximumSize(new java.awt.Dimension(9999, 9999));
        labelNama.setPreferredSize(new java.awt.Dimension(84, 36));

        ubahNama.setBackground(new java.awt.Color(40, 41, 61, 0));
        ubahNama.setFont(new java.awt.Font("Inter", 0, 20));
        ubahNama.setForeground(new java.awt.Color(217, 217, 217));
        ubahNama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ubahNama.setText(" Ubah nama disini...");
        ubahNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(217, 217, 217)));
        ubahNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ubahNama.setPreferredSize(new java.awt.Dimension(400, 35));
        ubahNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ubahNamaFocusLost(evt);
            }
        });
        ubahNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubahNamaMouseClicked(evt);
            }
        });

        labelNoTelepon.setFont(new java.awt.Font("Inter", 1, 30));
        labelNoTelepon.setForeground(new java.awt.Color(255, 255, 255));
        labelNoTelepon.setText("Nomor Telepon");
        labelNoTelepon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelNoTelepon.setMaximumSize(new java.awt.Dimension(9999, 9999));
        labelNoTelepon.setPreferredSize(new java.awt.Dimension(300, 36));

        ubahNoTelepon.setBackground(new java.awt.Color(40, 41, 61, 0));
        ubahNoTelepon.setFont(new java.awt.Font("Inter", 0, 20));
        ubahNoTelepon.setForeground(new java.awt.Color(217, 217, 217));
        ubahNoTelepon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ubahNoTelepon.setText(" Ubah nomor telepon disini...");
        ubahNoTelepon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(217, 217, 217)));
        ubahNoTelepon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ubahNoTelepon.setPreferredSize(new java.awt.Dimension(400, 35));
        ubahNoTelepon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ubahNoTeleponFocusLost(evt);
            }
        });
        ubahNoTelepon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubahNoTeleponMouseClicked(evt);
            }
        });

        statusPanel.setOpaque(false);
        statusPanel.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxStatus.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxStatus.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Member" }));
        comboBoxStatus.setSelectedIndex(-1);
        comboBoxStatus.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxStatus.setLabelText("Status");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        buttonSaveUpdateMember.setBackground(new java.awt.Color(0,0,0,0));
        buttonSaveUpdateMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/buttonSave.png"))); // NOI18N
        buttonSaveUpdateMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSaveUpdateMember.setPreferredSize(new java.awt.Dimension(92, 56));
        buttonSaveUpdateMember.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/buttonSaveClicked.png"))); // NOI18N
        buttonSaveUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveUpdateMemberActionPerformed(evt);
            }
        });

        buttonActivation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/updatemember/boxActive.png"))); // NOI18N
        buttonActivation.setBorder(null);
        buttonActivation.setContentAreaFilled(false);
        buttonActivation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActivationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateBoxPanelLayout = new javax.swing.GroupLayout(updateBoxPanel);
        updateBoxPanel.setLayout(updateBoxPanelLayout);
        updateBoxPanelLayout.setHorizontalGroup(
            updateBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateBoxPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSaveUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(updateBoxPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(updateBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateBoxPanelLayout.createSequentialGroup()
                        .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(buttonActivation))
                    .addGroup(updateBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(updateBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ubahNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ubahNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        updateBoxPanelLayout.setVerticalGroup(
            updateBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBoxPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ubahNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(labelNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubahNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(updateBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonActivation))
                .addGap(5, 5, 5)
                .addComponent(buttonSaveUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        comboBoxPanel.setOpaque(false);
        comboBoxPanel.setPreferredSize(new java.awt.Dimension(766, 80));

        comboBoxCariMember.setBackground(new java.awt.Color(0,0,0,0));
        comboBoxCariMember.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxCariMember.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salman", "Willy", "Copa", "Haidar", "Haikal", "Afnan" }));
        comboBoxCariMember.setSelectedIndex(-1);
        comboBoxCariMember.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxCariMember.setLabelText("Cari member...");
        comboBoxCariMember.setOpaque(false);
        comboBoxCariMember.setPreferredSize(new java.awt.Dimension(708, 44));

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
                .addContainerGap(36, Short.MAX_VALUE))
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

        javax.swing.GroupLayout updateMemberPanelLayout = new javax.swing.GroupLayout(updateMemberPanel);
        updateMemberPanel.setLayout(updateMemberPanelLayout);
        updateMemberPanelLayout.setHorizontalGroup(
            updateMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateMemberPanelLayout.createSequentialGroup()
                .addGroup(updateMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateMemberPanelLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(logoUpdateMember))
                    .addGroup(updateMemberPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(updateMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateBoxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                            .addComponent(comboBoxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        updateMemberPanelLayout.setVerticalGroup(
            updateMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateMemberPanelLayout.createSequentialGroup()
                .addComponent(logoUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comboBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(updateBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateMemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateMemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ubahNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahNamaMouseClicked
        if (ubahNoTelepon.getText().isEmpty()){
            ubahNoTelepon.setText(" Ubah nomor telepon disini...");
        }
        if (ubahNama.getText().equals(" Ubah nama disini...")){
            ubahNama.setText("");
        }
    }//GEN-LAST:event_ubahNamaMouseClicked

    private void ubahNoTeleponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahNoTeleponMouseClicked
        if(ubahNama.getText().isEmpty()){
            ubahNama.setText(" Ubah nama disini...");
        }
        if(ubahNoTelepon.getText().equals(" Ubah nomor telepon disini...")){
            ubahNoTelepon.setText("");
        }
    }//GEN-LAST:event_ubahNoTeleponMouseClicked

    private void comboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatusActionPerformed
        /*TODO find membernya didatabse*/
        comboBoxCariMember.getSelectedItem();
        /*TODO ganti statusnya*/
        comboBoxStatus.getSelectedItem();
    }//GEN-LAST:event_comboBoxStatusActionPerformed

    private void buttonSaveUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveUpdateMemberActionPerformed
        if (comboBoxCariMember.getSelectedIndex()!=-1){
            if(ubahNama.getText().equals(" Ubah nama disini...") || ubahNoTelepon.getText().equals(" Ubah nomor telepon disini...")){
                JOptionPane.showMessageDialog(null, "invalid name");
            }
            else if (!UtilFunction.isNumeric(ubahNoTelepon.getText())){
                JOptionPane.showMessageDialog(null, "invalid telephone number");
            } else {
                /*TODO data update disini*/
                ubahNama.getText();
                ubahNoTelepon.getText();
                /*data update disini*/
                JOptionPane.showMessageDialog(null, "Member Updated");
                ubahNama.setText(" Ubah nama disini...");
                ubahNoTelepon.setText(" Ubah nomor telepon disini...");
                comboBoxCariMember.setSelectedIndex(-1);
                comboBoxCariMember.setLabelText("Cari member...");
            }
        } else {
            ubahNama.setText(" Ubah nama disini...");
            ubahNoTelepon.setText(" Ubah nomor telepon disini...");
            JOptionPane.showMessageDialog(null, "No chosen member");
        }
    }//GEN-LAST:event_buttonSaveUpdateMemberActionPerformed

    private void ubahNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ubahNamaFocusLost
        if (ubahNama.getText().isEmpty()){
            ubahNama.setText(" Ubah nama disini...");
        }
    }//GEN-LAST:event_ubahNamaFocusLost

    private void ubahNoTeleponFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ubahNoTeleponFocusLost
        if (ubahNoTelepon.getText().isEmpty()){
            ubahNoTelepon.setText(" Ubah nomor telepon disini...");
        }
    }//GEN-LAST:event_ubahNoTeleponFocusLost

    private void buttonActivationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActivationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonActivationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonActivation;
    private javax.swing.JButton buttonSaveUpdateMember;
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxCariMember;
    private javax.swing.JPanel comboBoxPanel;
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxStatus;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoTelepon;
    private javax.swing.JLabel logoUpdateMember;
    private javax.swing.JLabel polygonCariMember;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JTextField ubahNama;
    private javax.swing.JTextField ubahNoTelepon;
    private javax.swing.JPanel updateBoxPanel;
    private javax.swing.JPanel updateMemberPanel;
    // End of variables declaration//GEN-END:variables
}
