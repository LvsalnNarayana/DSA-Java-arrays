package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 5. Sum of all elements   
*/
public class SumOfElements {
    static int sum = 0;

    public static int method1(List<Integer> givenArray) {
        for (int number : givenArray) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum Of Elements in Array output:");
        List<Integer> givenArray = new ArrayList<>(List.of(2, 3, 1, 4, 5, 6, 12, 32, 4, 5));
        System.out.println(method1(givenArray));
    }
}
