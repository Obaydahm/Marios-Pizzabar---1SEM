/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dabestpizza;

import java.util.ArrayList;
import textui.TextUI;

/**
 *
 * @author Obaydah Mohamad
 */
public class Orders {
 private ArrayList<Object> orders;

    public Orders(ArrayList<Object> orders){
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Aktive bestillinger: \n\n" + orders;
    }

    public void add(Object order) {
        orders.add(order);
    }

    public ArrayList<Object> getOrders() {
        return orders;
    }
    
    
}
