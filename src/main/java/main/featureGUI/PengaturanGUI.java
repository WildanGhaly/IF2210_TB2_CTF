/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import lombok.Getter;
import main.featureGUI.Util.RequestImage;

/**
 *
 * @author user
 */
public class PengaturanGUI extends javax.swing.JPanel {

    /**
     * Creates new form Setting
     */
    private static final PengaturanGUI PENGATURAN_GUI = new PengaturanGUI();
    private final Image statusBoxPanelImg = RequestImage.requestImage("updatemember/boxStatus.png");

    private PengaturanGUI() {
        initComponents();
    }

    public static PengaturanGUI getInstance(){
        return PengaturanGUI.PENGATURAN_GUI;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gudangPanel = new javax.swing.JPanel();
        logoPegaturan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        addPlugin = new javax.swing.JButton();
        statusPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(statusBoxPanelImg, 0, 0, null);
            }
        };
        comboBoxFile = new main.featureGUI.Util.customcombobox.Combobox();
        usePlugin = new javax.swing.JButton();
        usePlugin.setVisible(false);

        gudangPanel.setBackground(new java.awt.Color(40, 41, 61));
        gudangPanel.setForeground(new java.awt.Color(72, 84, 254));

        logoPegaturan.setBackground(new java.awt.Color(40, 41, 61));
        logoPegaturan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPegaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pendaftaranmember/logoPendaftaranMember.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(40, 41, 61));
        jPanel1.setForeground(new java.awt.Color(40, 41, 61));

        addPlugin.setBackground(new java.awt.Color(40, 41, 61));
        addPlugin.setForeground(new java.awt.Color(40, 41, 61));
        addPlugin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pengaturan/plugin.png"))); // NOI18N
        addPlugin.setBorderPainted(false);
        addPlugin.setContentAreaFilled(false);
        addPlugin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPlugin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPluginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPlugin, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPlugin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        statusPanel.setOpaque(false);
        statusPanel.setPreferredSize(new java.awt.Dimension(151, 48));

        comboBoxFile.setBackground(new java.awt.Color(40, 41, 60, 0));
        comboBoxFile.setForeground(new java.awt.Color(217, 217, 217));
        comboBoxFile.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "xml", "json", "obj" }));
        comboBoxFile.setSelectedIndex(-1);
        comboBoxFile.setFont(new java.awt.Font("Inter", 1, 22));
        comboBoxFile.setLabelText("File");
        comboBoxFile.setOpaque(false);
        comboBoxFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxFile, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxFile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        usePlugin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pengaturan/usePlugin.png"))); // NOI18N
        usePlugin.setBorder(null);
        usePlugin.setBorderPainted(false);
        usePlugin.setContentAreaFilled(false);
        usePlugin.setEnabled(false);
        usePlugin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        usePlugin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usePluginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gudangPanelLayout = new javax.swing.GroupLayout(gudangPanel);
        gudangPanel.setLayout(gudangPanelLayout);
        gudangPanelLayout.setHorizontalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gudangPanelLayout.createSequentialGroup()
                        .addComponent(logoPegaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gudangPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(353, 353, 353))))
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addGroup(gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usePlugin, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gudangPanelLayout.setVerticalGroup(
            gudangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gudangPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPegaturan, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usePlugin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
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

    private void addPluginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPluginActionPerformed
        AddPluginFrame addPluginFrame = new AddPluginFrame();
        addPluginFrame.setVisible(true);
        addPluginFrame.getFilePath();
        
    }//GEN-LAST:event_addPluginActionPerformed

    private void comboBoxFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFileActionPerformed
        /*TODO find membernya didatabse*/
        comboBoxFile.getSelectedItem();
    }//GEN-LAST:event_comboBoxFileActionPerformed

    private void usePluginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usePluginActionPerformed
        // TODO button tambahannya:
    }//GEN-LAST:event_usePluginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPlugin;
    private main.featureGUI.Util.customcombobox.Combobox comboBoxFile;
    private javax.swing.JPanel gudangPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoPegaturan;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JButton usePlugin;
    // End of variables declaration//GEN-END:variables

        private class AddPluginFrame extends javax.swing.JFrame {

        
        private @Getter String filePath = "";
        private @Getter String actionCommand = "";

        public AddPluginFrame() {
            initComponents();
        }

        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

            fileChooserPlugin = new javax.swing.JFileChooser();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            fileChooserPlugin.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fileChooserPluginActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(fileChooserPlugin, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(fileChooserPlugin, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void fileChooserPluginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserPluginActionPerformed
            if (fileChooserPlugin.getSelectedFile()!=null){
                filePath = fileChooserPlugin.getSelectedFile().toPath().toString();
                actionCommand = evt.getActionCommand();
                usePlugin.setEnabled(true);
                usePlugin.setVisible(true);
            }
            dispose();
        }//GEN-LAST:event_fileChooserPluginActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JFileChooser fileChooserPlugin;
        // End of variables declaration//GEN-END:variables
    }
}
