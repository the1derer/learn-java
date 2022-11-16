package streamapi;

import java.util.ArrayList;
import java.util.stream.Collectors;

    /*
     * collect():
     *  - Terminal operation and ends the pipeline.
     *  - Returns the updated sequence of objects.
     * 
     *  Eg.
     *      .Collect(Collectors.toList()) // returns the updated sequence as a list
      */

public class CollectEx {

    static ArrayList<Double> prices = new ArrayList<>();

    public static void main(String[] args) {
        prices.add(1.11);
        prices.add(4.99);
        prices.add(15.99);
        prices.add(10.99 );

        ArrayList<Double> lowPrices = new ArrayList<>();

        // filterLowPrices(lowPrices);
        lowPrices.addAll(
            prices.stream()
            .filter((price) -> price < 5 )
            .collect(Collectors.toList())
        );

        lowPrices.forEach((price)-> System.out.println(price));
    }

    public static void filterLowPrices(ArrayList<Double> lowPrices) {
        System.out.println("low prices");

        for(int i=0; i< prices.size(); i++) {
            if(prices.get(i)<5) {
                lowPrices.add(prices.get(i));
            }
        }
    }
    
}
