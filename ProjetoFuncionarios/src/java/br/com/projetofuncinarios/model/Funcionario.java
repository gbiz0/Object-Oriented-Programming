package br.com.projetofuncinarios.model;

public class Funcionario {
    
    private Integer idFuncionarios;
    private String nameFuncionarios;
    private Integer cpfFuncionarios;
    private String cityFuncionarios;
    private Integer cellFuncionarios;

    public Funcionario(Integer idFuncionarios, String nameFuncionarios, Integer cpfFuncionarios, String cityFuncionarios, Integer cellFuncionarios) {
        this.idFuncionarios = idFuncionarios;
        this.nameFuncionarios = nameFuncionarios;
        this.cpfFuncionarios = cpfFuncionarios;
        this.cityFuncionarios = cityFuncionarios;
        this.cellFuncionarios = cellFuncionarios;
    }

    public Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getIdFuncionarios() {
        return idFuncionarios;
    }

    public void setIdFuncionarios(Integer idFuncionarios) {
        this.idFuncionarios = idFuncionarios;
    }

    public String getNameFuncionarios() {
        return nameFuncionarios;
    }

    public void setNameFuncionarios(String nameFuncionarios) {
        this.nameFuncionarios = nameFuncionarios;
    }

    public Integer getCpfFuncionarios() {
        return cpfFuncionarios;
    }

    public void setCpfFuncionarios(Integer cpfFuncionarios) {
        this.cpfFuncionarios = cpfFuncionarios;
    }

    public String getCityFuncionarios() {
        return cityFuncionarios;
    }

    public void setCityFuncionarios(String cityFuncionarios) {
        this.cityFuncionarios = cityFuncionarios;
    }

    public Integer getCellFuncionarios() {
        return cellFuncionarios;
    }

    public void setCellFuncionarios(Integer cellFuncionarios) {
        this.cellFuncionarios = cellFuncionarios;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNameFuncionario(String nameFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCityFuncionario(String cityFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCellFuncionario(Integer cellFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

