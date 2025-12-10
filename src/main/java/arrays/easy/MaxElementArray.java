package arrays.easy;

import java.util.List;
import java.util.ArrayList;

/* 
* 1.Find maximum element in array
*/
public class MaxElementArray {
    static int max;

    public static int method1(List<Integer> givenArray) {
        max = givenArray.get(0);
        for (int number : givenArray) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max Element in given Array output:");
        List<Integer> givenArray = new ArrayList<>(List.of(2, 3, 4, 5, 6, 12, 32, 4, 5));
        System.out.println(method1(givenArray));
    }
}
