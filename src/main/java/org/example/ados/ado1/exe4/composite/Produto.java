package org.example.ados.ado1.exe4.composite;

public class Produto implements Component {

    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double precoTotal() {
        return this.preco;
    }
}
