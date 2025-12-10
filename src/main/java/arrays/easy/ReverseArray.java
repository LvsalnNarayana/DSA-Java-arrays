package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 7. Reverse an array (iterative) 
 */
public class ReverseArray {
    public static void swap(List<Integer> givenArray, int firstIndex, int secondIndex) {
        int temp = givenArray.get(firstIndex);
        givenArray.set(firstIndex, givenArray.get(secondIndex));
        givenArray.set(secondIndex, temp);
    }

    public static List<Integer> method1(List<Integer> givenArray) {

        for (int i = 0, j = givenArray.size() - 1; i < j; i++, j--) {
            swap(givenArray, i, j);
        }
        return givenArray;
    }

    public static void main(String[] args) {
        System.out.println("Reverse Array output:");
        List<Integer> givenArray = new ArrayList<>(List.of(2, 3, 4, 5, 12, 32, 4, 5));
        System.out.println(method1(givenArray));
    }
}
