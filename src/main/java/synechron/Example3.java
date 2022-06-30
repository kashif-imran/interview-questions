package synechron;

import java.math.BigDecimal;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(0.2 - 0.1); //1.9

        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b); //0.30000000000000004

        BigDecimal c = BigDecimal.valueOf(0.1);
        BigDecimal d = BigDecimal.valueOf(0.2);
        System.out.println(c.add(d)); //0.3

    }
}
