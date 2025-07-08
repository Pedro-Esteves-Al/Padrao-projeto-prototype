package org.example;

public class Fornecedor implements Cloneable {
    private String nome;

    public Fornecedor (String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
