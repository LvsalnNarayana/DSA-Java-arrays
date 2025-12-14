package arrays.easy;

import java.util.ArrayList;
import java.util.List;
/* 
* 24. Find Ceil of a number
*/
public class CeilOfNumber {
     public static int method1(List<Integer> givenArray, int target) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        Integer ceilNumber = Integer.MIN_VALUE;

        int left = 0;
        int right = givenArray.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = givenArray.get(mid);

            if (midValue == target) {
                return midValue;
            } else if (midValue > target) {
                ceilNumber = midValue;
                right = mid - 1;
            } else if (midValue < target) {
                left = mid + 1;
            }
        }
        if (ceilNumber == Integer.MIN_VALUE) {
            throw new Exception("No floor value exists (all elements > target)");

        }
        return ceilNumber;

    }

    public static void main(String[] args) {
        System.out.println("Ceil Of Number output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 6, 7));
        int target = 5;
        try {
            System.out.println(method1(givenArray, target));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
