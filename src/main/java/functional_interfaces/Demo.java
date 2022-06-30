package functional_interfaces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Demo {
    /*
    Functional interfaces are of 4 types
    1. Predicate - boolean result = test(param) method
    2. Consumer - no result = accept(param) method
    3. Function - input and output = apply(param) method
    4. Supplier - no input only supply = get() method
     */

    //predicate
    @Test
    @DisplayName("Predicate test to check length of string")
    void predicateTest() {
        Predicate<String> checkLength = str -> str.length() > 5;
        assertEquals(true, checkLength.test("kashif")); //predicate has test method
    }

    //consumer - modifies data -- gives no output
    @Test
    void consumerTest() {
        Person p = new Person();
        Consumer<Person> setName = t -> t.setName("Kashif");
        setName.accept(p); // consumer has accept method
        assertEquals("Kashif", p.getName());
    }

    //Function - input and output
    //
    @Test
    void functionTest() {
        Function<Integer, String> convertToString = t -> t + "";
        // Function<Integer, String> takes Input as integer and String as output
        assertEquals("10", convertToString.apply(10));

    }

    //Supplier - no input only output
    @Test
    void supplierTest() {
        Supplier<Double> getRandomDouble = () -> Math.random();
        System.out.println(getRandomDouble.get()); // get()
    }


    @Test
    void customFunctionalInterface() {
        String[] strings = new String[] {"1", "2", "3", "4"};
    }

    @Test
    void compose() {
    /*The Function interface also has a default compose method that allows us to combine
    several functions into one and execute them sequentially:*/

        Function<Integer, String> intToString = Object::toString;
        Function<String, String> quote = s -> "'" + s + "'";

        Function<Integer, String> quoteIntToString = quote.compose(intToString);
        System.out.println(quoteIntToString);
    }

    @Test
    void computeIfAbsent() {
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", (s) -> s.length());

        assertEquals(4, value);
    }
}
