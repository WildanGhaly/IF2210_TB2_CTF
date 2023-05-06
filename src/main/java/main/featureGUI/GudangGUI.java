/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class GudangGUI extends javax.swing.JPanel {

    /**
     * Creates new form Gudang
     */
    public GudangGUI() {
        initComponents();
    }

    public JPanel getPanel(){
        return this.gudangPanel;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gudangPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("GUDANG");

        javax.swing.GroupLayout gudangPanelLayout = new javax.swing.GroupLayout(gudangPanel);
        gudangPanel.setLayout(gudangPanelLayout);
        gudangPanelLayout.setHorizontalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        gudangPanelLayout.setVerticalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gudangPanelLayout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gudangPanel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
