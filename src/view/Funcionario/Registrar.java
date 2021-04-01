package view.Funcionario;

import model.Cliente;
import model.Funcionario;
import dao.FuncionarioDAO;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JPanel {

    public Registrar() {
        initComponents();
        
    }
    
    public void limpar(){
        data_nasc.setText(null);
        email.setText(null);
        cpf.setText(null);
        rg.setText(null);
        cnh.setText(null);
        estado.setText(null);
        cidade.setText(null);
        nome_completo.setText(null);
        telefone.setText(null);
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
        titulo_nome = new javax.swing.JLabel();
        nome_completo = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        titulo_estado = new javax.swing.JLabel();
        titulo_cnh = new javax.swing.JLabel();
        titulo_cpf = new javax.swing.JLabel();
        titulo_data_nasc = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        titulo_email = new javax.swing.JLabel();
        cnh = new javax.swing.JFormattedTextField();
        data_nasc = new javax.swing.JFormattedTextField();
        cpf = new javax.swing.JFormattedTextField();
        rg = new javax.swing.JFormattedTextField();
        titulo_telefone = new javax.swing.JLabel();
        titulo_rg = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        titulo_cidade = new javax.swing.JLabel();
        telefone = new javax.swing.JFormattedTextField();
        esquerd_panel = new javax.swing.JPanel();
        titul0 = new javax.swing.JLabel();
        limpar1 = new javax.swing.JButton();
        enviar1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(682, 600));

        Principal.setBackground(new java.awt.Color(0, 0, 0));
        Principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrincipalMouseEntered(evt);
            }
        });
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_nome.setBackground(new java.awt.Color(0, 255, 255));
        titulo_nome.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_nome.setForeground(new java.awt.Color(255, 255, 255));
        titulo_nome.setText("Nome completo:");
        Principal.add(titulo_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        nome_completo.setBackground(new java.awt.Color(0, 0, 0));
        nome_completo.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        nome_completo.setForeground(new java.awt.Color(0, 255, 255));
        nome_completo.setToolTipText("Insira seu nome completo");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShadowColor(new java.awt.Color(250, 0, 0));
        dropShadowBorder1.setShadowOpacity(1.0F);
        dropShadowBorder1.setShadowSize(10);
        nome_completo.setBorder(dropShadowBorder1);
        Principal.add(nome_completo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 246, 51));

        estado.setBackground(new java.awt.Color(0, 0, 0));
        estado.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(0, 255, 255));
        estado.setToolTipText("Crie seu nome de usuário");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(250, 0, 0));
        dropShadowBorder2.setShadowOpacity(1.0F);
        dropShadowBorder2.setShadowSize(10);
        estado.setBorder(dropShadowBorder2);
        Principal.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 246, 51));

        titulo_estado.setBackground(new java.awt.Color(0, 255, 255));
        titulo_estado.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_estado.setForeground(new java.awt.Color(255, 255, 255));
        titulo_estado.setText("Estado:");
        Principal.add(titulo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        titulo_cnh.setBackground(new java.awt.Color(0, 255, 255));
        titulo_cnh.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_cnh.setForeground(new java.awt.Color(255, 255, 255));
        titulo_cnh.setText("CNH:");
        Principal.add(titulo_cnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 50, -1));

        titulo_cpf.setBackground(new java.awt.Color(0, 255, 255));
        titulo_cpf.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_cpf.setForeground(new java.awt.Color(255, 255, 255));
        titulo_cpf.setText("CPF:");
        Principal.add(titulo_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        titulo_data_nasc.setBackground(new java.awt.Color(0, 255, 255));
        titulo_data_nasc.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_data_nasc.setForeground(new java.awt.Color(255, 255, 255));
        titulo_data_nasc.setText("Data de Nascimento:");
        Principal.add(titulo_data_nasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        email.setBackground(new java.awt.Color(0, 0, 0));
        email.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(0, 255, 255));
        email.setToolTipText("Insira aqui seu Email");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShadowColor(new java.awt.Color(250, 0, 0));
        dropShadowBorder3.setShadowOpacity(1.0F);
        dropShadowBorder3.setShadowSize(10);
        email.setBorder(dropShadowBorder3);
        Principal.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 246, 51));

        titulo_email.setBackground(new java.awt.Color(0, 255, 255));
        titulo_email.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_email.setForeground(new java.awt.Color(255, 255, 255));
        titulo_email.setText("Email:");
        Principal.add(titulo_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        cnh.setBackground(new java.awt.Color(0, 0, 0));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShadowColor(new java.awt.Color(255, 0, 0));
        dropShadowBorder4.setShadowOpacity(1.0F);
        dropShadowBorder4.setShadowSize(10);
        cnh.setBorder(dropShadowBorder4);
        cnh.setForeground(new java.awt.Color(0, 255, 255));
        try {
            cnh.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnh.setToolTipText("Insira o seu RG");
        cnh.setCaretColor(new java.awt.Color(255, 124, 100));
        cnh.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Principal.add(cnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 180, 51));

        data_nasc.setBackground(new java.awt.Color(0, 0, 0));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder5 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder5.setShadowColor(new java.awt.Color(250, 0, 0));
        dropShadowBorder5.setShadowOpacity(1.0F);
        dropShadowBorder5.setShadowSize(10);
        data_nasc.setBorder(dropShadowBorder5);
        data_nasc.setForeground(new java.awt.Color(0, 255, 255));
        try {
            data_nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_nasc.setCaretColor(new java.awt.Color(255, 124, 100));
        data_nasc.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Principal.add(data_nasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 51));

        cpf.setBackground(new java.awt.Color(0, 0, 0));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder6 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder6.setShadowColor(new java.awt.Color(250, 0, 0));
        dropShadowBorder6.setShadowOpacity(1.0F);
        dropShadowBorder6.setShadowSize(10);
        cpf.setBorder(dropShadowBorder6);
        cpf.setForeground(new java.awt.Color(0, 255, 255));
        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setToolTipText("Insira seu CPF");
        cpf.setCaretColor(new java.awt.Color(255, 124, 100));
        cpf.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Principal.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 180, 51));

        rg.setBackground(new java.awt.Color(0, 0, 0));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder7 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder7.setShadowColor(new java.awt.Color(250, 0, 0));
        dropShadowBorder7.setShadowOpacity(1.0F);
        dropShadowBorder7.setShadowSize(10);
        rg.setBorder(dropShadowBorder7);
        rg.setForeground(new java.awt.Color(0, 255, 255));
        try {
            rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########.#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rg.setToolTipText("Insira seu CPF");
        rg.setCaretColor(new java.awt.Color(255, 124, 100));
        rg.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Principal.add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 180, 51));

        titulo_telefone.setBackground(new java.awt.Color(0, 255, 255));
        titulo_telefone.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_telefone.setForeground(new java.awt.Color(255, 255, 255));
        titulo_telefone.setText("Telefone:");
        Principal.add(titulo_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        titulo_rg.setBackground(new java.awt.Color(0, 255, 255));
        titulo_rg.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_rg.setForeground(new java.awt.Color(255, 255, 255));
        titulo_rg.setText("RG:");
        Principal.add(titulo_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        cidade.setBackground(new java.awt.Color(0, 0, 0));
        cidade.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        cidade.setForeground(new java.awt.Color(0, 255, 255));
        cidade.setToolTipText("Crie seu nome de usuário");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder8 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder8.setShadowColor(new java.awt.Color(250, 0, 0));
        dropShadowBorder8.setShadowOpacity(1.0F);
        dropShadowBorder8.setShadowSize(10);
        cidade.setBorder(dropShadowBorder8);
        Principal.add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 246, 51));

        titulo_cidade.setBackground(new java.awt.Color(0, 255, 255));
        titulo_cidade.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_cidade.setForeground(new java.awt.Color(255, 255, 255));
        titulo_cidade.setText("Cidade:");
        Principal.add(titulo_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        telefone.setBackground(new java.awt.Color(0, 0, 0));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder9 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder9.setShadowColor(new java.awt.Color(250, 0, 0));
        dropShadowBorder9.setShadowOpacity(1.0F);
        dropShadowBorder9.setShadowSize(10);
        telefone.setBorder(dropShadowBorder9);
        telefone.setForeground(new java.awt.Color(0, 255, 255));
        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+##(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone.setToolTipText("Insira seu telefone");
        telefone.setCaretColor(new java.awt.Color(255, 124, 100));
        telefone.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Principal.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 180, 51));

        esquerd_panel.setBackground(new java.awt.Color(255, 0, 0));
        esquerd_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                esquerd_panelMouseEntered(evt);
            }
        });

        titul0.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        titul0.setForeground(new java.awt.Color(255, 255, 255));
        titul0.setText("Registro de Cliente");
        titul0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titul0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titul0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titul0MouseExited(evt);
            }
        });

        javax.swing.GroupLayout esquerd_panelLayout = new javax.swing.GroupLayout(esquerd_panel);
        esquerd_panel.setLayout(esquerd_panelLayout);
        esquerd_panelLayout.setHorizontalGroup(
            esquerd_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerd_panelLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(titul0)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        esquerd_panelLayout.setVerticalGroup(
            esquerd_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerd_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titul0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Principal.add(esquerd_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        limpar1.setBackground(new java.awt.Color(255, 0, 0));
        limpar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpar1.setForeground(new java.awt.Color(255, 255, 255));
        limpar1.setText("Limpar");
        limpar1.setBorder(null);
        limpar1.setContentAreaFilled(false);
        limpar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpar1.setOpaque(true);
        limpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar1ActionPerformed(evt);
            }
        });
        Principal.add(limpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 120, 40));

        enviar1.setBackground(new java.awt.Color(255, 0, 0));
        enviar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enviar1.setForeground(new java.awt.Color(255, 255, 255));
        enviar1.setText("Enviar");
        enviar1.setBorder(null);
        enviar1.setContentAreaFilled(false);
        enviar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar1.setOpaque(true);
        enviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar1ActionPerformed(evt);
            }
        });
        Principal.add(enviar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalMouseEntered
                           int position = esquerd_panel.getY();
             Animacion.Animacion.subir(position,-60, 1, 1, esquerd_panel); 
               if(position != 0){
                      esquerd_panel.setVisible(false);
                            titul0.setVisible(false);}
    }//GEN-LAST:event_PrincipalMouseEntered

    private void titul0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titul0MouseClicked

    }//GEN-LAST:event_titul0MouseClicked

    private void titul0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titul0MouseEntered

    }//GEN-LAST:event_titul0MouseEntered

    private void titul0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titul0MouseExited

    }//GEN-LAST:event_titul0MouseExited

    private void esquerd_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esquerd_panelMouseEntered

    }//GEN-LAST:event_esquerd_panelMouseEntered

    private void limpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar1ActionPerformed
       this.limpar();
    }//GEN-LAST:event_limpar1ActionPerformed

    private void enviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar1ActionPerformed
        //_________________________________Código de Envio_____________________________________
        
        FuncionarioDAO dao = new FuncionarioDAO();
        Cliente cli = new Cliente();
        
        Funcionario funcionario = dao.PropetyFuncionario(System.getProperty("login"));
        
        if(nome_completo.getText().isEmpty() || data_nasc.getText().isEmpty() || email.getText().isEmpty() 
                || cpf.getText().isEmpty() || rg.getText().isEmpty() || cnh.getText().isEmpty()
                || estado.getText().isEmpty() || cidade.getText().isEmpty() || telefone.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Campo Vazio.", "Vilet's Concessionária", JOptionPane.ERROR_MESSAGE);
            
        }else if(!email.getText().contains("@") || !email.getText().contains(".com") || email.getText().contains("@.com")){
          
             JOptionPane.showMessageDialog(this, "Email Inválido.", "Vilet's Concessionária", JOptionPane.ERROR_MESSAGE);
               
        }else{
            cli.setId_funcionario(String.valueOf(funcionario.getId()));
            cli.setNome(nome_completo.getText());
            cli.setDatanasc(data_nasc.getText());
            cli.setEmail(email.getText());
            cli.setCPF(cpf.getText());
            cli.setRG(rg.getText());
            cli.setCNH(cnh.getText());
            cli.setEstado(estado.getText());
            cli.setCidade(cidade.getText());
            cli.setTelefone(telefone.getText());
            
            dao.CadastrarCliente(cli);
            
             this.limpar();
            
        }
        
    }//GEN-LAST:event_enviar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField cnh;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField data_nasc;
    private javax.swing.JTextField email;
    private javax.swing.JButton enviar1;
    private javax.swing.JPanel esquerd_panel;
    private javax.swing.JTextField estado;
    private javax.swing.JButton limpar1;
    private javax.swing.JTextField nome_completo;
    private javax.swing.JFormattedTextField rg;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JLabel titul0;
    private javax.swing.JLabel titulo_cidade;
    private javax.swing.JLabel titulo_cnh;
    private javax.swing.JLabel titulo_cpf;
    private javax.swing.JLabel titulo_data_nasc;
    private javax.swing.JLabel titulo_email;
    private javax.swing.JLabel titulo_estado;
    private javax.swing.JLabel titulo_nome;
    private javax.swing.JLabel titulo_rg;
    private javax.swing.JLabel titulo_telefone;
    // End of variables declaration//GEN-END:variables

}