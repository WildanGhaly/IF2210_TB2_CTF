/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

/**
 *
 * @author user
 */
public class LaporanPenjualanGUI extends javax.swing.JPanel {

    /**
     * Creates new form LaporanPenjualanGUI
     */
    public LaporanPenjualanGUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gudangPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxStatus = new main.featureGUI.Util.customcombobox.Combobox<>();
        comboBoxStatus1 = new main.featureGUI.Util.customcombobox.Combobox<>();

        gudangPanel.setBackground(new java.awt.Color(40, 41, 61));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laporanpenjualan/logopenjualan.png"))); // NOI18N

        comboBoxStatus.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxStatus.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023" }));
        comboBoxStatus.setSelectedIndex(-1);
        comboBoxStatus.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxStatus.setLabelText("Status");
        comboBoxStatus.setOpaque(false);
        comboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStatusActionPerformed(evt);
            }
        });

        comboBoxStatus1.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxStatus1.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxStatus1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "November", "Desember" }));
        comboBoxStatus1.setSelectedIndex(-1);
        comboBoxStatus1.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxStatus1.setLabelText("Status");
        comboBoxStatus1.setOpaque(false);
        comboBoxStatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStatus1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gudangPanelLayout = new javax.swing.GroupLayout(gudangPanel);
        gudangPanel.setLayout(gudangPanelLayout);
        gudangPanelLayout.setHorizontalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gudangPanelLayout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(237, 237, 237))
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(comboBoxStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gudangPanelLayout.setVerticalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(618, Short.MAX_VALUE))
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

    private void comboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatusActionPerformed
        // TODO buat update status member disini
    }//GEN-LAST:event_comboBoxStatusActionPerformed

    private void comboBoxStatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxStatus1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxStatus;
    private main.featureGUI.Util.customcombobox.Combobox<String> comboBoxStatus1;
    private javax.swing.JPanel gudangPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
