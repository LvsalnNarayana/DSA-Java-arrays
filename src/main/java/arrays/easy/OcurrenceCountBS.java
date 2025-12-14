package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 26. Count how many times target appears (using BS idea)
* Review : Sentinel values, 2 phase loops, condition checks in 2 phase loops
 */
public class OcurrenceCountBS {
    public static int method1(List<Integer> givenArray, int target) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int firstIndex = -1;
        int lastIndex = -1;

        int left = 0;
        int right = givenArray.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = givenArray.get(mid);

            if (midValue == target) {
                firstIndex = mid;
                right = mid - 1;
            } else if (midValue < target) {
                left = mid + 1;
            } else if (midValue > target) {
                right = mid - 1;
            }
        }
        left = 0;
        right = givenArray.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = givenArray.get(mid);

            if (midValue == target) {
                lastIndex = mid;
                left = mid + 1;
            } else if (midValue > target) {
                right = mid - 1;
            } else if (midValue < target) {
                left = mid + 1;
            }
        }
        if (firstIndex == -1) {
            return 0;
        }
        return lastIndex - firstIndex + 1;

    }

    public static void main(String[] args) {
        System.out.println("Ocurrence Count using BS output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 1, 2, 2, 2, 2, 3, 4, 6, 7));
        int target = 2;
        try {
            System.out.println(method1(givenArray, target));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
