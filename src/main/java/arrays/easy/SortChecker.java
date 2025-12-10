package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 6. Check if array is sorted  
*/
public class SortChecker {
    public static Boolean method1(List<Integer> givenArray) {
        for (int i = 0; i < (givenArray.size() - 1); i++) {
            if (givenArray.get(i) > givenArray.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Check Array Sorted output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 56, 3));
        System.out.println(method1(givenArray));
    }
}
