package Model;
import View.PDF_GUI;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; 
public class Functions_DAO {
    // Váriaves de inserção no banco de dados da sala
    static int cod;
    static String SalaNome;
    static String SalaLocal;
    static String SalaEstado;
    // Váriaves de inserção no banco de dados da sala
    
    // Váriaves de alugar sala
       static String SalaEscolhida;
       static String Data;
    // Váriaves de alugar sala
    public static void Save(){
        String url = "jdbc:mysql://localhost/information"; // enderço do BD
        String username = "root";        //nome de um usuário de seu BD
        String password = "";  // senha do BD
        

        
        try { 
                
            Connection con = null;
            try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
               
            }

            // Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO salas(sala_nome,sala_local,sala_estado) values('"+SalaNome+"','"+SalaLocal+"', '"+SalaEstado+"')";
     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

                JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!","Mensagem",-1);
           
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);

        }    
}
    public static void SaveReserve(){
        String url = "jdbc:mysql://localhost/information"; // enderço do BD
        String username = "root";        //nome de um usuário de seu BD
        String password = "";  // senha do BD
        Connection con = null;
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
            
            }
        SalaEscolhida = View.Reserve_GUI.salas_box.getSelectedItem().toString();
        Data = date.format(View.Reserve_GUI.Data_Choser.getDate());
        String sql = "INSERT INTO reservado(sala_escolhida,sala_data) values('"+SalaEscolhida+"','"+Data+"')";
     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

                JOptionPane.showMessageDialog(null,"\n        O estado da sala será selecionado alterado para ocupado! \n       Prossiga com o a criação do PDF clicando no botão abaixo ↓","AVISO",1);
                new PDF_GUI().setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nSala ja reservada","ERRO!",0);
               
            }      
}
    public static void UpdateSala(){
        String url = "jdbc:mysql://localhost/information"; // enderço do BD
        String username = "root";        //nome de um usuário de seu BD
        String password = "";  // senha do BD
        Connection con = null;
          try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                
            }
        String sql = "UPDATE salas SET sala_estado = '"+SalaEstado+"' WHERE sala_nome = '"+SalaEscolhida+"'";
        String sql2 = "DELETE FROM reservado WHERE sala_escolhida = '"+SalaEscolhida+"'";
     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement deletar = (PreparedStatement) con.prepareStatement(sql2);
                deletar.execute(); // Executando a remoção
                inserir.execute(); // Executando a inserção

                JOptionPane.showMessageDialog(null,"\nAlteração realizada com sucesso!","Mensagem",1);
           
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }
}
    public static void refresh(){
        String url = "jdbc:mysql://localhost/information"; // enderço do BD
        String username = "root";        //nome de um usuário de seu BD
        String password = "";  // senha do BD
        try{
            Connection conn;
            conn = (Connection) DriverManager.getConnection(url, username, password);
            Controller.DriverConection.DriverLoader();
            String sql = "SELECT * FROM salas;";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            View.Reserve_GUI.Salas_TBT.setModel(Model.Atualizar_DAO.salas(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
}    
    }
       public static void ChangeStateReserve(){
        String url = "jdbc:mysql://localhost/information"; // enderço do BD
        String username = "root";        //nome de um usuário de seu BD
        String password = "";  // senha do BD
        String estate = "'Ocupado'";
        Connection con = null;
         try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {

            }
        String sql = "UPDATE salas SET sala_estado = "+estate+" WHERE sala_nome = '"+View.Reserve_GUI.salas_box.getSelectedItem()+"'";
        try {// Tratamento de Erros para inserção
             PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
             inserir.execute();
                // Criando varialvel que executara a inserção
                // Executando a inserção
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
        }
    }
}


