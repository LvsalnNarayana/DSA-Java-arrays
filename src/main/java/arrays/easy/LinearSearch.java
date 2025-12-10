package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 3. Linear search for a target
*/
public class LinearSearch {

    public static int method1(List<Integer> givenArray, int target) {
        for (int i = 0; i < givenArray.size(); i++) {
            if (givenArray.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Linear Search output:");
        List<Integer> givenArray = new ArrayList<>(List.of(2, 3, 1, 4, 5, 6, 12, 32, 4, 5));
        int target = 33;
        System.out.println(method1(givenArray, target));
    }
}
