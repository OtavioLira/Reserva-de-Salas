package Controller;
public class DriverConection {
    public static  void DriverLoader(){
       try { // Conecttando o driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado com sucesso!");




       } catch (Exception ex) { // Erro driver não encontrado
            System.out.println("Driver não pôde ser carregado!");
        }
    }
}
