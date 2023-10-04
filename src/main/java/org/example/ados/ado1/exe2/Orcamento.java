package org.example.ados.ado1.exe2;

import org.example.ados.ado1.exe2.strategy.ImpostoStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BinaryOperator;

public class Orcamento {

    private List<Produto> itens;

    public Orcamento(){
        this.itens = new ArrayList<>();
    }
    public float getValorOrcamento() {
        return itens.stream().map(Produto::getTotal).reduce((float) 0, (acumulador, total) -> acumulador + total);
    }

    public void addItem(Produto produto){
        itens.add(produto);
    }
}
