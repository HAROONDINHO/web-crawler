package URLChecker;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GUI extends javax.swing.JFrame {
    boolean error;
    public GUI() {
        initComponents();
    }

    public boolean validDepth() {
        boolean valid;
        int DepthNumber = 0;
        String D = Depth.getText();
        try {
            DepthNumber = Integer.parseInt(D);
            valid = true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "InValid Depth Number!!", "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        if (valid) {
            if (DepthNumber < 0) {
                valid = false;
                JOptionPane.showMessageDialog(this, "Incorrect Depth Number!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return valid;
    }

    public boolean validThreadsNo() {
        boolean valid;
        int ThreadsNumber = 0;
        String D = Threadsno.getText();
        try {
            ThreadsNumber = Integer.parseInt(D);
            valid = true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a Valid Number.", "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        if (valid) {
            if (ThreadsNumber <= 0) {
                valid = false;
                JOptionPane.showMessageDialog(this, "Enter a valid Thread Number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return valid;
    }
    

    public boolean emptyField() {
        if (URL.getText().length() == 0 || Depth.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Empty field!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        URL = new javax.swing.JTextField();
        Depth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Threadsno = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(205, 205, 205));
        setLocation(new java.awt.Point(500, 250));

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 1, 30)); // NOI18N
        jLabel1.setText("Web Crawler");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Depth:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        URL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                URLFocusLost(evt);
            }
        });

        Depth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DepthFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("URL:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Threads no.");

        Threadsno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ThreadsnoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Depth, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(Threadsno)
                    .addComponent(URL))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(URL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Threadsno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Depth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        long time = 0;
        if (emptyField()) {
            error = false;
            error = validDepth();
            boolean B = validThreadsNo();
            if (error && B) {
                try {
                    ThreadsChecking thread=new ThreadsChecking(Integer.parseInt(Threadsno.getText()));
                    time = thread.validation.TimeCalculation(URL.getText(), Integer.parseInt(Depth.getText()));
                    while (((ThreadPoolExecutor) Checking.executor).getActiveCount() > 0) {
                        
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Checking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                Output out = new Output(URL.getText(), Checking.sitesNumber, (Checking.validSites - 1), Checking.invalidSites, ((time) / 1000.0));
                out.setVisible(true);
                this.hide();
                ThreadsChecking.validation.init();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ThreadsnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ThreadsnoFocusLost
        if (Threadsno.getText().length() > 0) {
            error = validThreadsNo();
            if (!error) {
                Threadsno.setText("");
                Threadsno.grabFocus();
            }
        }
    }//GEN-LAST:event_ThreadsnoFocusLost

    private void DepthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DepthFocusLost
        if (Depth.getText().length() > 0) {
            error = validDepth();
            if (!error) {
                Depth.setText("");
                Depth.grabFocus();
            }
        }
    }//GEN-LAST:event_DepthFocusLost

    private void URLFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_URLFocusLost
        if (URL.getText().length() > 0) {
            try {
                Document doc = Jsoup.connect(URL.getText()).get();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid URL", "Error", JOptionPane.ERROR_MESSAGE);
                URL.setText("");
                URL.grabFocus();
            }
        }
    }//GEN-LAST:event_URLFocusLost
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Depth;
    private javax.swing.JTextField Threadsno;
    private javax.swing.JTextField URL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
