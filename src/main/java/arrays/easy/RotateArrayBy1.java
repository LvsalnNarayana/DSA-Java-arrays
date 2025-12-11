package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 12. Rotate array by 1 position
*/
public class RotateArrayBy1 {
    public static List<Integer> method1(List<Integer> givenArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int firstElement = givenArray.get(0);
        for (int i = 0; i < (givenArray.size() - 1); i++) {
            givenArray.set(i, givenArray.get(i + 1));
        }
        givenArray.set(givenArray.size() - 1, firstElement);
        return givenArray;
    }

    public static void main(String[] args) {
        System.out.println("Rotate Array By 1 output:");
        List<Integer> givenArray = new ArrayList<>(List.of(2, 3, 4, 5, 12, 32, 14, 5));
        try {
            System.out.println(method1(givenArray));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
