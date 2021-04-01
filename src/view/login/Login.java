/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

import view.Funcionario.Prin_funcionario;
import view.Gerente.Prin_gerente;
import dao.FuncionarioDAO;
import view.PopUp.PopUp_Erro_login;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.UIManager;

    
public class Login extends javax.swing.JFrame {
    
    
    public Login() {
        
        initComponents();
         setBackground(new Color(255,255,255,0));
             seticon();
             Usuario.setBackground(new Color(255,255,255,0));
             senha.setBackground(new Color(255,255,255,0));
    }
    
    public void limpar(){
        Usuario.setText("");
        senha.setText(""); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        Usuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        limpar = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        titulo_usuario = new javax.swing.JLabel();
        titulo_senha = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Fechar = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Principal.setBackground(new java.awt.Color(0, 0, 0));
        Principal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PrincipalMouseDragged(evt);
            }
        });
        Principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrincipalMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrincipalMousePressed(evt);
            }
        });
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setBackground(new java.awt.Color(0, 0, 0));
        Usuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 255, 255));
        Usuario.setToolTipText("Insira seu nome de usuário");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShadowOpacity(1.0F);
        dropShadowBorder1.setShadowSize(10);
        Usuario.setBorder(dropShadowBorder1);
        Usuario.setOpaque(false);
        Principal.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 246, 51));

        senha.setBackground(new java.awt.Color(0, 0, 0));
        senha.setFont(new java.awt.Font("Yu Gothic UI", 1, 10)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 0, 0));
        senha.setToolTipText("Insira sua senha");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowOpacity(1.0F);
        dropShadowBorder2.setShadowSize(10);
        senha.setBorder(dropShadowBorder2);
        senha.setOpaque(false);
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        Principal.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 246, 51));

        limpar.setBackground(new java.awt.Color(255, 0, 0));
        limpar.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        limpar.setForeground(new java.awt.Color(255, 255, 255));
        limpar.setText("Limpar");
        limpar.setToolTipText("Limpar os campos");
        limpar.setBorder(null);
        limpar.setContentAreaFilled(false);
        limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpar.setOpaque(true);
        limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limparMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                limparMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                limparMouseReleased(evt);
            }
        });
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        limpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                limparKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                limparKeyReleased(evt);
            }
        });
        Principal.add(limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 300, 60));

        enviar.setBackground(new java.awt.Color(255, 0, 0));
        enviar.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("Enviar");
        enviar.setToolTipText("Enviar seus dados");
        enviar.setBorder(null);
        enviar.setContentAreaFilled(false);
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.setOpaque(true);
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                enviarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                enviarMouseReleased(evt);
            }
        });
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        enviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enviarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enviarKeyReleased(evt);
            }
        });
        Principal.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 300, 60));

        titulo_usuario.setBackground(new java.awt.Color(255, 255, 255));
        titulo_usuario.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        titulo_usuario.setForeground(new java.awt.Color(255, 255, 255));
        titulo_usuario.setText("Usuário:");
        Principal.add(titulo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        titulo_senha.setBackground(new java.awt.Color(255, 255, 255));
        titulo_senha.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        titulo_senha.setForeground(new java.awt.Color(255, 255, 255));
        titulo_senha.setText("Senha:");
        Principal.add(titulo_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nova_logo.png"))); // NOI18N
        Principal.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 360, 230));

        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-delete-24 (1).png"))); // NOI18N
        Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FecharMouseExited(evt);
            }
        });
        Principal.add(Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 0, 30, -1));

        kGradientPanel1.setEndColor(new java.awt.Color(0, 255, 255));
        kGradientPanel1.setStartColor(new java.awt.Color(255, 0, 0));
        Principal.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseEntered
      
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(0,0,0));
        dropShadowBorder2.setShadowOpacity(1.0F);
        dropShadowBorder2.setShadowSize(5);
        enviar.setBorder(dropShadowBorder2);
    }//GEN-LAST:event_enviarMouseEntered

    private void enviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseExited
 
        enviar.setBorder(null);
    }//GEN-LAST:event_enviarMouseExited

    private void enviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMousePressed
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(0,0,0));
        dropShadowBorder2.setShadowOpacity(1.0F);
        dropShadowBorder2.setShadowSize(10);
        enviar.setBorder(dropShadowBorder2);
    }//GEN-LAST:event_enviarMousePressed

    private void enviarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseReleased
 enviar.setBorder(null);
    }//GEN-LAST:event_enviarMouseReleased

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(0,0,0));
        dropShadowBorder2.setShadowOpacity(1.0F);
        dropShadowBorder2.setShadowSize(10);
        enviar.setBorder(dropShadowBorder2);
  //------------Código de ação começa aqui------------------------------------
    FuncionarioDAO dao = new FuncionarioDAO();
  
     if(Usuario.getText().toLowerCase().equals("admin")&& new String (senha.getPassword()).equals("1234")){
         
            Prin_gerente p = new Prin_gerente();
            this.dispose();
            p.setVisible(true);
     
     } else if(dao.checkLogin(Usuario.getText(), new String (senha.getPassword()))){
            Prin_funcionario f = new Prin_funcionario();
            
            System.setProperty("login", Usuario.getText());
            
            this.dispose();
            f.setVisible(true);   
            
     }
     else{
            view.PopUp.PopUp_Erro_login pop= new PopUp_Erro_login();   
             pop.setVisible(true);
     }
     
    }//GEN-LAST:event_enviarActionPerformed

    private void enviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enviarKeyPressed
        if (evt.getKeyCode() == 10) {
            org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
            dropShadowBorder2.setShadowColor(new java.awt.Color(0,0,0));
            dropShadowBorder2.setShadowOpacity(1.0F);
            dropShadowBorder2.setShadowSize(5);
            enviar.setBorder(dropShadowBorder2);
        }

    }//GEN-LAST:event_enviarKeyPressed

    private void enviarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enviarKeyReleased
    enviar.setBorder(null);
    }//GEN-LAST:event_enviarKeyReleased

    private void PrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalMouseEntered

    }//GEN-LAST:event_PrincipalMouseEntered

    private void PrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalMousePressed

    }//GEN-LAST:event_PrincipalMousePressed

    private void PrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalMouseDragged

    }//GEN-LAST:event_PrincipalMouseDragged

    private void FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseClicked
     dispose();
    }//GEN-LAST:event_FecharMouseClicked

    private void FecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseEntered
               Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-delete-24 (1) - Copia.png" )));

    }//GEN-LAST:event_FecharMouseEntered

    private void FecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseExited
         Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-delete-24 (1).png")));
    }//GEN-LAST:event_FecharMouseExited

    private void limparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparMouseEntered
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(0,0,0));
        dropShadowBorder2.setShadowOpacity(1.0F);
        dropShadowBorder2.setShadowSize(5);
        limpar.setBorder(dropShadowBorder2);
    }//GEN-LAST:event_limparMouseEntered

    private void limparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparMouseExited

        limpar.setBorder(null);
    }//GEN-LAST:event_limparMouseExited

    private void limparMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparMousePressed
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(0,0,0));
        dropShadowBorder2.setShadowOpacity(1.0F);
        dropShadowBorder2.setShadowSize(10);
        limpar.setBorder(dropShadowBorder2);
    }//GEN-LAST:event_limparMousePressed

    private void limparMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limparMouseReleased

        limpar.setBorder(null);
    }//GEN-LAST:event_limparMouseReleased

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        this.limpar();
    }//GEN-LAST:event_limparActionPerformed

    private void limparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limparKeyPressed
        if (evt.getKeyCode() == 8) {
            org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
            dropShadowBorder2.setShadowColor(new java.awt.Color(0,0,0));
            dropShadowBorder2.setShadowOpacity(1.0F);
            dropShadowBorder2.setShadowSize(5);
            limpar.setBorder(dropShadowBorder2);

        }
    }//GEN-LAST:event_limparKeyPressed

    private void limparKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limparKeyReleased
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(0,0,0));
        dropShadowBorder2.setShadowOpacity(1.0F);
        dropShadowBorder2.setShadowSize(10);
        limpar.setBorder(dropShadowBorder2);
    }//GEN-LAST:event_limparKeyReleased

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
    private javax.swing.JLabel Fechar;
    public static javax.swing.JPanel Principal;
    public static javax.swing.JTextField Usuario;
    public static javax.swing.JButton enviar;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton limpar;
    private javax.swing.JLabel logo;
    public static javax.swing.JPasswordField senha;
    private javax.swing.JLabel titulo_senha;
    private javax.swing.JLabel titulo_usuario;
    // End of variables declaration//GEN-END:variables
        private void seticon(){
                setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Nova_logo.png")));
    
    }
    
}