package org.example.ados.ado1.exe4;

import org.example.ados.ado1.exe4.composite.Caixa;
import org.example.ados.ado1.exe4.composite.Produto;

public class Cliente {
    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        
        Caixa caixaMacas = new Caixa();
        Produto maca1 = new Produto(20d);
        Produto maca2 = new Produto(20d);
        Produto maca3 = new Produto(20d);
        caixaMacas.add(maca1);
        caixaMacas.add(maca2);
        caixaMacas.add(maca3);

        Caixa CaixaAbacates = new Caixa();
        Produto abacate1 = new Produto(15d);
        Produto abacate2 = new Produto(15d);
        CaixaAbacates.add(abacate1);
        CaixaAbacates.add(abacate2);

        carrinhoDeCompras.add(caixaMacas);
        carrinhoDeCompras.add(CaixaAbacates);

        double valorTotal = carrinhoDeCompras.precoTotal();

        System.out.println("Valor total das compras: " + valorTotal);

    }
}
