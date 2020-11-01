/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dabestpizza;

import java.io.IOException;
import textui.TextUI;

/**
 *
 * @author Obaydah Mohamad
 */
public class Menu {
    Controller c = new Controller();
    String[] mChoices = {"Vis menukort", "Vis bestillinger"};
    
    public void getMenu() throws IOException{
        TextUI.clear(200);
        while(true){
            int choice = TextUI.choice(mChoices);

            if(choice == 1){
                showPizzaMenu();
            }else if(choice == 2){
                showAllOrders();
            }
        }
    }

    private void showPizzaMenu() {
        c.addToOrder();
    }

    private void showAllOrders() throws IOException {
        TextUI.clear(200);
        System.out.println(c.getOrders());
        TextUI.clear(2);
        c.removeOrders();
//        }
//        catch(IOException e){
//            System.err.println("Caught IOException: " + e.getMessage());
//        }
    }
}
