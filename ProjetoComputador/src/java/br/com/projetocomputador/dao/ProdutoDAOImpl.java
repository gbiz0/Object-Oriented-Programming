package br.com.projetocomputador.dao;

import br.com.projetocomputador.model.Produto;
import br.com.projetocomputador.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class ProdutoDAOImpl {
    private Connection conn;

    public ProdutoDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }    

    
    public Integer cadastrar(Produto produto) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer idProduto = null;
        
        String sql = "Insert into produto(fornecedorProduto, precoProduto)"
                + "values(?, ?) returning idproduto;";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getFornecedorProduto());
            stmt.setInt(2, produto.getPrecoProduto());
            rs = stmt.executeQuery();

            if (rs.next()){
                idProduto = rs.getInt("idproduto");
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar produto! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return idProduto;
    }

}