package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 15. Move all zeros to the end   
*/
public class MoveZeroToEnd {
    public static void swap(List<Integer> givenArray, int firstIndex, int secondIndex) {
        int temp = givenArray.get(firstIndex);
        givenArray.set(firstIndex, givenArray.get(secondIndex));
        givenArray.set(secondIndex, temp);
    }

    public static List<Integer> method1(List<Integer> givenArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int i = 0;
        int j = givenArray.size() - 1;
        while (i < givenArray.size() - 1 && i < j) {
            if (givenArray.get(i) == 0) {
                swap(givenArray, i, j);
                j--;
            }
            i++;
        }
        return givenArray;
    }

    public static List<Integer> method2(List<Integer> givenArray) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        int index = 0;
        for (int number : givenArray) {
            if (number != 0) {
                System.out.println("Index : " + index);
                System.out.println("Number : " + number);
                givenArray.set(index, number);
                index++;
            }
        }
        while (index < givenArray.size()) {
            givenArray.set(index, 0);
            index++;
        }
        return givenArray;
    }

    public static void main(String[] args) {
        System.out.println("Move Zeros to end output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 0, 2, 0, 3, 0, 4, 5, 6, 7));
        try {
            // System.out.println(method1(givenArray));
            System.out.println(method2(givenArray));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
