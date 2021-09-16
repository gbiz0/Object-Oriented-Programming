package br.com.projetocomputador.model;


public class Computador {
    private Integer idComputador;
    private String fornecedorComputador;
    private Integer precoComputador;
    private Integer ssdComputador;
    private Integer ramComputador;

    public Computador() {
    }

    public Computador(Integer idComputador, String fornecedorComputador, Integer precoComputador, Integer ssdComputador, Integer ramComputador) {
        this.idComputador = idComputador;
        this.fornecedorComputador = fornecedorComputador;
        this.precoComputador = precoComputador;
        this.ssdComputador = ssdComputador;
        this.ramComputador = ramComputador;
    }

    public Integer getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(Integer idComputador) {
        this.idComputador = idComputador;
    }

    public String getFornecedorComputador() {
        return fornecedorComputador;
    }

    public void setFornecedorComputador(String fornecedorComputador) {
        this.fornecedorComputador = fornecedorComputador;
    }

    public Integer getPrecoComputador() {
        return precoComputador;
    }

    public void setPrecoComputador(Integer precoComputador) {
        this.precoComputador = precoComputador;
    }

    public Integer getSsdComputador() {
        return ssdComputador;
    }

    public void setSsdComputador(Integer ssdComputador) {
        this.ssdComputador = ssdComputador;
    }

    public Integer getRamComputador() {
        return ramComputador;
    }

    public void setRamComputador(Integer ramComputador) {
        this.ramComputador = ramComputador;
    }

    public void add(Computador computador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
