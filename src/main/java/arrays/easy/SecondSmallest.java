package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 11. Find second smallest element 
* Review : Sentinels concept
*/
public class SecondSmallest {

    public static int method1(List<Integer> givenArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int number : givenArray) {
            if (number < smallest) {
                smallest = number;
            }
        }
        for (int number : givenArray) {
            if (number < secondSmallest && number > smallest) {
                secondSmallest = number;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        System.out.println("Second smallest element output:");
        List<Integer> givenArray = new ArrayList<>(List.of(2, 3, 4, 5, 12, 32, 14, 5));
        try {
            System.out.println(method1(givenArray));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
