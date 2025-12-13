package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 18. Find index of last occurrence  
*/
public class LastOcurrenceIndex {
    public static int method1(List<Integer> givenArray, int element) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        for (int i = givenArray.size() - 1; i >= 0; i--) {
            if (givenArray.get(i) == element) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("Last Occurrence Index output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 3, 4, 2, 5));
        int element = 5;
        try {
            System.out.println(method1(givenArray, element));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
