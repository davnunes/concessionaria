package dao;

import model.Cliente;
import model.Funcionario;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    
public boolean checkLogin(String login, String senha){
    
Connection con = ConnectionFactory.getConnection();
PreparedStatement stmt = null;
    
//o ResultSet servirá para guardar os dados que serão imprimidos.
ResultSet rs = null;
boolean check = false;
    
try{
    stmt = con.prepareStatement("SELECT * FROM funcionario WHERE login = ?  and senha = ?");
    stmt.setString(1, login);
    stmt.setString(2, senha);
    
    //responsável pelas consultas de um banco.
    //os valores serão executados e enviados para o resultset.
    rs = stmt.executeQuery();

  //enquanto existir um valor no rs, ele colocará no objeto e irá para o próximo. 
  if(rs.next()){
   check = true;   
  }

} catch (SQLException ex) {
  JOptionPane.showMessageDialog(null, "Erro ao logar!", "Vilte's Concessionária", JOptionPane.ERROR_MESSAGE);
    System.out.println(ex);

} finally{
//fechando todas as conexões abertas.. =D
ConnectionFactory.closeConnection(con, stmt, rs);
}
return check;
 }     

public Funcionario PropetyFuncionario(String login){
    Connection conexao = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    Funcionario fun = new Funcionario();
    
    try {
        stmt = conexao.prepareStatement("SELECT nome, idfuncionario, foto FROM funcionario WHERE login = ?");
        stmt.setString(1, login);
        
        rs = stmt.executeQuery();
        
        if(rs.next()){
         fun.setNome(rs.getString("nome"));
         fun.setId(rs.getInt("idfuncionario"));
         fun.setFoto(rs.getBytes("foto"));
         
        
    }else{
            System.err.println("n tem, zé");
        }
        
    } catch (SQLException ex) {
        System.err.println(ex);
    }
    return fun;
    
}

public void CadastrarCliente(Cliente cliente){
    //1 - conexão.
    //2 - variável que recebe o comando sql.
    //3 - envia os dados (a string sql recebe a conexão e "prepara os comandos".
    //3.1 - põe try-catch
    //3.2 - armazena na variável de conexão.
    //4 - fecha a conexão.
    
   //1°
   Connection conexao = ConnectionFactory.getConnection();
   
   //2°
   PreparedStatement comandosql = null;
   
   //3°
   try{
   comandosql = conexao.prepareStatement("INSERT INTO cliente"
           + "(idfuncionario, nome, datanasc, email, cpf, rg, cnh, telefone, cidade, estado)"
           + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
   
   comandosql.setString(1, cliente.getId_funcionario());
   comandosql.setString(2, cliente.getNome());
   comandosql.setString(3, cliente.getDatanasc());
   comandosql.setString(4, cliente.getEmail());
   comandosql.setString(5, cliente.getCPF());
   comandosql.setString(6, cliente.getRG());
   comandosql.setString(7, cliente.getCNH());
   comandosql.setString(8, cliente.getTelefone());
   comandosql.setString(9, cliente.getCidade());
   comandosql.setString(10, cliente.getEstado());
   
   comandosql.executeUpdate();
   
   JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Vilet's Concessionária", JOptionPane.INFORMATION_MESSAGE);
   
   } catch(SQLException ex){
       System.err.println(ex);
   } finally{
       ConnectionFactory.closeConnection(conexao, comandosql);
   }
      
}

public List<Cliente> BuscarCliente(String cliBusca){
    
    //conexao
    Connection conexao = ConnectionFactory.getConnection();
    
    //comando sql
    PreparedStatement comandosql = null;
    
    //lista dos clientes do sql
    ResultSet listasql = null;
    
    //lista que guarda os valores do ResultSet
    List<Cliente> listaClientes = new ArrayList<>();
    
    try{
        comandosql = conexao.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
        
        comandosql.setString(1, "%"+cliBusca+"%");
        
        listasql = comandosql.executeQuery();
        
        //enquanto existir um valor no rs, ele colocará no objeto e irá para o próximo. 
      
      while(listasql.next()){
          
      Cliente cliente = new Cliente();
      
      cliente.setNome(listasql.getString("nome"));
      cliente.setEmail(listasql.getString("email"));
      cliente.setCPF(listasql.getString("cpf"));
      cliente.setRG(listasql.getString("rg"));
      cliente.setTelefone(listasql.getString("telefone"));
      cliente.setCidade(listasql.getString("cidade"));
      cliente.setEstado(listasql.getString("estado"));
      cliente.setCNH(listasql.getString("cnh"));
      
      listaClientes.add(cliente);
        }
        
    } catch(SQLException ex){
       JOptionPane.showMessageDialog(null, "Erro ao encontrar cliente!", " Vilet's Muscles Informa...", JOptionPane.ERROR_MESSAGE);
        System.out.println(ex);
    } finally{
        ConnectionFactory.closeConnection(conexao, comandosql, listasql);
    }
    return listaClientes;
}

public void AlterarDadosCliente(Cliente client){
    
  Connection conexao = ConnectionFactory.getConnection();
  PreparedStatement sql = null;
  
  try{
      sql = conexao.prepareStatement("UPTADE cliente SET nome = ?, email = ?, cpf = ?, rg = ?, telefone = ?, cidade = ?, estado = ?, cnh = ? where nome = ?");
      sql.setString(1, client.getNome());
      sql.setString(2, client.getEmail());
      sql.setString(3, client.getCPF());
      sql.setString(4, client.getRG());
      sql.setString(5, client.getTelefone());
      sql.setString(6, client.getCidade());
      sql.setString(7, client.getEstado());
      sql.setString(8, client.getCNH());
      
      sql.executeUpdate();
      
  } catch(SQLException ex){
       JOptionPane.showMessageDialog(null, "Erro ao alterar dados.", " Vilet's Muscles Informa...", JOptionPane.ERROR_MESSAGE);
       System.out.println(ex);
  } finally{
      ConnectionFactory.closeConnection(conexao, sql);
  }
         
}

//the question is: numChassi e modeloVeiculo
//public List<Veiculo> BuscarVeiculo(String modeloVeiculo){
//    
//Connection conexao = ConnectionFactory.getConnection();
//
//PreparedStatement sql = null;
//
//ResultSet listamodeloRS = null;
//
//List <Veiculo> listaveiculos = new ArrayList<>();
//
//try {
//     sql = conexao.prepareStatement("SELECT * FROM veiculo where modelo LIKE ?");
//     
//     sql.setString(1, "%"+modeloVeiculo+"%");
//     
//     listamodeloRS = sql.executeQuery();
//     //verificar o resultado do resultset.
//     
//     while(listamodeloRS.next()){
//         //add os dados no array.
//         
//         Veiculo veiculo = new Veiculo();
//         
//         veiculo.setModelo(listamodeloRS.getString("modelo"));
//         veiculo.setFabricante(listamodeloRS.getString("fabricante"));
//         veiculo.setCor(listamodeloRS.getString("cor"));
//         veiculo.setAno(listamodeloRS.getString("ano"));
//         veiculo.setPreco(listamodeloRS.getFloat("preco"));
//         veiculo.setNumChassi(listamodeloRS.getString("numChassi"));
//         
//         listaveiculos.add(veiculo);
//        
//     }
//     
//} catch (SQLException ex) {
//       JOptionPane.showMessageDialog(null, "Erro ao buscar veículo.", " Vilet's Muscles Informa...", JOptionPane.ERROR_MESSAGE);
//        System.out.println(ex);
//        
//} finally{
//    ConnectionFactory.closeConnection(conexao, sql, listamodeloRS);
//}
//    return listaveiculos;
//}


}

