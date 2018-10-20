
package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.es");
        
        new HistogramDisplay(histogram).execute();
        
    }
    
}
