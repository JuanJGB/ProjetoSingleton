/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.singleton;

import br.com.juan.objeto.Pizza;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SPizza {

    private List<Pizza> pizzas = new ArrayList<>();

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    private SPizza() {
    }

    public static SPizza getInstance() {
        return SPizzaHolder.INSTANCE;
    }

    private static class SPizzaHolder {

        private static final SPizza INSTANCE = new SPizza();
    }
}
