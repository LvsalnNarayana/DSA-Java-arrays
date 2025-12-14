package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 24. Find floor of a number
*/
public class FloorOfNumber {
    public static int BinarySearch(List<Integer> givenArray, int target) throws Exception {
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

    public static int method1(List<Integer> givenArray, int target) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        Integer floorNumber = Integer.MIN_VALUE;

        int left = 0;
        int right = givenArray.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = givenArray.get(mid);

            if (midValue == target) {
                return midValue;
            } else if (midValue > target) {
                right = mid - 1;
            } else if (midValue < target) {
                floorNumber = midValue;
                left = mid + 1;
            }
        }
        if (floorNumber == Integer.MIN_VALUE) {
            throw new Exception("No floor value exists (all elements > target)");

        }
        return floorNumber;

    }

    public static void main(String[] args) {
        System.out.println("Floor Of Number output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 6, 7));
        int target = 5;
        try {
            System.out.println(method1(givenArray, target));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}