package org.example.ados.ado1.exe1;

import org.example.ados.ado1.exe1.singleton.Configuracoes;

public class Main {
    public static void main(String[] args) {
        Configuracoes configuracoes = Configuracoes.getInstance("Configurações do sistema");
        configuracoes.exibeConfiguracoes();
    }
}
