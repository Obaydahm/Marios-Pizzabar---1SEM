/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dabestpizza;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import textui.TextUI;

/**
 *
 * @author Obaydah Mohamad
 */
public class Controller {

    PizzaMenu m = new PizzaMenu();
    private ArrayList<Object> currentOrder = new ArrayList();
    private ArrayList<Object> allOrders = new ArrayList();
    String[] mOeChoices = {"Tilføj mere til ordren", "Placer ordre"};
    private Orders orders = new Orders(allOrders);
    String[] removeChoices = {"Ja", "Nej"};
//    String[] removeWhatChoices = {listSize}
    //File f = new File();
    

    public void addToOrder() {
        TextUI.clear(200);
        int pizzaChoice = TextUI.choice(m.getAllPizzas());
        Pizza pizza = (Pizza) m.getAllPizzas().get(pizzaChoice - 1);
        currentOrder.add(pizzaChoice);
        TextUI.clear(200);
        System.out.println(pizza.getPizzaName() + " er blevet tilføjet.\n");

        moreOrEnd();
    }

    public void moreOrEnd() {

        int mOeChoice = TextUI.choice(mOeChoices);
        if (mOeChoice == 1) {
            addToOrder();
            TextUI.clear(200);
        } else if (mOeChoice == 2) {
            finishOrder();
            TextUI.clear(200);

        }
    }

    public void removeOrders() throws IOException {
        
        if(orders.getOrders().size() > 0){
            TextUI.println("Vil du afslutte en bestilling? \n");
            int removeChoice = TextUI.choice(removeChoices);
            TextUI.clear(200);
            if (removeChoice == 1) {

                TextUI.print("Hvilken ordre vil du fjerne? Skriv venligst ordrens ordrenr: ");
                int nr = TextUI.getInteger();
                boolean orderExists = false;
                Order order = new Order(new ArrayList());
                for(int i = 0; i < orders.getOrders().size(); i++){
                    order = (Order) orders.getOrders().get(i);
                    if(order.getOrderId() == nr){
                        orderExists = true;
                        break;
                    }
                }
                
                if(orderExists){
                    addToFile("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\PizzaOrders.txt", order);
                    TextUI.clear(200);
                    TextUI.println("Bestillingen er fjernet og gemt.\n");
                }else{
                    TextUI.clear(200);
                    System.out.println("Ordren eksisterer ikke.");
                }
                
                
                //ordren removes først i file-klassen da den først skal udskrives i filen.
                //orders.getOrders().remove(nr);
                //f.addToFile("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\PizzaOrders.txt");

            }
            if (removeChoice == 2) {
                return;
            }
        }else{
            System.out.println("Der er ingen bestillinger i øjeblikket.\nTryk på en tast for at komme tilbage til menuen.");
            if("".equals(TextUI.getString()));
        }
    }

    public void finishOrder() {
        orders.add(new Order(currentOrder));
        currentOrder.clear();
    }

    public Orders getOrders() {
        return orders;
    }

    public int listSize() {
        int n = 0;
        for (int i = 0; i < orders.getOrders().size(); i++) {
            n = i;
        }
        return n;
    }
    
    public void addToFile(String outputFileName, Order order) throws IOException {
        
        try(FileWriter fw = new FileWriter(outputFileName, true);
            //BufferedWriter bw = new BufferedWriter(fw);
            /*PrintWriter out = new PrintWriter(bw)*/)
        {
            String finishedOrders = "" + order;
            fw.write(finishedOrders);
            orders.getOrders().remove(order);
            //more code
        } catch (IOException e) {
            System.err.println("Found IOException: " + e.getMessage());
        }
        
    }

}