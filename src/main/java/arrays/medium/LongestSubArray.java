package arrays.medium;

import java.util.ArrayList;
import java.util.List;

/* 8. Longest subarray with sum K (positive numbers) */
public class LongestSubArray {
    public static void method1(List<Integer> array1, int target) throws Exception {
        if (array1.size() == 0) {
            throw new Exception("Array is null");
        }
        int i = 0;
        int j = 1;
        int sum = 0;
        int length = Integer.MIN_VALUE;
        int k = 0, l = 0;
        List<Integer> result = new ArrayList<>();
        if (array1.size() == 1) {
            if (array1.get(0) == target) {
                System.out.println(array1);
                return;
            }
        }
        sum = array1.get(i) + array1.get(j);
        while (i < array1.size() && j < array1.size()) {
            if (sum == target) {
                System.out.println("___________ Sum == Target ____________");
                System.out.println("J = " + j + ", J Value : " + array1.get(j));
                System.out.println("I = " + i + ", I Value : " + array1.get(i));
                System.out.println("Sum = " + sum);
                System.out.println("length = " + length);
                if (j - i > length) {
                    k = i;
                    l = j;
                    length = j - i;
                }
                System.out.println("after declaring, length = " + length);
                System.out.println("Removing : " + array1.get(i) + " from sum : " + sum);
                sum = sum - array1.get(i);
                System.out.println("then Sum = " + sum);
                i++;
                System.out.println("moving i from " + (i - 1) + " to " + i);
                System.out.println("_____________________________________");
            } else if (sum < target) {
                System.out.println("___________ Sum < Target ____________");
                System.out.println("J = " + j + ", J Value : " + array1.get(j));
                System.out.println("I = " + i + ", I Value : " + array1.get(i));
                System.out.println("Sum = " + sum);
                System.out.println("length = " + length);
                System.out.println("Since Sum < Target we are moving J here");
                j++;
                System.out.println("moving j from " + (j - 1) + " to " + j);
                sum = sum + array1.get(j);
                System.out.println("then Sum = " + sum);
                System.out.println("_____________________________________");
            } else if (sum > target) {
                System.out.println("___________ Sum > Target ____________");
                System.out.println("J = " + j + ", J Value : " + array1.get(j));
                System.out.println("I = " + i + ", I Value : " + array1.get(i));
                System.out.println("Sum = " + sum);
                System.out.println("length = " + length);
                System.out.println("Since Sum > Target we are moving I here");
                sum = sum - array1.get(i);
                System.out.println("then Sum = " + sum);
                i++;
                System.out.println("moving i from " + (i - 1) + " to " + i);
                System.out.println("_____________________________________");
            }
        }
        for (; k <= l; k++) {
            result.add(array1.get(k));
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Largest Sub Array output:");
        List<Integer> array1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        int target = 6;
        method1(array1, target);
    }
}
