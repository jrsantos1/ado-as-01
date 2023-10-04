package org.example.ados.ado1.exe3;

import org.example.ados.ado1.exe3.strategy.Bubble;
import org.example.ados.ado1.exe3.strategy.Insertion;
import org.example.ados.ado1.exe3.strategy.Selection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {1,10,3,23,3,21,5,77,20,10};
        int[] vetor2 = {1,10,3,23,3,21,5,77,20,10};
        int[] vetor3 = {1,10,3,23,3,21,5,77,20,10};

        Ordenacao.ordenar(vetor1, new Bubble());
        Ordenacao.ordenar(vetor2, new Insertion());
        Ordenacao.ordenar(vetor3, new Selection()); 

        //valida array 1
        Arrays.stream(vetor1).forEach(x -> {
            System.out.print(" " + x);
        });

        System.out.println("");

        // valida array 2
        Arrays.stream(vetor2).forEach(x -> {
            System.out.print(" " + x);
        });

        System.out.println("");

        // valida array 3
        Arrays.stream(vetor3).forEach(x -> {
            System.out.print(" " + x);
        });

    }
}
