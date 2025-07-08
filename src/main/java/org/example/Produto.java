package org.example;

public class Produto implements Cloneable{
    private String tipo;
    private String marca;
    private Fornecedor fornecedor;

    public Produto(String tipo, String marca, Fornecedor fornecedor) {
        this.tipo = tipo;
        this.marca = marca;
        this.fornecedor = fornecedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        produtoClone.fornecedor = (Fornecedor) produtoClone.fornecedor.clone();
        return produtoClone;
    }
}
