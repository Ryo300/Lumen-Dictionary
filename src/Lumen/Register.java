package Lumen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan SB
 */
public class Register extends javax.swing.JFrame {
        Connection login;
        ResultSet rs;
        PreparedStatement pst;
    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
        captchaGen();
        setLocationRelativeTo(null);
        login = ConnectDB.connectLogin();
        
        nameField.setEditable(false);
        eMailField.setEditable(false);
        usernameField.setEditable(false);
        passwordField.setEditable(false);
        verifyField.setEditable(false);
        captchaField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        message = new javax.swing.JLabel();
        regisDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        regisDialogButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        eMailLabel = new javax.swing.JLabel();
        eMailField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        verifyLabel = new javax.swing.JLabel();
        verifyField = new javax.swing.JPasswordField();
        captchaLabel = new javax.swing.JLabel();
        captchaField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        signInButton = new javax.swing.JButton();
        captchaGenLabel = new javax.swing.JLabel();
        captchaGenField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        messagea = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();

        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        regisDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        regisDialog.setMinimumSize(new java.awt.Dimension(370, 250));
        regisDialog.getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(47, 47, 47));
        jPanel2.setMinimumSize(new java.awt.Dimension(354, 194));
        jPanel2.setLayout(null);

        regisDialogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign-in.png"))); // NOI18N
        regisDialogButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regisDialogButtonMouseClicked(evt);
            }
        });
        jPanel2.add(regisDialogButton);
        regisDialogButton.setBounds(80, 110, 210, 60);

        jLabel2.setFont(new java.awt.Font("Fira Sans", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registration success!");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 20, 270, 50);

        regisDialog.getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 360, 190);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");
        setBackground(new java.awt.Color(47, 47, 47));
        setMinimumSize(new java.awt.Dimension(530, 660));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(47, 47, 47));
        jPanel1.setMinimumSize(new java.awt.Dimension(530, 660));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 660));
        jPanel1.setLayout(null);

        eMailLabel.setBackground(new java.awt.Color(211, 211, 211));
        eMailLabel.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        eMailLabel.setForeground(new java.awt.Color(255, 255, 255));
        eMailLabel.setText("E-Mail");
        eMailLabel.setMaximumSize(new java.awt.Dimension(40, 20));
        eMailLabel.setMinimumSize(new java.awt.Dimension(40, 20));
        eMailLabel.setPreferredSize(new java.awt.Dimension(40, 20));
        jPanel1.add(eMailLabel);
        eMailLabel.setBounds(30, 100, 110, 30);

        eMailField.setForeground(new java.awt.Color(153, 153, 153));
        eMailField.setText("Enter E-Mail");
        eMailField.setBorder(null);
        eMailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMailFieldMouseClicked(evt);
            }
        });
        eMailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eMailFieldKeyPressed(evt);
            }
        });
        jPanel1.add(eMailField);
        eMailField.setBounds(250, 100, 250, 30);

        usernameLabel.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");
        usernameLabel.setFocusable(false);
        usernameLabel.setMaximumSize(new java.awt.Dimension(60, 13));
        usernameLabel.setMinimumSize(new java.awt.Dimension(60, 13));
        usernameLabel.setPreferredSize(new java.awt.Dimension(60, 13));
        jPanel1.add(usernameLabel);
        usernameLabel.setBounds(30, 160, 150, 30);

        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setText("Enter Username");
        usernameField.setBorder(null);
        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameFieldMouseClicked(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
        });
        jPanel1.add(usernameField);
        usernameField.setBounds(250, 160, 250, 30);

        passwordLabel.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");
        passwordLabel.setMaximumSize(new java.awt.Dimension(60, 13));
        passwordLabel.setMinimumSize(new java.awt.Dimension(60, 13));
        passwordLabel.setPreferredSize(new java.awt.Dimension(60, 13));
        jPanel1.add(passwordLabel);
        passwordLabel.setBounds(30, 220, 150, 30);

        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("password");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(passwordField);
        passwordField.setBounds(250, 220, 250, 30);

        verifyLabel.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        verifyLabel.setForeground(new java.awt.Color(255, 255, 255));
        verifyLabel.setText("Verify Password");
        verifyLabel.setMaximumSize(new java.awt.Dimension(100, 13));
        verifyLabel.setMinimumSize(new java.awt.Dimension(100, 13));
        verifyLabel.setPreferredSize(new java.awt.Dimension(100, 13));
        jPanel1.add(verifyLabel);
        verifyLabel.setBounds(30, 280, 140, 30);

        verifyField.setForeground(new java.awt.Color(153, 153, 153));
        verifyField.setText("password");
        verifyField.setBorder(null);
        verifyField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verifyFieldMouseClicked(evt);
            }
        });
        verifyField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                verifyFieldKeyPressed(evt);
            }
        });
        jPanel1.add(verifyField);
        verifyField.setBounds(250, 280, 250, 30);

        captchaLabel.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        captchaLabel.setForeground(new java.awt.Color(255, 255, 255));
        captchaLabel.setText("Enter CAPTCHA");
        jPanel1.add(captchaLabel);
        captchaLabel.setBounds(30, 400, 160, 30);

        captchaField.setForeground(new java.awt.Color(153, 153, 153));
        captchaField.setText("Enter CAPTCHA");
        captchaField.setBorder(null);
        captchaField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                captchaFieldMouseClicked(evt);
            }
        });
        captchaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                captchaFieldKeyPressed(evt);
            }
        });
        jPanel1.add(captchaField);
        captchaField.setBounds(250, 400, 250, 30);

        registerButton.setBackground(new java.awt.Color(255, 255, 255));
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup_button(signup).png"))); // NOI18N
        registerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registerButton.setBorderPainted(false);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.setOpaque(false);
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton);
        registerButton.setBounds(150, 460, 210, 80);

        signInButton.setBackground(new java.awt.Color(255, 255, 255));
        signInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signin_button(singup).png"))); // NOI18N
        signInButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signInButton.setBorderPainted(false);
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButton.setOpaque(false);
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInButtonMouseClicked(evt);
            }
        });
        jPanel1.add(signInButton);
        signInButton.setBounds(150, 570, 210, 50);

        captchaGenLabel.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        captchaGenLabel.setForeground(new java.awt.Color(255, 255, 255));
        captchaGenLabel.setText("CAPTCHA");
        jPanel1.add(captchaGenLabel);
        captchaGenLabel.setBounds(30, 340, 150, 30);

        captchaGenField.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        captchaGenField.setForeground(new java.awt.Color(153, 153, 153));
        captchaGenField.setBorder(null);
        captchaGenField.setEnabled(false);
        captchaGenField.setFocusable(false);
        jPanel1.add(captchaGenField);
        captchaGenField.setBounds(250, 340, 250, 30);

        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Already have an account?");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 540, 140, 20);

        messagea.setEditable(false);
        messagea.setBackground(new java.awt.Color(47, 47, 47));
        messagea.setFont(new java.awt.Font("Fira Sans", 0, 14)); // NOI18N
        messagea.setForeground(new java.awt.Color(255, 255, 255));
        messagea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        messagea.setBorder(null);
        messagea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageaActionPerformed(evt);
            }
        });
        jPanel1.add(messagea);
        messagea.setBounds(90, 440, 370, 30);

        nameLabel.setBackground(new java.awt.Color(211, 211, 211));
        nameLabel.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");
        nameLabel.setMaximumSize(new java.awt.Dimension(40, 20));
        nameLabel.setMinimumSize(new java.awt.Dimension(40, 20));
        nameLabel.setPreferredSize(new java.awt.Dimension(40, 20));
        jPanel1.add(nameLabel);
        nameLabel.setBounds(30, 40, 110, 30);

        nameField.setForeground(new java.awt.Color(153, 153, 153));
        nameField.setText("Enter Name");
        nameField.setBorder(null);
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameFieldKeyPressed(evt);
            }
        });
        jPanel1.add(nameField);
        nameField.setBounds(250, 40, 250, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 660);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        char[] password1 = passwordField.getPassword();
        char[] password2 = verifyField.getPassword();
        char[] captcha1 = captchaGenField.getText().toCharArray();
        char[] captcha2 = captchaField.getText().toCharArray();
        if(!Arrays.equals(password1, password2)) {
                 JOptionPane.showMessageDialog(null, "Password does not match, please double-check", "Lumen", JOptionPane.INFORMATION_MESSAGE);   
                //messagea.setText("Password does not match, please double-check");
        } else if (nameField.getText().equals("") || nameField.getText().equals("Enter Name")) {
            JOptionPane.showMessageDialog(null, "Please enter your name!", "Lumen", JOptionPane.INFORMATION_MESSAGE); 
        }
        else if (eMailField.getText().equals("") || eMailField.getText().equals("Enter E-Mail")) {
            JOptionPane.showMessageDialog(null, "Please enter your E-Mail!", "Lumen", JOptionPane.INFORMATION_MESSAGE); 
        }
        else if (usernameField.getText().equals("") || usernameField.getText().equals("Enter Username")) {
            JOptionPane.showMessageDialog(null, "Please enter your username!", "Lumen", JOptionPane.INFORMATION_MESSAGE); 
        }
        else if (passwordField.getText().equals("") || passwordField.getText().equals("password")) {
            JOptionPane.showMessageDialog(null, "Please enter your password!", "Lumen", JOptionPane.INFORMATION_MESSAGE); 
        }
        
        else if (!Arrays.equals(captcha1, captcha2)) {
                JOptionPane.showMessageDialog(null, "CAPTCHA does not match, please double-check", "Lumen", JOptionPane.INFORMATION_MESSAGE);
            //messagea.setText("Captcha does not match, please try again");
        }
        else {
            
              //messagea.setText("Success!");
             //regisDialog.setLocationRelativeTo(null);
             //regisDialog.setVisible(true);
          
             new Login().setVisible(true);
        }
        captchaGen();
        
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void eMailFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMailFieldMouseClicked
        eMailField.setEditable(true);
        eMailField.setText("");  
        eMailField.setForeground(new java.awt.Color(0, 0, 0));
