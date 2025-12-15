package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/*
* 27. Find the first occurrence using binary search
*/
public class FirstOcurrenceBS {
    public static int method1(List<Integer> givenArray, int target) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int left = 0;
        int right = givenArray.size() - 1;
        int startIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = givenArray.get(mid);
            if (midValue == target) {
                startIndex = mid;
                right = mid - 1;
            } else if (midValue > target) {
                right = mid - 1;
            } else if (midValue < target) {
                left = mid + 1;
            }
        }
        return startIndex;
    }

    public static void main(String[] args) {
        System.out.println("First Ocurrence BS output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 6, 6, 6, 7));
        int target = 6;
        try {
            System.out.println(method1(givenArray, target));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
