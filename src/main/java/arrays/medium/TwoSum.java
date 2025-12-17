package arrays.medium;

import java.util.ArrayList;
import java.util.List;

/* 
* 1. Two-sum (sorted array, two pointers) 
*/
public class TwoSum {
    public static void method1(List<Integer> givenArray, int target) throws Exception {
        int i = 0;
        int j = givenArray.size() - 1;
        while (i < j) {
            int IValue = givenArray.get(i);
            int JValue = givenArray.get(j);
            if ((IValue + JValue) == target) {
                // System.out.println(
                // "Equals Condition : IValue:" + IValue + ", JValue: " + JValue + ", Index: " +
                // i + ", " + j
                // + "Sum: " + (IValue + JValue));
                System.out.println(i + ", " + j);
                return;
            } else if ((IValue + JValue) > target) {
                // System.out.println(
                // "Greater Condition : IValue:" + IValue + ", JValue: " + JValue + ", Index: "
                // + i + ", " + j
                // + "Sum: " + (IValue + JValue));
                j--;
            } else if ((IValue + JValue) < target) {
                // System.out.println(
                // "Less Than Condition : IValue:" + IValue + ", JValue: " + JValue + ", Index:
                // " + i + ", " + j
                // + "Sum: " + (IValue + JValue));
                i++;
            }
        }
        throw new Exception("No Pairs Found");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Two Sum output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        int target = 18;
        method1(givenArray, target);
    }
}
