package stream_api;

import java.util.ArrayList;
import java.util.stream.Collectors;

/*
 * map()
 * - Updates every element in the sequence
 * 
 * map(element -> {
 * return updated_element;
 * })
 */

public class SteamMapEx {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> withTax = new ArrayList<Double>();

        // tax(withTax);
        
        /* using stream and lambdas

        withTax.addAll(prices.stream()
            .map((price) -> {
                return price * 1.13;
            })
            .collect(Collectors.toList()));
         */

        // cleaning up some more
        withTax.addAll(prices.stream()
            .map((price) -> price*1.13)
            .collect(Collectors.toList())
        );




    }

    public static void tax(ArrayList<Double> withTax) {
        for (int i = 0; i < prices.size(); i++) {
                withTax.add(prices.get(i) * 1.13);
        }
    }
    
}
