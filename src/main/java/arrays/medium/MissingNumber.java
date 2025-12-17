package arrays.medium;

import java.util.LinkedList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
* 4. Missing numbers when multiple are missing (hash/map)
 */
public class MissingNumber {

    public static void method1(List<Integer> givenArray, int range) throws Exception {
        Map<Integer, Boolean> rangeMap = new LinkedHashMap<>();
        for (Integer i = 1; i <= range; i++) {
            rangeMap.put(i, Boolean.valueOf(false));
        }
        for (int number : givenArray) {
            rangeMap.put(Integer.valueOf(number), true);
        }
        List<Integer> newRangeMap = new LinkedList<>(rangeMap.keySet());
        newRangeMap.removeIf(value -> rangeMap.get(value) == true);
        System.out.println(newRangeMap);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Multiple Missing Numbers output:");
        int range = 10;
        List<Integer> givenArray = new LinkedList<>(List.of(1, 3, 5, 6, 8));
        method1(givenArray, range);
    }
}
