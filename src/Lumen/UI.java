/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lumen;

/**
 *
 * @author Richard David
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        burger = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        wotd = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        wotdLabel = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();
        helpLabel = new javax.swing.JLabel();
        sidebar = new javax.swing.JLabel();
        blurBg = new javax.swing.JLabel();
        translate = new javax.swing.JLabel();
        define = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        UIbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lumen");
        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(1540, 840));
        setMinimumSize(new java.awt.Dimension(1540, 840));
        setResizable(false);
        setSize(new java.awt.Dimension(1540, 840));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        burger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2. Burger Icon.png"))); // NOI18N
        burger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        burger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                burgerMouseClicked(evt);
            }
        });
        jPanel2.add(burger);
        burger.setBounds(30, 20, 60, 60);

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/about.png"))); // NOI18N
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jPanel2.add(about);
        about.setBounds(30, 330, 56, 60);

        wotd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wotd.png"))); // NOI18N
        wotd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wotd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wotdMouseClicked(evt);
            }
        });
        jPanel2.add(wotd);
        wotd.setBounds(30, 150, 50, 56);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help.png"))); // NOI18N
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        jPanel2.add(help);
        help.setBounds(30, 240, 56, 60);

        wotdLabel.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        wotdLabel.setForeground(new java.awt.Color(255, 255, 255));
        wotdLabel.setText("Word of the Day");
        wotdLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wotdLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wotdLabelMouseClicked(evt);
            }
        });
        jPanel2.add(wotdLabel);
        wotdLabel.setBounds(120, 150, 190, 60);

        aboutLabel.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        aboutLabel.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel.setText("About");
        aboutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutLabelMouseClicked(evt);
            }
        });
        jPanel2.add(aboutLabel);
        aboutLabel.setBounds(120, 330, 190, 60);

        helpLabel.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        helpLabel.setForeground(new java.awt.Color(255, 255, 255));
        helpLabel.setText("Help");
        helpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpLabelMouseClicked(evt);
            }
        });
        jPanel2.add(helpLabel);
        helpLabel.setBounds(120, 240, 190, 60);

        sidebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sidebar.png")));
        jPanel2.add(sidebar);
        sidebar.setBounds(0, 100, 380, 740);
        sidebar.setVisible(false);
        wotd.setVisible(false);

        help.setVisible(false);
        about.setVisible(false);
        wotdLabel.setVisible(false);

        helpLabel.setVisible(false);
        aboutLabel.setVisible(false);

        blurBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blur.png")));
        blurBg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        blurBg.setMaximumSize(new java.awt.Dimension(1540, 840));
        blurBg.setMinimumSize(new java.awt.Dimension(1540, 840));
        blurBg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                blurBgMouseEntered(evt);
            }
        });
        jPanel2.add(blurBg);
        blurBg.setBounds(0, 0, 1540, 840);
        blurBg.setVisible(false);

        translate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4. Translate Button.png"))); // NOI18N
        translate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        translate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                translateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                translateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                translateMouseExited(evt);
            }
        });
        jPanel2.add(translate);
        translate.setBounds(920, 370, 430, 170);

        define.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3. Define Button.png"))); // NOI18N
        define.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        define.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                defineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                defineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                defineMouseExited(evt);
            }
        });
        jPanel2.add(define);
        define.setBounds(920, 160, 430, 160);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5. Exit Button.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(920, 580, 430, 170);

        UIbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ui.png"))); // NOI18N
        UIbg.setAlignmentY(0.0F);
        jPanel2.add(UIbg);
        UIbg.setBounds(0, 0, 1540, 840);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1580, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void burgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burgerMouseClicked
        if (sidebar.isVisible()) {
            sidebar.setVisible(false);
            blurBg.setVisible(false);
            wotd.setVisible(false);
            help.setVisible(false);
            about.setVisible(false);
            wotdLabel.setVisible(false);
            helpLabel.setVisible(false);
            aboutLabel.setVisible(false);
        } else {
            sidebar.setVisible(true);
            blurBg.setVisible(true);
            wotd.setVisible(true);
            
            help.setVisible(true);
            about.setVisible(true);
            wotdLabel.setVisible(true);
            helpLabel.setVisible(true);
            aboutLabel.setVisible(true);
        }
              // TODO add your handling code here:
    }//GEN-LAST:event_burgerMouseClicked

    private void defineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defineMouseClicked
       setVisible(false);
       new Define().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_defineMouseClicked

    private void translateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_translateMouseClicked
        setVisible(false);
        new Translate().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_translateMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        setVisible(false);
        new Login().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void wotdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wotdMouseClicked
        setVisible(false);
        new WordofTheDay().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_wotdMouseClicked

    private void wotdLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wotdLabelMouseClicked
        setVisible(false);
        new WordofTheDay().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_wotdLabelMouseClicked

    private void helpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpLabelMouseClicked
        setVisible(false); 
        new HelpFile().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_helpLabelMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        setVisible(false); 
        new HelpFile().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_helpMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        setVisible(false); 
        new About().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMouseClicked

    private void aboutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseClicked
        setVisible(false); 
        new About().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_aboutLabelMouseClicked

    private void defineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defineMouseEntered
        define.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/img/dfnhover.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_defineMouseEntered

    private void blurBgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blurBgMouseEntered
                // TODO add your handling code here:
    }//GEN-LAST:event_blurBgMouseEntered

    private void translateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_translateMouseEntered
        translate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transhover.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_translateMouseEntered

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exithover.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseEntered

    private void translateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_translateMouseExited
               translate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4. Translate Button.png")));     // TODO add your handling code here:
    }//GEN-LAST:event_translateMouseExited

    private void defineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defineMouseExited
         define.setIcon(new javax.swing.ImageIcon(getClass().
                 getResource("/img/3. Define Button.png")));         // TODO add your handling code here:
    }//GEN-LAST:event_defineMouseExited

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
         exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5. Exit Button.png")));            // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseExited

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UIbg;
    private javax.swing.JLabel about;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel blurBg;
    private javax.swing.JLabel burger;
    private javax.swing.JLabel define;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel help;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel sidebar;
    private javax.swing.JLabel translate;
    private javax.swing.JLabel wotd;
    private javax.swing.JLabel wotdLabel;
    // End of variables declaration//GEN-END:variables
}
