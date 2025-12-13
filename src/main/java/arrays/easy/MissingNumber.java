package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 20. Find missing number from 0–n (sum formula)    
*/
public class MissingNumber {
    public static int method1(List<Integer> givenArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int lastElement = givenArray.get(givenArray.size() - 1);
        int sum = (lastElement * (lastElement + 1)) / 2;
        int currentSum = 0;
        for (int number : givenArray) {
            currentSum += number;
        }
        return sum - currentSum;
    }

    public static void main(String[] args) {
        System.out.println("Missing Number output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 7));
        try {
            System.out.println(method1(givenArray));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
