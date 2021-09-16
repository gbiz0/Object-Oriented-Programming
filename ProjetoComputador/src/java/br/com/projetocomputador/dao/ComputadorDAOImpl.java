package br.com.projetocomputador.dao;

import br.com.projetocomputador.model.Computador;
import br.com.projetocomputador.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ComputadorDAOImpl implements GenericDAO{
    private Connection conn;

    public ComputadorDAOImpl() throws Exception {
        try {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
    

    @Override
    public Boolean cadastrar(Object object) {
        
        Computador computador = (Computador) object;
        PreparedStatement stmt = null;
                
        String sql = "Insert into computador(fornecedorComputador, precoComputador, ssdComputador, ramComputador) "
                + "values (?, ?, ?, ?);";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, computador.getFornecedorComputador());
            stmt.setInt(2, computador.getPrecoComputador());
            stmt.setInt(3, computador.getSsdComputador());
            stmt.setInt(4, computador.getRamComputador());
            stmt.execute();
            return true;
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar computador! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar a conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    

    @Override
    public List<Object> listar() {
        List<Object> computador = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String sql = "select * from computador;";
        
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Computador computador = new Computador();
                computador.setIdComputador(rs.getInt("idcomputador"));
                computador.setFornecedorComputador(rs.getString("fornecedorcomputador"));
                computador.setPrecoComputador(rs.getInt("precocomputador"));
                computador.setSsdComputador(rs.getInt("ssdcomputador"));
                computador.setRamComputador(rs.getInt("ramcomputador"));
                computador.add(computador);
                        
            }
             } catch (SQLException ex) {
            System.out.println("Problemas ao listar computadores! Erro:" + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.closeConnection(conn, stmt, rs);
            } catch (Exception e) {
                System.out.println("Problemas ao fechar a conexão! Erro" + e.getMessage());
                e.printStackTrace();
            }
        }  
        return computador;
    }

    

    @Override
    public Boolean excluir(int idOject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int idObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