// TODO add your handling code here:
    }//GEN-LAST:event_eMailFieldMouseClicked

    private void usernameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMouseClicked
        usernameField.setEditable(true);
        usernameField.setText("");
        usernameField.setForeground(new java.awt.Color(0, 0, 0));  
// TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldMouseClicked

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        passwordField.setEditable(true);
        passwordField.setText("");
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
// TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void captchaFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_captchaFieldMouseClicked
        captchaField.setEditable(true);
        captchaField.setText("");
        captchaField.setForeground(new java.awt.Color(0, 0, 0));
// TODO add your handling code here:
    }//GEN-LAST:event_captchaFieldMouseClicked

    private void verifyFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifyFieldMouseClicked
        verifyField.setEditable(true);
        verifyField.setText("");
        verifyField.setForeground(new java.awt.Color(0, 0, 0));
// TODO add your handling code here:
    }//GEN-LAST:event_verifyFieldMouseClicked

    private void regisDialogButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisDialogButtonMouseClicked
    regisDialog.setVisible(false);
     setVisible(false);
     // TODO add your handling code here:
    }//GEN-LAST:event_regisDialogButtonMouseClicked

    private void signInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseClicked
        setVisible(false);
        new Login().setVisible(true);
    // TODO add your handling code here:
    }//GEN-LAST:event_signInButtonMouseClicked

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        nameField.setEditable(true);
        nameField.setText("");       
        nameField.setForeground(new java.awt.Color(0, 0, 0));
