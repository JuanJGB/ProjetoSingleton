/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.objeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class Pizza {
    private long id;
    private String sabor;
    private int kal;
    private List<String> ingredientes;

    public Pizza() {    
        ingredientes = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        String todosIngredientes = "";
        for (String ingrediente : ingredientes) {
            todosIngredientes += ingredientes.indexOf(ingrediente)+ " - "+ingrediente + "\n";
            
        }
        return "Pizza{" + "id=" + id + ", sabor=" + sabor + ", kal=" + kal + ", ingredientes=" + todosIngredientes + '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getKal() {
        return kal;
    }

    public void setKal(int kal) {
        this.kal = kal;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
    
}
