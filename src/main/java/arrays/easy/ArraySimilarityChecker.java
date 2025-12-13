package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 19. Check if two arrays are equal   
*/
public class ArraySimilarityChecker {

    public static Boolean method1(List<Integer> givenArray, List<Integer> toCompareArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty() || toCompareArray == null || toCompareArray.isEmpty()
                || givenArray.size() != toCompareArray.size()) {
            return false;
        }
        for (int i = 0; i < givenArray.size(); i++) {
            if (!givenArray.get(i).equals(toCompareArray.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Array Similarity Checker output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        List<Integer> toCompareArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 8));
        try {
            System.out.println(method1(givenArray, toCompareArray));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}

