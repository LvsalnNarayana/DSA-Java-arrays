package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 8. Merge two sorted arrays (simple merge)
*/
public class MergeSortedArray {

    static List<Integer> resultArray = new ArrayList<>();

    public static List<Integer> method1(List<Integer> sortedArray1, List<Integer> sortedArray2) {
        int i = 0;
        int j = 0;
        while (i < sortedArray1.size() && j < sortedArray2.size()) {
            if (sortedArray1.get(i) > sortedArray2.get(j)) {
                resultArray.add(sortedArray2.get(j));
                j++;
            } else {
                resultArray.add(sortedArray1.get(i));
                i++;
            }
        }
        for (; i < sortedArray1.size(); i++) {
            resultArray.add(sortedArray1.get(i));
        }
        for (; j < sortedArray2.size(); j++) {
            resultArray.add(sortedArray2.get(j));
        }
        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println("Merge Array output:");
        List<Integer> sortedArray1 = new ArrayList<>(List.of(2, 3, 4, 5));
        List<Integer> sortedArray2 = new ArrayList<>(List.of(5, 6, 7, 8, 9, 10));
        System.out.println(method1(sortedArray1, sortedArray2));
    }
}
