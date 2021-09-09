package br.com.projetocomputador.model;


public class Computador {
    private Integer idComputador;
    private String fornecedorComputador;
    private Integer precoComputador;
    private Integer ramComputador;
    private Integer ssdComputador;

    public Computador() {
    }

    public Computador(Integer idComputador, String fornecedorComputador, Integer precoComputador, Integer ramComputador, Integer ssdComputador) {
        this.idComputador = idComputador;
        this.fornecedorComputador = fornecedorComputador;
        this.precoComputador = precoComputador;
        this.ramComputador = ramComputador;
        this.ssdComputador = ssdComputador;
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

    public Integer getRamComputador() {
        return ramComputador;
    }

    public void setRamComputador(Integer ramComputador) {
        this.ramComputador = ramComputador;
    }

    public Integer getSsdComputador() {
        return ssdComputador;
    }

    public void setSsdComputador(Integer ssdComputador) {
        this.ssdComputador = ssdComputador;
    }

    public void setPrecoComputador(String precoComputador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRamComputador(String ramComputador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSsdComputador(String ssdComputador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
