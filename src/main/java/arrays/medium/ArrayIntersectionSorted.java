package arrays.medium;

import java.util.ArrayList;
import java.util.List;

/* 
* 6.Intersection of two arrays 
*/
public class ArrayIntersectionSorted {
    public static void method1(List<Integer> array1, List<Integer> array2) throws Exception {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i) == array2.get(j)) {
                    result.add(array2.get(j));
                }
            }
        }
        System.out.println(result);
    }

    public static void method2(List<Integer> array1, List<Integer> array2) throws Exception {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < array1.size() && j < array2.size()) {
            if (array1.get(i) < array2.get(j)) {
                i++;
            } else if (array1.get(i) > array2.get(j)) {
                j++;
            } else if (array1.get(i).equals(array2.get(j))) {
                result.add(array1.get(i));
                i++;
                j++;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Array Intersection Sorted output:");
        List<Integer> array1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> array2 = new ArrayList<>(List.of(4, 5, 6));
        method2(array1, array2);
    }
}
