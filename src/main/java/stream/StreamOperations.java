package stream;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import model.Product;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Stream operations are divided into intermediate and terminal operations,

Intermediate operations transform a stream into another stream, such as filtering, sorting, element transformation (mapping)
*/
public class StreamOperations {
    public static void main(String[] args) {
        List<Product> productsList = getProducts();

        String name = "kashif";

        IntStream chars = name.chars();
        chars.mapToObj(i -> (char)i).filter(c -> c == 'i').findAny().isPresent();

        // This is more compact approach for filtering data
        productsList.stream().filter(p -> p.getPrice() > 30000).forEach(System.out::println);

        // Converting product List into Set
        Set<Integer> productPriceSet = productsList.stream().map(p -> p.getPrice()).collect(Collectors.toSet());
        System.out.println(productPriceSet);

        // max() method to get max Product price
        Product maxPriceProduct = productsList.stream().max((p1, p2) -> p1.getPrice() - p2.getPrice()).get();
        System.out.println(maxPriceProduct);

        //min() method to get min Product price
        Product minPriceProduct = productsList.stream().min((p1, p2) -> p1.getPrice() - p2.getPrice()).get();
        System.out.println(minPriceProduct);

        //convert array to stream
        List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        //or
        Stream<String> stream2 = Stream.of("JAVA", "J2EE", "Spring", "Hibernate");
        stream2.forEach(System.out::println);

       /*
       stream2.forEach(System.out::println);
       //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
       //Stream can be traversed only once
       */

        //flatMap()
/*
        To understand what flattening a stream consists in, consider a structure like [ [1,2,3],[4,5,6],[7,8,9] ]
        which has "two levels". It's basically a big List containing three more List. Flattening this means
        transforming it in a "one level" structure e.g. [ 1,2,3,4,5,6,7,8,9 ] i.e. just one list.
*/

        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> numbers = Stream.of(evens, odds, primes)
                .flatMap(numList -> numList.stream())
                .collect(Collectors.toList());
        System.out.println("flattend list: " + numbers);

    }

    private static List<Product> getProducts() {
        List< Product > productsList = new ArrayList< Product >();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000 ));
        productsList.add(new Product(2, "Dell Laptop", 30000 ));
        productsList.add(new Product(3, "Lenevo Laptop", 28000 ));
        productsList.add(new Product(4, "Sony Laptop", 28000 ));
        productsList.add(new Product(5, "Apple Laptop", 90000 ));
        productsList.add(new Product(7, "Xaomi Laptop", 25000 ));
        return productsList;
    }
}
