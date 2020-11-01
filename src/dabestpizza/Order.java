/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dabestpizza;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import textui.TextUI;
/**
 *
 * @author Obaydah Mohamad
 */
public class Order {
    private int orderId;
    private ArrayList<Object> pizzas;
    private LocalDateTime timePlaced;
    private static int id = 1;
    
    public Order(ArrayList<Object> pizzas){
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        
        this.pizzas = new ArrayList<>();
        this.pizzas.addAll(pizzas);
        orderId = id;
        timePlaced = LocalDateTime.now();
        id++;
    }
    
    public ArrayList<Object> getPizzas(){
        return pizzas;
    }

    public int getOrderId() {
        return orderId;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return "\n Ordrenr: " + orderId + "\n Pizzanr: " + pizzas + "\n Tidspunkt for ordre: " + timePlaced.format(formatter) + "\n";
    }
    
    
    
    
}