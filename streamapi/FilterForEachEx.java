package streamapi;

import java.util.ArrayList;

public class FilterForEachEx {

    static ArrayList<Double> prices = new ArrayList<>();

    public static void main(String[] args) {
        prices.add(1.11);
        prices.add(4.99);
        prices.add(15.99);
        prices.add(10.99 );

        // filterLowPrices();
        // filterLambdaStream();
        filterLambdaStreamConcise();
    }

    public static void filterLowPrices() {
        System.out.println("low prices");

        for(int i=0; i< prices.size(); i++) {
            if(prices.get(i)<5) {
                System.out.println(prices.get(i));
            }
        }
    }

    public static void filterLambdaStream() {

        /* 
            filter() :-- filter(element-> {
                return boolean
            })
        */

        // forEach() is a Terminal operation

        prices.stream()
                    .filter((price) -> {
                        return price <5;
                    })
                    .forEach((price)->{
                        System.out.println(price);
                    });
    }

    public static void filterLambdaStreamConcise() {
        // we can remove curly brackets if its one line in lambda expression
        prices.stream()
            .filter((price)-> price<5)
            .forEach(System.out::println);
    }    
    
}
