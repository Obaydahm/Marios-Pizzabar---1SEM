/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dabestpizza;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Obaydah Mohamad
 */
public class File {

    private ArrayList<Object> allOrders = new ArrayList();
    private Orders orders = new Orders(allOrders);
    
    public void addToFile(String outputFileName, int nr) throws IOException {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(outputFileName));
            
            //får fejl i nedenstående linje (linje 27)

            String finishedOrders = "" + orders.getOrders().get(nr);
            out.write(finishedOrders);
            out.newLine();
            orders.getOrders().remove(nr);

        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());

        } finally {
            out.close();
        }

    }

}
