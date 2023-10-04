package org.example.ados.ado1.exe2.strategy;

public class TenPercent implements ImpostoStrategy{

    @Override
    public float calcular(float total) {
        return (float) (total * 0.1);
    }
}
