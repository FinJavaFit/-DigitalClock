
package digital.clock;


import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import java.time.Clock;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;

public class ClockFrame extends javax.swing.JFrame {

   
    public ClockFrame() {
        
       initComponents();
       
       
      
       Quotes me = new Quotes();
        
       QQ.setText(me.fin);
        
        new Thread() 
       {
          public void run()
          {
             while(true)
             {
                Calendar cal = new GregorianCalendar();
                
                int hour = cal.get(Calendar.HOUR);
                int min = cal.get(Calendar.MINUTE);
                int sec = cal.get(Calendar.SECOND);
                int AM_PM = cal.get(Calendar.AM_PM);
                
                String day_night;
                 if (AM_PM == 1) 
                 {
                     day_night = "PM";
                 }
                 
                 else
                 {
                     day_night = "AM";
                 }
                     
                DecimalFormat fmt = new DecimalFormat("00");
                
                String time = fmt.format(hour) + ":" + fmt.format(min) + ":" + fmt.format(sec);
         
                Clock.setText(time);
             } 
              
          }
           
        }.start();
   
    }
 private void getWeather()
 {
   // WeatherDoc doc = new WeatherDoc();
 }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Clock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        QQ = new javax.swing.JTextArea();
        Goog = new javax.swing.JButton();
        Facebook = new javax.swing.JButton();
        Finance = new javax.swing.JButton();
        tim = new javax.swing.JTextField();
        Alarm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Clock.setEditable(false);
        Clock.setBackground(new java.awt.Color(0, 0, 0));
        Clock.setFont(new java.awt.Font("DS-Digital", 0, 68)); // NOI18N
        Clock.setForeground(new java.awt.Color(0, 255, 255));
        Clock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Clock.setText("9:39:00 PM");
        Clock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Clock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClockActionPerformed(evt);
            }
        });

        QQ.setEditable(false);
        QQ.setBackground(new java.awt.Color(0, 0, 0));
        QQ.setColumns(20);
        QQ.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        QQ.setForeground(new java.awt.Color(0, 204, 204));
        QQ.setLineWrap(true);
        QQ.setRows(5);
        QQ.setText("xcvccxadfaddddddddddddddddddddddddddddddddddddddddd");
        QQ.setWrapStyleWord(true);
        QQ.setBorder(null);
        jScrollPane1.setViewportView(QQ);

        Goog.setBackground(new java.awt.Color(0, 0, 0));
        Goog.setForeground(new java.awt.Color(0, 102, 102));
        Goog.setText("Google");
        Goog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoogActionPerformed(evt);
            }
        });

        Facebook.setBackground(new java.awt.Color(0, 0, 0));
        Facebook.setForeground(new java.awt.Color(0, 153, 153));
        Facebook.setText("Facebook");
        Facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacebookActionPerformed(evt);
            }
        });

        Finance.setBackground(new java.awt.Color(0, 0, 0));
        Finance.setForeground(new java.awt.Color(0, 153, 153));
        Finance.setText("Finance");
        Finance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinanceActionPerformed(evt);
            }
        });

        tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timActionPerformed(evt);
            }
        });

        Alarm.setText("Set Alarm");
        Alarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Finance)
                .addGap(18, 18, 18)
                .addComponent(Facebook)
                .addGap(18, 18, 18)
                .addComponent(Goog)
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Alarm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tim, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Goog)
                    .addComponent(Facebook)
                    .addComponent(Finance))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alarm))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClockActionPerformed

    private void GoogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoogActionPerformed
        try {
    Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());
} catch (Exception e) {}
    }//GEN-LAST:event_GoogActionPerformed

    private void FacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacebookActionPerformed
      try {
    Desktop.getDesktop().browse(new URL("http://www.facebook.com").toURI());
} catch (Exception e) {}
    }//GEN-LAST:event_FacebookActionPerformed

    private void FinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinanceActionPerformed
         try {
    Desktop.getDesktop().browse(new URL("https://finance.yahoo.com/").toURI());
} catch (Exception e) {}
    }//GEN-LAST:event_FinanceActionPerformed

    private void timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timActionPerformed

    private void AlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmActionPerformed
        
    }//GEN-LAST:event_AlarmActionPerformed

   
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
            java.util.logging.Logger.getLogger(ClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClockFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alarm;
    private javax.swing.JTextField Clock;
    private javax.swing.JButton Facebook;
    private javax.swing.JButton Finance;
    private javax.swing.JButton Goog;
    private javax.swing.JTextArea QQ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tim;
    // End of variables declaration//GEN-END:variables
}
