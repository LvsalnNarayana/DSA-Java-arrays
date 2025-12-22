package arrays.medium;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

/* 
* 6. Intersection of two arrays
 */
public class ArrayIntersection {
    public static void method1(List<Integer> array1, List<Integer> array2) throws Exception {
        Map<Integer, Integer> array1Map = new HashMap<>();
        for (Integer number : array1) {
            array1Map.put(number, array1Map.get(number) != null ? array1Map.get(number) + 1 : 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Integer number : array2) {
            if (array1Map.get(number) != null && array1Map.get(number) > 0) {
                result.add(number);
                array1Map.put(number, array1Map.get(number) - 1);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Array Intersection output:");
        List<Integer> array1 = new ArrayList<>(List.of(1, 2, 3, 3, 5, 6));
        List<Integer> array2 = new ArrayList<>(List.of(4, 5, 6));
        method1(array1, array2);
    }
}
