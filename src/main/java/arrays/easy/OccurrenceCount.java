package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 4. Count occurrences of a number 
*/
public class OccurrenceCount {
    static int count = 0;

    public static int method1(List<Integer> givenArray, int target) {
        for (int number : givenArray) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Occurrence Count in Array output:");
        List<Integer> givenArray = new ArrayList<>(List.of(2, 3, 1, 4, 5, 6, 12, 32, 4, 5));
        int target = 33;
        System.out.println(method1(givenArray, target));
    }
}
