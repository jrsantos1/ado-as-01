package org.example.ados.ado1.exe4.composite;

import java.util.ArrayList;

public class Caixa implements Component{

     private ArrayList<Component> components;

     public Caixa(){
        this.components = new ArrayList<Component>();
     }

     @Override
     public double precoTotal() {
        if (empty()){
            return 0d;
        }
        
        double valorTotalAux = 0d;

        for (Component c : components){
            valorTotalAux += c.precoTotal();
        }

        return valorTotalAux;

     }

     public void add(Component c){
        this.components.add(c);
     }

     private boolean empty(){
        if (this.components.size() == 0){
            return true;
        }else{
            return false;
        }
     }

}
