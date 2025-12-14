package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 23.Binary search (iterative)
*/
public class BinarySearch {
    public static int method1(List<Integer> givenArray, int target) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int left = 0;
        int right = givenArray.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (givenArray.get(mid).equals(target)) {
                return mid;
            } else if (givenArray.get(mid) > target) {
                right = mid - 1;
            } else if (givenArray.get(mid) < target) {
                left = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("Binary Search output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        int target = 5;
        try {
            System.out.println(method1(givenArray, target));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
