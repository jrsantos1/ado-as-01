package org.example.ados.ado1.exe2;

import org.example.ados.ado1.exe2.strategy.ImpostoStrategy;

public class Produto {
    private String nome;
    private float preco;
    private ImpostoStrategy impostoStrategy;

    public Produto(String nome, float preco, ImpostoStrategy impostoStrategy){
        this.nome = nome;
        this.preco = preco;
        this.impostoStrategy = impostoStrategy;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ImpostoStrategy getImpostoStrategy() {
        return impostoStrategy;
    }

    public void setImpostoStrategy(ImpostoStrategy impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }

    public float getTotal(){
        return this.preco + this.impostoStrategy.calcular(this.preco);
    }
}
