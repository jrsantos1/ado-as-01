package org.example.ados.ado1.exe1.singleton;

public class Configuracoes {
    
    private static Configuracoes instance;
    private String configuracoes;

    private Configuracoes(String configuracoes) {
        // Construtor privado para evitar a criação de instâncias diretas.
        this.configuracoes = configuracoes;
    }

    // synchronized para bloquear threads simultâneas
    public static synchronized Configuracoes getInstance(String configuracoes) {
        if (instance == null) {
            instance = new Configuracoes(configuracoes);
        }
        return instance;
    }

    public void exibeConfiguracoes(){
        System.out.println(this.configuracoes);
    }

}