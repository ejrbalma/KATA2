package newkata2;

public class CalculaHistogram {

    public static <T> Histogram <T> computeHistogram (T[] vector){
        
        Histogram <T> histo = new Histogram<> ();
        for (T key : vector) {
            // Añadimos un mensaje ...
            histo.increment(key);
        }
        return histo;
    }
    
    
}
