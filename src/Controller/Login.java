package Controller;

import static Controller.SalasLoader.nome;
import View.Initial_GUI;
import View.Login_GUI;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login {
    public static String login = "";
    public static String senha = "";
    public static String nome = "";
    
    public static String ConfirmLogin = "";
    public static String ConfirmSenha = "";
      public static String ConfirmNome = "";
    public static int confirm = 0;
    
    public static void CreateLogin(){
        String url = "jdbc:mysql://localhost/LUAN"; // enderço do BD
        String username = "root";        //nome de um usuário de seu BD
        String password = "";  // senha do BD
        
        login = View.Registration_GUI.Login_TXT.getText().toString(); // recebendo o login
        senha = View.Registration_GUI.Senha_TXT.getText().toString(); // recebendo o local
        nome = View.Registration_GUI.Name_TXT.getText().toString();
       
        
        try { 
                
            Connection con = null;


            // Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO usuarios(cli_email, cli_senha, cli_nome) values('"+login+"','"+senha+"','"+nome+"')";
     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

                JOptionPane.showMessageDialog(null,"\nConta criada com sucesso!","Mensagem",-1);
                View.Registration_GUI.Login_TXT.setText("");
                View.Registration_GUI.Senha_TXT.setText("");
                View.Registration_GUI.Name_TXT.setText("");
           
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nAlgo deu errado!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            View.Registration_GUI.Login_TXT.setText("");
            View.Registration_GUI.Senha_TXT.setText("");
            View.Registration_GUI.Name_TXT.setText("");
        }    
    }
     public static void ConfirmLogin(){
        String url = "jdbc:mysql://localhost/LUAN"; // enderço do BD
        String username = "root";        //nome de um usuário de seu BD
        String password = "";  // senha do BD
         try{
            Connection con = null;
            try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex) {
                Logger.getLogger(View.Reserve_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "SELECT * FROM usuarios";
            Statement stm = (Statement) con.createStatement();
                try//Tratamento de erro da consulta
                { //Criando variavel que exibira os resultados
                    //Executando o comando da string sql na variavel rs
                    ResultSet rs = stm.executeQuery(sql);

                    int i=0;// Variavel utilizada para saber se ha dados cadastrados

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados
                        ConfirmLogin = rs.getString("cli_email");
                        ConfirmSenha = rs.getString("cli_senha");
                        ConfirmNome = rs.getString("cli_nome");
                        if(ConfirmLogin.equals(View.Login_GUI.Login_TXT.getText()) && ConfirmSenha.equals(View.Login_GUI.Senha_TXT.getText())){
                            new Initial_GUI().setVisible(true);
                            View.Initial_GUI.Name_LBL.setText("Olá, "+ConfirmNome+"!");
                            confirm = 1;
                        }
                        i++;

                    }
                    if(confirm == 0){
                        new Login_GUI().setVisible(true); 
                        JOptionPane.showMessageDialog(null, "A conta não pode ser encontrada!","Aviso",-1);
                    }
                    
                    if(i==0){ // Verificando se ha dados cadastrados atraves da variavel i

                        JOptionPane.showMessageDialog(null,"Nenhuma conta foi cadastrada!","Aviso",-1);

                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null,"\nNão foi possível encontrar nenhum dado semelhante no banco de dados!","ERRO",0);
                    
                }

        }catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0);
            }
    }
}
