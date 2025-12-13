package arrays.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/*
* 22. Find frequency of all elements
*/
public class ElementFrequency {
    public static void method1(List<Integer> givenArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int number : givenArray) {
            if (!count.containsKey(number)) {
                count.put(number, 1);
            } else {
                count.put(number, count.get(number) + 1);
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("Element Frequency output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, 7, 7));
        try {
            method1(givenArray);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
