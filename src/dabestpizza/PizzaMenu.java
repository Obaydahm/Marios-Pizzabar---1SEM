/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dabestpizza;

import java.util.ArrayList;

/**
 *
 * @author Obaydah Mohamad
 */
public class PizzaMenu {
    private ArrayList<Object> allPizzas = new ArrayList();
    
    public PizzaMenu(){
        allPizzas.add(new Pizza("Vesuvio", "tomatsauce, ost, skinke og oregano", 57));
        allPizzas.add(new Pizza("Amerikaner", "tomatsauce, ost, oksefars og oregano", 53));
        allPizzas.add(new Pizza("Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57));
        allPizzas.add(new Pizza("Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63));
        allPizzas.add(new Pizza("Dennis", "tomatsauce, ost, skinke, pepperoni, coktailpølser og oregano", 65));
        allPizzas.add(new Pizza("Bertil", "tomatsauce, ost, bacon og oregano", 57));
        allPizzas.add(new Pizza("Silvia", "tomatsauce, ost, pepperoni, rød peber, løb , oliven og oregano", 61));
        allPizzas.add(new Pizza("Victoria", "tomatsause, ost, skinke, ananas, champignion, løg og oregano", 61));
        allPizzas.add(new Pizza("Tofonfo", "tomatsauce, ost, skinke, bacon, kebab, chilli og oregano", 61));
        allPizzas.add(new Pizza("Capricciosa", "tomatsauce, ost, skinke, chapgnon og oregano", 61));
        allPizzas.add(new Pizza("Hawai", "tomatsauce, ost, skinke, ananas og oregano", 61));
        allPizzas.add(new Pizza("Le Blissola", "tomatsauce, ost, skinke, rejer og oregano", 61));
        allPizzas.add(new Pizza("Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61));
        allPizzas.add(new Pizza("Mafia", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61));     
    }

    public ArrayList<Object> getAllPizzas() {
        return  allPizzas;
    }
    
    
}