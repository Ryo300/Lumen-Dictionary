/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lumen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard David
 */
public class Login extends javax.swing.JFrame {
        Connection login;
        ResultSet rs;
        PreparedStatement pst;
        int attempts = 1;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        login = ConnectDB.connectLogin();
        
        username.setEditable(false);
        password.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        userIcon = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        passwordIcon = new javax.swing.JLabel();
        forgotPass = new javax.swing.JLabel();
        signIn = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lumen");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1540, 840));
        setMinimumSize(new java.awt.Dimension(1540, 840));
        setResizable(false);
        setSize(new java.awt.Dimension(1540, 840));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(1540, 840));
        jPanel1.setMinimumSize(new java.awt.Dimension(1540, 840));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("Fira Sans", 0, 28)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setText("Username");
        username.setBorder(null);
        username.setOpaque(false);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameMouseEntered(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(940, 350, 330, 60);

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/username.png"))); // NOI18N
        userIcon.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(userIcon);
        userIcon.setBounds(860, 350, 420, 60);

        password.setFont(new java.awt.Font("Fira Sans", 0, 28)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("password");
        password.setBorder(null);
        password.setOpaque(false);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(940, 440, 330, 60);

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        jPanel1.add(passwordIcon);
        passwordIcon.setBounds(860, 440, 421, 60);

        forgotPass.setFont(new java.awt.Font("Fira Sans", 0, 14)); // NOI18N
        forgotPass.setForeground(new java.awt.Color(255, 255, 255));
        forgotPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotPass.setText("Forgot your password?");
        forgotPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassMouseClicked(evt);
            }
        });
        jPanel1.add(forgotPass);
        forgotPass.setBounds(995, 530, 150, 20);

        signIn.setBackground(new java.awt.Color(255, 255, 255));
        signIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign-in.png"))); // NOI18N
        signIn.setBorder(null);
        signIn.setBorderPainted(false);
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn.setOpaque(false);
        signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInMouseClicked(evt);
            }
        });
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        jPanel1.add(signIn);
        signIn.setBounds(970, 560, 200, 50);

        signUp.setBackground(new java.awt.Color(255, 255, 255));
        signUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign-up.png"))); // NOI18N
        signUp.setBorder(null);
        signUp.setBorderPainted(false);
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.setOpaque(false);
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel1.add(signUp);
        signUp.setBounds(110, 470, 350, 110);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        background.setText("jLabel1");
        background.setAlignmentY(0.0F);
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background.setMaximumSize(new java.awt.Dimension(1540, 840));
        background.setMinimumSize(new java.awt.Dimension(1540, 840));
        background.setPreferredSize(new java.awt.Dimension(1540, 840));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundMouseEntered(evt);
            }
        });
        jPanel1.add(background);
        background.setBounds(0, 0, 1540, 840);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
    username.setEditable(true);
    username.setText("");
    username.setForeground(new java.awt.Color(0, 0, 0));    // TODO add your handling code here:
    }//GEN-LAST:event_usernameMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
            // TODO add your handling code here:
    }//GEN-LAST:event_backgroundMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void backgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundMouseEntered

    private void usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseEntered
    username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));        // TODO add your handling code here:
    }//GEN-LAST:event_usernameMouseEntered

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpActionPerformed

    private void signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseClicked
       
       
       if (attempts <= 3){
       limit();
       attempts++;
       }
       
       if (attempts > 3) {
         
           JOptionPane.showMessageDialog(null, "Login limit reached, please restart application!", "Lumen", JOptionPane.ERROR_MESSAGE); 
       }
        
    // TODO add your handling code here:
    }//GEN-LAST:event_signInMouseClicked

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        new Register().setVisible(true);
        this.setVisible(false);
    // TODO add your handling code here:
    }//GEN-LAST:event_signUpMouseClicked

    private void forgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassMouseClicked
        this.setVisible(false);
        new Reset().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_forgotPassMouseClicked

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        if(evt.getKeyCode()== evt.VK_TAB){
           password.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_usernameKeyPressed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setEditable(true);
        password.setText(""); 
        password.setForeground(new java.awt.Color(0, 0, 0));
// TODO add your handling code here:
    }//GEN-LAST:event_passwordMouseClicked

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
             if(evt.getKeyCode()== evt.VK_TAB){
           username.setText("");
           password.setText("");
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if(evt.getKeyCode()== evt.VK_ENTER) {
            limit();
           
        }        // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyPressed

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        
    }//GEN-LAST:event_passwordKeyTyped

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
      //username.setText("");
    }//GEN-LAST:event_usernameFocusGained
    
    public void limit() {
       try {
        String usernameCheck = "SELECT Username, Password FROM Login where Username = ? AND Password = ?";
            pst = login.prepareStatement(usernameCheck);
            pst.setString(1, username.getText());
            pst.setString(2, password.getText());
             rs   = pst.executeQuery();
             String dumpa = rs.getString(1);
             String dumpb = rs.getString(2);
               
                setVisible(false);
                new UI().setVisible(true);  
        }  
        
        catch(Exception e){ 
            
            JOptionPane.showMessageDialog(null, "Incorrect credentials!", "Lumen", JOptionPane.ERROR_MESSAGE); 
        }   
        } 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel forgotPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JButton signIn;
    private javax.swing.JButton signUp;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
