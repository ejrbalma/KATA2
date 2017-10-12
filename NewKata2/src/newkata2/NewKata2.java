package newkata2;

import java.util.HashMap;

public class NewKata2 {

    public static void main(String[] args) {
        Integer [] vector = {1, 3, 5, 7, 9, 1, 5, 4, 3, 9,100,-4};
        // String[] vector = {"Ana", "Juan", "Elena", "Elena", "Juan", "Ana", "Pedro", "Ana"};
       
        Histogram <Integer> histogram = CalculaHistogram.computeHistogram(vector);
        
        // Comentario 2 
        // Comentario 6
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " --> " + histogram.get(key));
        }
        
    }
    
}
