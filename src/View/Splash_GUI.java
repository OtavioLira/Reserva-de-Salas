package View;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Splash_GUI extends javax.swing.JFrame {
    public Splash_GUI() {
        initComponents();
        new Thread(){
            public void run() {
                for (int i=0; i<101; i++){
                    lbl_progress.setText(i+"%");
                    try {
                        sleep(60); 
                        
                        pb_progresso.setValue(i);
                        
                        if(pb_progresso.getValue() == 10){
                        
                            lbl_mensagem.setText("Carregando ");
                            sleep(2000);
                                                       
                        
                        }else if (pb_progresso.getValue() <=30){
                            lbl_mensagem.setText("Carregando os registros");
                          sleep(100);  
                        } else if (pb_progresso.getValue() <= 99){
                            lbl_mensagem.setText("Finalizando conexão com servidores");
                            
                        }else{
                            lbl_mensagem.setText("Iniciando o sistema!");
                        
                        sleep(3000);
                        
                        new Login_GUI().setVisible(true);
                        dispose();
                        sleep(3000);
                        }
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
        
        
        }
              
        }
    }.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        pb_progresso = new org.edisoncor.gui.progressBar.ProgressBarRound();
        panelRound1 = new org.edisoncor.gui.panel.PanelRound();
        lbl_mensagem = new javax.swing.JLabel();
        lbl_progress = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/048001eaae49931a174a377792a3c4b9.jpg"))); // NOI18N

        panelRound1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.setColorDeBorde(new java.awt.Color(255, 255, 255));
        panelRound1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRound1.setColorSecundario(new java.awt.Color(255, 255, 255));

        lbl_mensagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_mensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lbl_mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbl_progress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_progress.setForeground(new java.awt.Color(255, 255, 255));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/roomtron_white.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelImage1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(pb_progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(lbl_progress, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelImage1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pb_progresso, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lbl_progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelImage1);
        panelImage1.setBounds(0, 0, 530, 350);

        setSize(new java.awt.Dimension(525, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_mensagem;
    private javax.swing.JLabel lbl_progress;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelRound panelRound1;
    private org.edisoncor.gui.progressBar.ProgressBarRound pb_progresso;
    // End of variables declaration//GEN-END:variables
}
