/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaprojeodevi;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author UTKU
 */
public class TestSayfasi extends javax.swing.JFrame {
    
    String correctAnswer ="**";
    String cevap = "*";
    /**
     * Creates new form TestSayfasi
     */
    public TestSayfasi() throws SQLException {
        ArrayList<Integer> aryList = Database.dbGetIdTest();
        if (!aryList.isEmpty()){
            Random random = new Random();
            int a = random.nextInt(aryList.size());
            cevap = Database.dbGetAnswer(aryList.get(a));
            initComponents();
            Database.dbGetQuestion(aryList.get(a), lblSoru, btnA, btnB, btnC, btnD);
            Database.dbDeleteRowTest(aryList.get(a));
            btnSonrakiSoru2.setVisible(false);
            btnA.setEnabled(true);
            btnB.setEnabled(true);
            btnC.setEnabled(true);
            btnD.setEnabled(true);
        }else
        {
            close();
            BitisSayfasi sayfa = new BitisSayfasi();
            sayfa.setVisible(true);
        }
        
        
    }
    public void kaydet(){
       
        if(correctAnswer.equals(cevap)){
            JOptionPane.showMessageDialog(this ,"Dogru devam et aslan");
        }else{
             JOptionPane.showMessageDialog(this ,"Cevap Yanlıs");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblSoru = new javax.swing.JLabel();
        btnA = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        btnC = new javax.swing.JRadioButton();
        btnD = new javax.swing.JRadioButton();
        btnSonrakiSoru2 = new javax.swing.JButton();
        btnSonrakiSoru = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelime Ezberleme Uygulaması");
        setAlwaysOnTop(true);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 175);

        lblSoru.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblSoru.setForeground(new java.awt.Color(255, 51, 0));
        lblSoru.setText("Soru");
        getContentPane().add(lblSoru);
        lblSoru.setBounds(40, 220, 880, 80);

        btnA.setBackground(new java.awt.Color(190, 229, 221));
        buttonGroup1.add(btnA);
        btnA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnA.setForeground(new java.awt.Color(102, 0, 102));
        btnA.setText("Cevap A");
        btnA.setBorder(null);
        btnA.setContentAreaFilled(false);
        btnA.setFocusPainted(false);
        btnA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAMouseClicked(evt);
            }
        });
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        getContentPane().add(btnA);
        btnA.setBounds(90, 280, 140, 70);

        btnB.setBackground(new java.awt.Color(188, 227, 219));
        buttonGroup1.add(btnB);
        btnB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnB.setForeground(new java.awt.Color(102, 0, 102));
        btnB.setText("Cevap B");
        btnB.setContentAreaFilled(false);
        btnB.setPreferredSize(new java.awt.Dimension(100, 21));
        btnB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBMouseClicked(evt);
            }
        });
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        getContentPane().add(btnB);
        btnB.setBounds(90, 350, 130, 60);

        btnC.setBackground(new java.awt.Color(188, 227, 219));
        buttonGroup1.add(btnC);
        btnC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnC.setForeground(new java.awt.Color(102, 0, 102));
        btnC.setText("Cevap C");
        btnC.setContentAreaFilled(false);
        btnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCMouseClicked(evt);
            }
        });
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC);
        btnC.setBounds(90, 420, 130, 50);

        btnD.setBackground(new java.awt.Color(188, 227, 219));
        buttonGroup1.add(btnD);
        btnD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnD.setForeground(new java.awt.Color(102, 0, 102));
        btnD.setText("Cevap D");
        btnD.setContentAreaFilled(false);
        btnD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDMouseClicked(evt);
            }
        });
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        getContentPane().add(btnD);
        btnD.setBounds(90, 480, 130, 50);

        btnSonrakiSoru2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnSonrakiSoru2.setText("Sonraki Soru");
        btnSonrakiSoru2.setBorderPainted(false);
        btnSonrakiSoru2.setContentAreaFilled(false);
        btnSonrakiSoru2.setFocusPainted(false);
        btnSonrakiSoru2.setRequestFocusEnabled(false);
        btnSonrakiSoru2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonrakiSoru2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonrakiSoru2);
        btnSonrakiSoru2.setBounds(350, 570, 250, 50);

        btnSonrakiSoru.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnSonrakiSoru.setForeground(new java.awt.Color(51, 51, 51));
        btnSonrakiSoru.setText("Kaydet");
        btnSonrakiSoru.setBorderPainted(false);
        btnSonrakiSoru.setContentAreaFilled(false);
        btnSonrakiSoru.setFocusPainted(false);
        btnSonrakiSoru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonrakiSoruActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonrakiSoru);
        btnSonrakiSoru.setBounds(390, 570, 160, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("TEST SORULARI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 20, 430, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/test.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1020, 680);

        setSize(new java.awt.Dimension(1038, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSonrakiSoru2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonrakiSoru2ActionPerformed
        close();
        TestSayfasi sonrakiSoru;
        try {
            sonrakiSoru = new TestSayfasi();
            sonrakiSoru.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TestSayfasi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSonrakiSoru2ActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDActionPerformed

    private void btnAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMouseClicked
        // TODO add your handling code here:
        correctAnswer = btnA.getText();
       
    }//GEN-LAST:event_btnAMouseClicked

    private void btnBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBMouseClicked
        // TODO add your handling code here:
        correctAnswer = btnB.getText();
       
        
    }//GEN-LAST:event_btnBMouseClicked

    private void btnCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseClicked
        // TODO add your handling code here:
        correctAnswer = btnC.getText();
        System.out.println(correctAnswer);
        
    }//GEN-LAST:event_btnCMouseClicked

    private void btnDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMouseClicked
        // TODO add your handling code here:
        correctAnswer = btnD.getText();
        
        
    }//GEN-LAST:event_btnDMouseClicked

    private void btnSonrakiSoruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonrakiSoruActionPerformed
        // TODO add your handling code here:
        if(correctAnswer.equals("**")){
            JOptionPane.showMessageDialog(this ,"Cevabı secmediniz...");
        }else{
            kaydet();
            btnSonrakiSoru2.setVisible(true);
            btnSonrakiSoru.setVisible(false);
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
        }
        
        
        
    }//GEN-LAST:event_btnSonrakiSoruActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TestSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TestSayfasi().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TestSayfasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JRadioButton btnD;
    private javax.swing.JButton btnSonrakiSoru;
    private javax.swing.JButton btnSonrakiSoru2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblSoru;
    // End of variables declaration//GEN-END:variables
}
