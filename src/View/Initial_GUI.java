package View;
public class Initial_GUI extends javax.swing.JFrame {
    public Initial_GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        Reservar_BTN = new org.edisoncor.gui.button.ButtonAction();
        Name_LBL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        name_LBL2 = new javax.swing.JLabel();
        name_LBL3 = new javax.swing.JLabel();
        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/image 1.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1);
        panelImage1.setBounds(40, 10, 100, 90);

        Reservar_BTN.setText("RESERVAR");
        Reservar_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservar_BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Reservar_BTN);
        Reservar_BTN.setBounds(310, 130, 200, 50);

        Name_LBL.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        Name_LBL.setText("Olá Eduardo,");
        jPanel1.add(Name_LBL);
        Name_LBL.setBounds(170, 20, 440, 43);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(330, 150, 190, 40);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled (3).png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage2);
        panelImage2.setBounds(-50, 350, 890, 100);

        name_LBL2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        name_LBL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_LBL2.setText("21:03");
        jPanel1.add(name_LBL2);
        name_LBL2.setBounds(550, 20, 240, 43);

        name_LBL3.setFont(new java.awt.Font("Calibri", 0, 25)); // NOI18N
        name_LBL3.setText("Bem-vindo ao sistema!");
        jPanel1.add(name_LBL3);
        name_LBL3.setBounds(260, 60, 240, 43);

        buttonAction1.setText("X");
        buttonAction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAction1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAction1);
        buttonAction1.setBounds(740, 0, 56, 35);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 450);

        setSize(new java.awt.Dimension(800, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Reservar_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservar_BTNActionPerformed
    new Reserve_GUI().setVisible(true);
    dispose();
    Model.Functions_DAO.refresh();
    //Controller.SalasLoader.InformationLoader();
    //Controller.SalasLoader.CarregarSalas();
    }//GEN-LAST:event_Reservar_BTNActionPerformed

    private void buttonAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAction1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonAction1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Initial_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Name_LBL;
    private org.edisoncor.gui.button.ButtonAction Reservar_BTN;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name_LBL2;
    private javax.swing.JLabel name_LBL3;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    // End of variables declaration//GEN-END:variables
}
