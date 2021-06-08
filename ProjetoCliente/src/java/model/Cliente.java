package model;


public class Cliente {
    
    private Integer idCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private String cpfCliente;
    private String cidadeCliente;

    public Cliente() {
    }

    public Cliente(Integer idCliente, String nomeCliente, String enderecoCliente, String cpfCliente, String cidadeCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.cpfCliente = cpfCliente;
        this.cidadeCliente = cidadeCliente;
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
}
