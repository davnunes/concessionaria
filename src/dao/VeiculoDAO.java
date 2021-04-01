package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Veiculo;

public class VeiculoDAO {
    
   public void cadastrarVeiculo(Veiculo veiculo){
       
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt  = null;
       
       try {
           stmt = con.prepareStatement("insert into veiculo (imgCarro,modelo, fabricante, cor, ano, preco, numChassi, descricao) values (?, ?, ?, ?, ?, ?)");
           stmt.setBytes(1, veiculo.getFoto());
           stmt.setString(2, veiculo.getModelo());
           stmt.setString(3, veiculo.getFabricante());
           stmt.setString(4, veiculo.getCor());
           stmt.setString(5, veiculo.getAno());
           stmt.setFloat(6, veiculo.getPreco());
           stmt.setString(7, veiculo.getNumChassi());
           stmt.setString(8, veiculo.getDescricao());
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!", "Vilet's Concessionária", JOptionPane.INFORMATION_MESSAGE);
           
           
       } catch (SQLException ex) {
           System.err.println(ex);
       } finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
    
}
