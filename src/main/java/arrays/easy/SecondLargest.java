package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 10. Find second largest element 
* Review : Sentinels concept
*/
public class SecondLargest {

    public static int method1(List<Integer> givenArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : givenArray) {
            if (number > largest) {
                largest = number;
            }
        }
        for (int number : givenArray) {
            if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println("Second Largest element output:");
        List<Integer> givenArray = new ArrayList<>(List.of(2, 3, 4, 5, 12, 32, 14, 5));
        try {
            System.out.println(method1(givenArray));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
