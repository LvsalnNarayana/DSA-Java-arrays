package arrays.medium;

import java.util.ArrayList;
import java.util.List;

/* 
* 2. Sort colors (0s, 1s, 2s — Dutch National Flag) 
* Review :  Check for 3 - pointer approach
*/
public class SortColors {
    public static void swap(List<Integer> givenArray, int firstIndex, int secondIndex) {
        int temp = givenArray.get(firstIndex);
        givenArray.set(firstIndex, givenArray.get(secondIndex));
        givenArray.set(secondIndex, temp);
    }

    public static void method1(List<Integer> givenArray) throws Exception {
        int i = 0;
        int j = givenArray.size() - 1;
        int k = 0;
        while (k <= j) {
            int KValue = givenArray.get(k);
            if (KValue == 1) {
                k++;
            } else if (KValue == 0) {
                swap(givenArray, k, i);
                i++;
                k++;
            } else if (KValue == 2) {
                swap(givenArray, k, j);
                j--;
            }
        }
        System.out.println(givenArray);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Sort Colors output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 0, 2, 1, 0, 2));
        method1(givenArray);
    }
}
