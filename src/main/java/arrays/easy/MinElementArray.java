package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 2.Find minimum element in array     
*/
public class MinElementArray {
    static int min;

    public static int method1(List<Integer> givenArray) {
        min = givenArray.get(0);
        for (int number : givenArray) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Min Element in given Array output:");
        List<Integer> givenArray = new ArrayList<>(List.of(2, 3, 1, 4, 5, 6, 12, 32, 4, 5));
        System.out.println(method1(givenArray));
    }
}
