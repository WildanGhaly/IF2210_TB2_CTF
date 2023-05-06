package main;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author wilda
 */
public class Main {

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }
}

// import javax.swing.JFrame;
// import java.util.jar.*;
// import java.util.*;
// import java.lang.reflect.*;
// import java.io.*;
// import java.net.URL;
// import java.net.URLClassLoader;
// import plugins.*;
// import java.awt.EventQueue;

// public class Main extends JFrame{
//     public static void main(String[] args) throws Exception {
//         // String jarFilePath = "src\\main\\java\\plugins\\pie.jar";
//         String jarFilePath = "src\\main\\java\\plugins\\pie2.jar";
//         List<String> classes = new ArrayList<>();
//         classes = Loader.getClassNamesFromJar(jarFilePath);
//         for (String className : classes) {
//             System.out.println(className);
//         }

//         ArrayList<Class> availableClasses = Loader.loadJarFile(jarFilePath);

//         Class<?> c = availableClasses.get(0);
//         System.out.println(c.getName());
//         Method m = c.getDeclaredMethod("start");
        
//         EventQueue.invokeLater(() -> {
//             try {
//               Object obj = c.newInstance();
//               m.setAccessible(true);
//               m.invoke(obj);

//               if (obj instanceof JFrame) {
//                   JFrame frame = (JFrame) obj;
//                   frame.setVisible(true);
//               }
//           } catch (Exception ex) {
//               ex.printStackTrace();
//           }
//        });
//     }
// }
