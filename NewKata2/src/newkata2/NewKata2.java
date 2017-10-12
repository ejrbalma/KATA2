/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newkata2;

import java.util.HashMap;

/**
 *
 * @author ejrbalma
 */
public class NewKata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer [] vector = {1, 3, 5, 7, 9, 1, 5, 4, 3, 9,100,-4};
        // String[] vector = {"Ana", "Juan", "Elena", "Elena", "Juan", "Ana", "Pedro", "Ana"};
       
        // Comentario 1
        // Comentario 4
        // Comentario 3

        
        Histogram <Integer> histogram = CalculaHistogram.computeHistogram(vector);
        
        // Comentario 2 
        // Comentario 5
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " --> " + histogram.get(key));
        }
        
    }
    
}
