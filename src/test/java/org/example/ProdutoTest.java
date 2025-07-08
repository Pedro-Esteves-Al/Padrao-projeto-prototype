package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void testaClone() throws CloneNotSupportedException {
        Produto produto = new Produto("cpu","asus",new Fornecedor("Kabum"));

        Produto produtoClone = produto.clone();
        produtoClone.setTipo("memória ram");
        produtoClone.setMarca("msi");
        produtoClone.getFornecedor().setNome("Amazon");

        assertEquals("cpu", produto.getTipo());
        assertEquals("memória ram", produtoClone.getTipo());
    }
}