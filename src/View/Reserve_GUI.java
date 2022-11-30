package View;
public class Reserve_GUI extends javax.swing.JFrame {
    public Reserve_GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("Information?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        salasQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Salas s");
        salasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : salasQuery.getResultList();
        jPanel2 = new javax.swing.JPanel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        Salas_TBT = new javax.swing.JTable();
        panelData = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Data_Choser = new com.toedter.calendar.JDateChooser();
        panelSala = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salas_box = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        panelImage3.setOpaque(false);
        panelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salas_TBT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 102), new java.awt.Color(204, 0, 102), new java.awt.Color(255, 51, 255), new java.awt.Color(255, 0, 204)));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, salasList, Salas_TBT);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salaCod}"));
        columnBinding.setColumnName("Código da Sala");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salaNome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salaLocal}"));
        columnBinding.setColumnName("Local");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salaEstado}"));
        columnBinding.setColumnName("Estado");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(Salas_TBT);

        panelImage3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 360, 280));

        panelData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(71, 209, 218));
        jLabel3.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelData.add(jLabel3);

        Data_Choser.setPreferredSize(new java.awt.Dimension(20, 20));
        panelData.add(Data_Choser);

        panelImage3.add(panelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 120, 50));

        panelSala.setBackground(new java.awt.Color(255, 255, 255));
        panelSala.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153), new java.awt.Color(255, 0, 153)));
        panelSala.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Impact", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sala a ser Reservada");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelSala.add(jLabel1);

        panelSala.add(salas_box);

        panelImage3.add(panelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 260, 80));

        jButton1.setBackground(new java.awt.Color(204, 0, 102));
        jButton1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelImage3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, 30));

        jButton2.setBackground(new java.awt.Color(204, 0, 102));
        jButton2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Configurar PDF");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 102), null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelImage3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 190, 30));

        jPanel2.add(panelImage3);
        panelImage3.setBounds(0, 0, 800, 450);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 450);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(800, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Initial_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Model.Functions_DAO.SaveReserve();
        Model.Functions_DAO.ChangeStateReserve();
        Model.Functions_DAO.refresh();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserve_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.toedter.calendar.JDateChooser Data_Choser;
    public static javax.swing.JTable Salas_TBT;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelData;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private javax.swing.JPanel panelSala;
    private java.util.List<View.Salas> salasList;
    private javax.persistence.Query salasQuery;
    public static javax.swing.JComboBox<String> salas_box;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
