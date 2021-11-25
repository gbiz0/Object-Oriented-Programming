package br.com.projetocomputador.model;

public class Produto {
    private int idProduto;
    private String fornecedorProduto;
    private Integer precoProduto;

    public Produto() {
    }

    public Produto(int idProduto, String fornecedorProduto, Integer precoProduto) {
        this.idProduto = idProduto;
        this.fornecedorProduto = fornecedorProduto;
        this.precoProduto = precoProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getFornecedorProduto() {
        return fornecedorProduto;
    }

    public void setFornecedorProduto(String fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }

    public Integer getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Integer precoProduto) {
        this.precoProduto = precoProduto;
    }
    
}
