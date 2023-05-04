/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import main.featureGUI.Util.RequestImage;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author user
 */
public class PendaftaranMemberGUI extends javax.swing.JPanel {

    private final Image boxPendaftaranImg = RequestImage.requestImage("pendaftaranmember/boxPendaftaranMember.png");
    
    public PendaftaranMemberGUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pendaftaranMember = new javax.swing.JPanel();
        logoPendaftaran = new javax.swing.JLabel();
        boxPendaftaran = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(boxPendaftaranImg, 0, 0, null);
            }
        };
        labelNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        labelNoTelepon = new javax.swing.JLabel();
        inputNoTelepon = new javax.swing.JTextField();
        addMember = new javax.swing.JButton();

        pendaftaranMember.setBackground(new java.awt.Color(40, 41, 61));

        logoPendaftaran.setBackground(new java.awt.Color(40, 41, 61));
        logoPendaftaran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pendaftaranmember/logoPendaftaranMember.png"))); // NOI18N

        boxPendaftaran.setBackground(new java.awt.Color(40, 41, 61));
        boxPendaftaran.setOpaque(false);
        boxPendaftaran.setPreferredSize(new java.awt.Dimension(534, 347));

        labelNama.setFont(new java.awt.Font("Inter", 1, 30));
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Nama");
        labelNama.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelNama.setMaximumSize(new java.awt.Dimension(9999, 9999));
        labelNama.setPreferredSize(new java.awt.Dimension(84, 36));

        inputNama.setBackground(new java.awt.Color(40, 41, 61, 0));
        inputNama.setFont(new java.awt.Font("Inter", 0, 20));
        inputNama.setForeground(new java.awt.Color(217, 217, 217));
        inputNama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputNama.setText(" Ketikkan nama...");
        inputNama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(217, 217, 217)));
        inputNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputNama.setPreferredSize(new java.awt.Dimension(400, 35));
        inputNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputNamaMouseClicked(evt);
            }
        });

        labelNoTelepon.setFont(new java.awt.Font("Inter", 1, 30));
        labelNoTelepon.setForeground(new java.awt.Color(255, 255, 255));
        labelNoTelepon.setText("Nomor Telepon");
        labelNoTelepon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelNoTelepon.setMaximumSize(new java.awt.Dimension(9999, 9999));
        labelNoTelepon.setPreferredSize(new java.awt.Dimension(300, 36));

        inputNoTelepon.setBackground(new java.awt.Color(40, 41, 61, 0));
        inputNoTelepon.setFont(new java.awt.Font("Inter", 0, 20));
        inputNoTelepon.setForeground(new java.awt.Color(217, 217, 217));
        inputNoTelepon.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inputNoTelepon.setText(" Ketik nomor telepon...");
        inputNoTelepon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(217, 217, 217)));
        inputNoTelepon.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputNoTelepon.setPreferredSize(new java.awt.Dimension(400, 35));
        inputNoTelepon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputNoTeleponMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boxPendaftaranLayout = new javax.swing.GroupLayout(boxPendaftaran);
        boxPendaftaran.setLayout(boxPendaftaranLayout);
        boxPendaftaranLayout.setHorizontalGroup(
            boxPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPendaftaranLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(boxPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(boxPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                        .addComponent(inputNoTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        boxPendaftaranLayout.setVerticalGroup(
            boxPendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPendaftaranLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(labelNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        addMember.setBackground(new java.awt.Color(40, 41, 61));
        addMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Utility/addButton.png"))); // NOI18N
        addMember.setBorderPainted(false);
        addMember.setContentAreaFilled(false);
        addMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMember.setMaximumSize(new java.awt.Dimension(9999, 9999));
        addMember.setPreferredSize(new java.awt.Dimension(80, 56));
        addMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pendaftaranMemberLayout = new javax.swing.GroupLayout(pendaftaranMember);
        pendaftaranMember.setLayout(pendaftaranMemberLayout);
        pendaftaranMemberLayout.setHorizontalGroup(
            pendaftaranMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pendaftaranMemberLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(pendaftaranMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pendaftaranMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boxPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(189, 189, 189))
        );
        pendaftaranMemberLayout.setVerticalGroup(
            pendaftaranMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendaftaranMemberLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(logoPendaftaran)
                .addGap(41, 41, 41)
                .addComponent(boxPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addMember, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(147, 147, 147))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pendaftaranMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pendaftaranMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNamaMouseClicked
        if (inputNoTelepon.getText().isEmpty()){
            inputNoTelepon.setText(" Ketik nomor telepon...");
        }
        if (inputNama.getText().equals(" Ketikkan nama...")){
            inputNama.setText("");
        }
    }//GEN-LAST:event_inputNamaMouseClicked

    private void inputNoTeleponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNoTeleponMouseClicked
        if(inputNama.getText().isEmpty()){
            inputNama.setText(" Ketikkan nama...");
        }
        if(inputNoTelepon.getText().equals(" Ketik nomor telepon...")){
            inputNoTelepon.setText("");
        }
    }//GEN-LAST:event_inputNoTeleponMouseClicked

    private void addMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberActionPerformed
        
        if(inputNama.getText().equals(" Ketikkan nama...") || inputNoTelepon.getText().equals(" Ketik nomor telepon...")){
            JOptionPane.showMessageDialog(null, "invalid name");
        }
        else if (!isNumeric(inputNoTelepon.getText())){
            JOptionPane.showMessageDialog(null, "invalid telephone number");
        } else {
            /*data masuk*/
            inputNama.getText();
            inputNoTelepon.getText();
            JOptionPane.showMessageDialog(null, "Member Added");
            inputNama.setText(" Ketikkan nama...");
            inputNoTelepon.setText(" Ketik nomor telepon...");
        }
    }//GEN-LAST:event_addMemberActionPerformed

    private boolean isNumeric (String strNum){
        if (strNum == null){
            return false;
        }
        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMember;
    private javax.swing.JPanel boxPendaftaran;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNoTelepon;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoTelepon;
    private javax.swing.JLabel logoPendaftaran;
    private javax.swing.JPanel pendaftaranMember;
    // End of variables declaration//GEN-END:variables
}
