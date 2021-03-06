/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lumen;

import javax.swing.JFrame;

/**
 *
 * @author Hanse
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
        setLocationRelativeTo(null);
        
        background2.setVisible(false);
        backward.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        About = new javax.swing.JPanel();
        burgerIcon = new javax.swing.JLabel();
        wotd = new javax.swing.JLabel();
        wotdLabel = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        helpLabel = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();
        sidebar = new javax.swing.JLabel();
        backward = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();
        forward = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lumen");
        setMaximumSize(new java.awt.Dimension(1540, 840));
        setMinimumSize(new java.awt.Dimension(1540, 840));
        setResizable(false);
        setSize(new java.awt.Dimension(1540, 840));
        getContentPane().setLayout(null);

        About.setAlignmentX(0.0F);
        About.setAlignmentY(0.0F);
        About.setMaximumSize(new java.awt.Dimension(1540, 840));
        About.setLayout(null);

        burgerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        burgerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2. Burger Icon.png"))); // NOI18N
        burgerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        burgerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                burgerIconMouseClicked(evt);
            }
        });
        About.add(burgerIcon);
        burgerIcon.setBounds(30, 30, 55, 38);

        wotd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wotd.png"))); // NOI18N
        wotd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wotd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wotdMouseClicked(evt);
            }
        });
        About.add(wotd);
        wotd.setBounds(30, 150, 56, 56);

        wotdLabel.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        wotdLabel.setForeground(new java.awt.Color(255, 255, 255));
        wotdLabel.setText("Word of the Day");
        wotdLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wotdLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wotdLabelMouseClicked(evt);
            }
        });
        About.add(wotdLabel);
        wotdLabel.setBounds(120, 160, 180, 30);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help.png"))); // NOI18N
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        About.add(help);
        help.setBounds(30, 264, 56, 56);

        helpLabel.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        helpLabel.setForeground(new java.awt.Color(255, 255, 255));
        helpLabel.setText("Help");
        helpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpLabelMouseClicked(evt);
            }
        });
        About.add(helpLabel);
        helpLabel.setBounds(120, 275, 50, 30);

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/about.png"))); // NOI18N
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        About.add(about);
        about.setBounds(30, 370, 56, 56);

        aboutLabel.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        aboutLabel.setForeground(new java.awt.Color(255, 255, 255));
        aboutLabel.setText("About");
        aboutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        About.add(aboutLabel);
        aboutLabel.setBounds(120, 386, 70, 20);

        sidebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1. About Sidebar.png"))); // NOI18N
        About.add(sidebar);
        sidebar.setBounds(0, 100, 380, 742);

        backward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5. About Backward.png"))); // NOI18N
        backward.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backward.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backwardMouseClicked(evt);
            }
        });
        About.add(backward);
        backward.setBounds(444, 730, 29, 43);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4. About Page II.png"))); // NOI18N
        background2.setAlignmentY(0.0F);
        About.add(background2);
        background2.setBounds(0, 0, 1540, 840);

        forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3. About Forward.png"))); // NOI18N
        forward.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forward.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forwardMouseClicked(evt);
            }
        });
        About.add(forward);
        forward.setBounds(1450, 730, 29, 43);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2. About Page I.png"))); // NOI18N
        background.setAlignmentY(0.0F);
        About.add(background);
        background.setBounds(0, 0, 1540, 840);

        getContentPane().add(About);
        About.setBounds(0, 0, 1540, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forwardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwardMouseClicked
        // TODO add your handling code here:
        background2.setVisible(true);
        backward.setVisible(true);
        background.setVisible(false);
        forward.setVisible(false);
    }//GEN-LAST:event_forwardMouseClicked

    private void backwardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backwardMouseClicked
        // TODO add your handling code here:
        background.setVisible(true);
        forward.setVisible(true);
        background2.setVisible(false);
        backward.setVisible(false);
    }//GEN-LAST:event_backwardMouseClicked

    private void wotdLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wotdLabelMouseClicked
        setVisible(false); 
        new WordofTheDay().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_wotdLabelMouseClicked

    private void wotdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wotdMouseClicked
        setVisible(false); 
        new WordofTheDay().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_wotdMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        setVisible(false); 
        new HelpFile().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_helpMouseClicked

    private void helpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpLabelMouseClicked
        setVisible(false); 
        new HelpFile().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_helpLabelMouseClicked

    private void burgerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burgerIconMouseClicked
        setVisible(false); 
        new UI().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_burgerIconMouseClicked

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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel About;
    private javax.swing.JLabel about;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel backward;
    private javax.swing.JLabel burgerIcon;
    private javax.swing.JLabel forward;
    private javax.swing.JLabel help;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JLabel sidebar;
    private javax.swing.JLabel wotd;
    private javax.swing.JLabel wotdLabel;
    // End of variables declaration//GEN-END:variables
}
