/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.featureGUI.Util;

import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class DateTime extends javax.swing.JPanel implements Runnable{

    /**
     * Creates new form DateTime
     */
    private final Image datetimeBg = RequestImage.requestImage("jam.png");
    
    private static final String[] months= {"Jan", "Feb", "Mar",
                                          "Apr",   "May", "Jun",
                                          "Jul",  "AUG", "Sep",
                                          "Oct", "Nov", "Dec"};
    private static final String[] days= {"Sun", "MON", "Tue", "Wed",
                                          "Thu", "Fri", "Sat"
                                          };
    private final static SimpleDateFormat sdf  = new SimpleDateFormat("hh:mm");
    private static Calendar clock;
    private static int currentSecond;
    
    private static void reset(){
        clock = Calendar.getInstance();
        currentSecond = clock.get(Calendar.SECOND);
    }
    public void run(){
        dateTimeThreading();
    }

    public void dateTimeThreading(){
        reset();
        Timer timer = new Timer();
        Integer month = clock.get(Calendar.MONTH);
        Integer day = clock.get(Calendar.DAY_OF_MONTH);
        Integer year = clock.get(Calendar.YEAR);
        Integer today = clock.get(Calendar.DAY_OF_WEEK);
        timer.scheduleAtFixedRate( new TimerTask(){
            public void run(){
                if( currentSecond == 60 ) {
                    reset();
                }
                String timeStamp = String.format("%s", sdf.format(clock.getTime()), currentSecond );
                if(clock.get(Calendar.AM_PM) == 0){
                    timeStamp = timeStamp.concat(" A.M.");
                } else {
                    timeStamp = timeStamp.concat(" P.M.");
                }
                timeLabel.setText(timeStamp);
                String date = days[today-1].concat(", " + day.toString() + " " + months[month] + " " + year.toString());
                System.out.println(timeStamp);
                System.out.println(date);
                dateLabel.setText(String.format(date));
                currentSecond++;
            }
        }, 0, 1000 );
    }

    public DateTime() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clock = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(datetimeBg, 0, 0, null);
            }
        };
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();

        Clock.setBackground(new java.awt.Color(40, 41, 61));
        Clock.setAlignmentY(0.0F);
        Clock.setOpaque(false);
        Clock.setPreferredSize(new java.awt.Dimension(318, 92));

        timeLabel.setFont(new java.awt.Font("Inter", 0, 28));
        timeLabel.setForeground(new java.awt.Color(62, 231, 188));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("Clock");
        timeLabel.setToolTipText("");
        timeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        timeLabel.setPreferredSize(new java.awt.Dimension(357, 38));
        timeLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        dateLabel.setFont(new java.awt.Font("Inter", 0, 28));
        dateLabel.setForeground(new java.awt.Color(62, 231, 188));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Date");

        javax.swing.GroupLayout ClockLayout = new javax.swing.GroupLayout(Clock);
        Clock.setLayout(ClockLayout);
        ClockLayout.setHorizontalGroup(
            ClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClockLayout.createSequentialGroup()
                .addGroup(ClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addContainerGap())
        );
        ClockLayout.setVerticalGroup(
            ClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClockLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        run();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Clock;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
