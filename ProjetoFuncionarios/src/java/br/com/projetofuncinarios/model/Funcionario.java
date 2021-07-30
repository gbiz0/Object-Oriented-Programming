package br.com.projetofuncinarios.model;

public class Funcionario {
    
    private Integer idFuncionario;
    private String nameFuncionario;
    private String cpfFuncionario;
    private String cityFuncionario;
    private String cellFuncionario;

    public Funcionario() {
    }

    public Funcionario(Integer idFuncionario, String nameFuncionario, String cpfFuncionario, String cityFuncionario, String cellFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nameFuncionario = nameFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.cityFuncionario = cityFuncionario;
        this.cellFuncionario = cellFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNameFuncionario() {
        return nameFuncionario;
    }

    public void setNameFuncionario(String nameFuncionario) {
        this.nameFuncionario = nameFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getCityFuncionario() {
        return cityFuncionario;
    }

    public void setCityFuncionario(String cityFuncionario) {
        this.cityFuncionario = cityFuncionario;
    }

    public String getCellFuncionario() {
        return cellFuncionario;
    }

    public void setCellFuncionario(String cellFuncionario) {
        this.cellFuncionario = cellFuncionario;
    }
    
    
}