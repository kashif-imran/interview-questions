package synechron;

import java.math.BigDecimal;

/*
BigDecimal represents an immutable arbitrary-precision signed decimal number. It consists of two parts:

Unscaled value – an arbitrary precision integer
Scale – a 32-bit integer representing the number of digits to the right of the decimal point
For example, the BigDecimal 3.14 has the unscaled value of 314 and the scale of 2.

We use BigDecimal for high-precision arithmetic. We also use it for calculations requiring control over scale and rounding off behavior.
 One such example is calculations involving financial transactions.
 */
public class CalculateInterest {
    public static void main(String[] args) {
        System.out.println(getInterest(BigDecimal.valueOf(100000), 5));

    }

    public static BigDecimal getInterest(BigDecimal principle, double percentage) {
        return principle.multiply(BigDecimal.valueOf(percentage/100));
    }
}
