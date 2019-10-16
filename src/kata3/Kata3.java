package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histograma<String> histogram = new Histograma<>();
        
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("gmail.com");
        
        
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
        
    }
    
}
