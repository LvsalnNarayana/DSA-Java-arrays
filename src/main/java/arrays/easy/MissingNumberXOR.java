package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 21. Find missing number using XOR   
* Review: XOR Accumulation
*/
public class MissingNumberXOR {
    public static int method1(List<Integer> givenArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int lastElement = givenArray.get(givenArray.size() - 1);
        int firstElement = givenArray.get(0);
        int test1 = 0;
        int test2 = 0;
        for (int i = firstElement; i < lastElement; i++) {
            test1 ^= i;
        }
        for (int i = 0; i < givenArray.size() - 1; i++) {
            test2 ^= givenArray.get(i);
        }
        return test1 ^ test2;
    }

    public static void main(String[] args) {
        System.out.println("Missing Number using XOR output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 6, 7));
        try {
            System.out.println(method1(givenArray));
            // method1(givenArray);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
