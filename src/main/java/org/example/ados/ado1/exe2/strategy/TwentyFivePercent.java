package org.example.ados.ado1.exe2.strategy;

public class TwentyFivePercent implements ImpostoStrategy{

    @Override
    public float calcular(float total) {
        return (float) (total * 0.2);
    }
}
