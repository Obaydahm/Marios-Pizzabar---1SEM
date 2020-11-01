/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dabestpizza;

/**
 *
 * @author Obaydah Mohamad
 */
public class Pizza {

    private String pizzaName;
    private String ingredients;
    private int price;

    public Pizza(String pizzaName, String ingredients, int price) {
        this.pizzaName = pizzaName;
        this.ingredients = ingredients;
        this.price = price;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    @Override
    public String toString() {
        return pizzaName + " - Ingredienser: " + ingredients + " - Pris: " + price + "kr";
    }
    
}