// TODO add your handling code here:
    }//GEN-LAST:event_nameFieldMouseClicked

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void messageaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageaActionPerformed

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
       
        try {
        String usernameCheck = "SELECT Username, [E-Mail] FROM Login where Username = ? AND [E-Mail] = ?";
            pst = login.prepareStatement(usernameCheck);
            pst.setString(1, usernameField.getText());
            pst.setString(2, eMailField.getText());
             rs   = pst.executeQuery();
           //  rs   = stmt.executeQuery(abdicationDfn);
              if ((rs.getString(1).equals(usernameField.getText()))){
                  JOptionPane.showMessageDialog(null, "Username already registered!", "Lumen", JOptionPane.INFORMATION_MESSAGE);  
              return;
              }
              if ((rs.getString(2).equals(eMailField.getText()))){
                  JOptionPane.showMessageDialog(null, "E-Mail already registered!", "Lumen", JOptionPane.INFORMATION_MESSAGE);  
              return;
              }
        
        }  catch(Exception e){
               int result = JOptionPane.showConfirmDialog(null, "By registering, you have given consent for Lumen to make use of your data for application functionality purposes. Your data will be treated confidentially.", "Lumen", JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Registration successful!", "Lumen", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                    }else if (result == JOptionPane.NO_OPTION){
                         JOptionPane.showMessageDialog(null, "Registration cancelled!", "Lumen", JOptionPane.INFORMATION_MESSAGE);
                         setVisible(false);
                         return;
                         
                    }
            //JOptionPane.showMessageDialog(null, "Sorry, we are unable to create your account. Please try again!", "Lumen", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }
        
         
        
        
        try {
            
             
            
            String register = "INSERT INTO Login(Name, Username, [E-Mail], Password) VALUES(?,?,?,?)";
            pst = login.prepareStatement(register);
            pst.setString(1, nameField.getText());
            pst.setString(2, usernameField.getText());
            pst.setString(3, eMailField.getText());
            pst.setString(4, passwordField.getText());
            pst.executeUpdate();
           //  rs   = stmt.executeQuery(abdicationDfn);
              //res.setText(rs.getString(1));
             //JOptionPane.showMessageDialog(null, "Registration successful!", "Lumen", JOptionPane.INFORMATION_MESSAGE);  
              
        } 
            catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
            //JOptionPane.showMessageDialog(null, "Sorry, we are unable to create your account. Please try again!", "Lumen", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonMouseClicked

    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyPressed
                if(evt.getKeyCode()== evt.VK_TAB){
                   eMailField.setText("");
                }
    }//GEN-LAST:event_nameFieldKeyPressed

    private void eMailFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eMailFieldKeyPressed
        if(evt.getKeyCode()== evt.VK_TAB){
                    usernameField.setText("");// TODO add your handling code here:
    }             // TODO add your handling code here:
    }//GEN-LAST:event_eMailFieldKeyPressed

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        if(evt.getKeyCode()== evt.VK_TAB){
                    passwordField.setText("");// TODO add your handling code here:
    }            // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
          if(evt.getKeyCode()== evt.VK_TAB){
                    verifyField.setText("");// TODO add your handling code here:
    }          // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void verifyFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verifyFieldKeyPressed
        if(evt.getKeyCode()== evt.VK_TAB){
                    captchaField.setText("");// TODO add your handling code here:
    }               // TODO add your handling code here:
    }//GEN-LAST:event_verifyFieldKeyPressed

    private void captchaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_captchaFieldKeyPressed
                   // TODO add your handling code here:
    }//GEN-LAST:event_captchaFieldKeyPressed

    private void captchaGen() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
 
        String generatedString = random.ints(leftLimit, rightLimit + 1)
            .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
        
        captchaGenField.setText(generatedString);
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField captchaField;
    private javax.swing.JTextField captchaGenField;
    private javax.swing.JLabel captchaGenLabel;
    private javax.swing.JLabel captchaLabel;
    private javax.swing.JTextField eMailField;
    private javax.swing.JLabel eMailLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel message;
    private javax.swing.JTextField messagea;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JDialog regisDialog;
    private javax.swing.JLabel regisDialogButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton signInButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPasswordField verifyField;
    private javax.swing.JLabel verifyLabel;
    // End of variables declaration//GEN-END:variables
}
