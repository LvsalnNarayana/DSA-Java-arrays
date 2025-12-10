package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
 * 9. Remove duplicates from sorted array     
 */
public class RemoveDuplicates {

    public static List<Integer> method1(List<Integer> givenArray) {
        List<Integer> resultArray = new ArrayList<>();

        if (givenArray == null || givenArray.isEmpty()) {
            return resultArray;
        }

        for (int i = 0; i < givenArray.size() - 1; i++) {
            if (!givenArray.get(i).equals(givenArray.get(i + 1))) {
                resultArray.add(givenArray.get(i));
            }
        }

        // Add the last element (always unique at this point)
        resultArray.add(givenArray.get(givenArray.size() - 1));

        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println("Remove duplicates output:");
        List<Integer> givenArray = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 5, 5, 6, 7, 7, 8, 8, 8)
        );
        System.out.println(method1(givenArray));
    }
}
