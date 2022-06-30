package synechron;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThirdLargestElement {

    static int getThirdLargestElement(int[] a, int n) {
        if(a.length == 0) {
            return -1;
        }

        int first = a[0]; //10
        int second = Integer.MIN_VALUE; //4, 5, 7
        int third = Integer.MIN_VALUE; //4, 5
        //index =  0, 1, 2, 3, 4
        //a[]   = 10, 4, 5, 3, 7
        for (int i=1; i < n; i++) {
            if(a[i] > first) {
                third = second;
                second = first;
                first = a[i];
            } else if(a[i] > second) {
                third = second;
                second = a[i];
            } else if(a[i] > third) {
                third = a[i];
            }
        }

        return third;
    }

    @Test
    public void testThirtHighest() {
        int thirdLargestElement = getThirdLargestElement(new int[]{10, 4, 5, 3, 7}, 5);

        Assertions.assertEquals(thirdLargestElement, 5);
    }

}
