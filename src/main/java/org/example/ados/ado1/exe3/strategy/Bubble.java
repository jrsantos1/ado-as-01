package org.example.ados.ado1.exe3.strategy;

public class Bubble implements MetodoOrdenacao{
    @Override
    public void ordenar(int[] v) {
        int i,j;
        int temp;
        for(j=0;j<v.length-1;j++)
            for(i=0;i<v.length-1-j;i++)
                if(v[i]>v[i+1]){
                    temp=v[i];
                    v[i]=v[i+1];
                    v[i+1]=temp;
                }
    }
}
