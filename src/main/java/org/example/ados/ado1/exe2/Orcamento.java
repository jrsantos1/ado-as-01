package org.example.ados.ado1.exe2;

import java.util.ArrayList;
import java.util.List;

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
