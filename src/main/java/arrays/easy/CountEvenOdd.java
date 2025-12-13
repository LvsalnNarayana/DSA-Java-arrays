package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 16. Count even and odd numbers 
*/
public class CountEvenOdd {

    public static void method1(List<Integer> givenArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int number : givenArray) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Count : " + evenCount + " Odd Count : " + oddCount);

    }

    public static void main(String[] args) {
        System.out.println("Even and Odd Count output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        try {
            method1(givenArray);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
