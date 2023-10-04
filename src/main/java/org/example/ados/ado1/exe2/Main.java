package org.example.ados.ado1.exe2;

import org.example.ados.ado1.exe2.strategy.FifteenPercent;
import org.example.ados.ado1.exe2.strategy.TenPercent;
import org.example.ados.ado1.exe2.strategy.TwentyFivePercent;

public class Main {
    public static void main(String[] args) {
       Produto produto1 = new Produto("Maça", 20.0f, new TwentyFivePercent());
       Produto produto2 = new Produto("Pera", 34.0f, new FifteenPercent());
       Produto produto3 = new Produto("Abacate", 15.0f, new TenPercent());

       Orcamento orcamento = new Orcamento();
       orcamento.addItem(produto1);
       orcamento.addItem(produto2);
       orcamento.addItem(produto3);

       float total = orcamento.getValorOrcamento();

        System.out.printf("O valor total do orçamento é de %.2f%n", total);


    }
}
