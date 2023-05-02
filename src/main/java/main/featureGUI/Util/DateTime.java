/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.featureGUI.Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
/**
 *
 * @author user
 */
public class DateTime {
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
    
    public static void dateTimeThreading(JLabel timeLabel, JLabel dateLabel){
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
                System.out.println(currentSecond);
                currentSecond++;
            }
        }, 0, 1000 );
    }
}
