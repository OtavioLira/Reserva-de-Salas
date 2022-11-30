package View;
public class Login_GUI extends javax.swing.JFrame {
    public Login_GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Senha_TXT = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        Login_TXT = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        jPanel2 = new javax.swing.JPanel();
        buttonAction2 = new org.edisoncor.gui.button.ButtonAction();
        buttonIpod1 = new org.edisoncor.gui.button.ButtonIpod();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_Login.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1);
        panelImage1.setBounds(0, 0, 400, 460);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled.png"))); // NOI18N

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/roomtron_logo_black.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage2Layout.createSequentialGroup()
                .addContainerGap(479, Short.MAX_VALUE)
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelImage2);
        panelImage2.setBounds(280, 370, 560, 90);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Realize o login no sistema");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 60, 240, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 180, 210, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel4.setText("Bem vindo ao sistema!");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(420, 30, 210, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        jLabel5.setText("Login");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 100, 210, 30);
        jPanel1.add(Senha_TXT);
        Senha_TXT.setBounds(430, 220, 240, 30);
        jPanel1.add(Login_TXT);
        Login_TXT.setBounds(430, 140, 240, 30);

        buttonAction1.setText("Entrar");
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAction1);
        buttonAction1.setBounds(460, 300, 180, 50);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(480, 310, 170, 50);

        buttonAction2.setText("X");
        buttonAction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction2ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAction2);
        buttonAction2.setBounds(780, 0, 56, 35);

        buttonIpod1.setForeground(new java.awt.Color(153, 153, 255));
        buttonIpod1.setText("Não possui uma conta?");
        buttonIpod1.setColorDeSombra(new java.awt.Color(153, 153, 255));
        buttonIpod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIpod1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonIpod1);
        buttonIpod1.setBounds(420, 260, 200, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(835, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
        Controller.Login.ConfirmLogin();
        dispose();
    }//GEN-LAST:event_buttonAction1ActionPerformed

    private void buttonAction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonAction2ActionPerformed

    private void buttonIpod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIpod1ActionPerformed
        new Registration_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonIpod1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static org.edisoncor.gui.textField.TextFieldRoundIcon Login_TXT;
    public static org.edisoncor.gui.textField.TextFieldRoundIcon Senha_TXT;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.button.ButtonAction buttonAction2;
    private org.edisoncor.gui.button.ButtonIpod buttonIpod1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    // End of variables declaration//GEN-END:variables
}
