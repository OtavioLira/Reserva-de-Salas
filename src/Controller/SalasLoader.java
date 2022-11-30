package Controller;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SalasLoader {
    public static String nome = "";
    public static String estado = "";
    public static void InformationLoader(){
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
            String sql = "SELECT * FROM salas;";
            Statement stm = (Statement) con.createStatement();
                try//Tratamento de erro da consulta
                { //Criando variavel que exibira os resultados
                    //Executando o comando da string sql na variavel rs
                    ResultSet rs = stm.executeQuery(sql);

                    int i=0;// Variavel utilizada para saber se ha dados cadastrados

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados
                        nome = rs.getString("sala_nome");
                        estado = rs.getString("sala_estado");                   
                        i++;

                    }

                    if(i==0){ // Verificando se ha dados cadastrados atraves da variavel i

                        JOptionPane.showMessageDialog(null,"Ainda não há dados cadastrados","Aviso",-1);

                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null,"\nErro ao consultar!","ERRO",0);
                    
                }

        }catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0);
            }
    }
    public static void CarregarSalas(){
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
            String sql = "SELECT * FROM salas where sala_estado = \"Vazia\";";
            Statement stm = (Statement) con.createStatement();
                try//Tratamento de erro da consulta
                { //Criando variavel que exibira os resultados
                    //Executando o comando da string sql na variavel rs
                    ResultSet rs = stm.executeQuery(sql);

                    int i=0;// Variavel utilizada para saber se ha dados cadastrados

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados
                        nome = rs.getString("sala_nome");
                        View.Reserve_GUI.salas_box.addItem(nome);
                        i++;

                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null,"\nErro ao consultar!","ERRO",0);
                    
                }

        }catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0);
            }
    }
    
    public static void CarregarSalasUpdate(){
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
            String sql = "SELECT * FROM salas";
            Statement stm = (Statement) con.createStatement();
                try//Tratamento de erro da consulta
                { //Criando variavel que exibira os resultados
                    //Executando o comando da string sql na variavel rs
                    ResultSet rs = stm.executeQuery(sql);

                    int i=0;// Variavel utilizada para saber se ha dados cadastrados

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados
                        nome = rs.getString("sala_nome");
                        i++;

                    }

                    if(i==0){ // Verificando se ha dados cadastrados atraves da variavel i

                        JOptionPane.showMessageDialog(null,"Ainda não há dados cadastrados","Aviso",-1);

                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null,"\nErro ao consultar!","ERRO",0);
                    
                }

        }catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0);
            }
    }
}
   
