package arrays.easy;

import java.util.ArrayList;
import java.util.List;

/* 
* 12. Left rotate array by D (simple)  
* Review : In Place Swap method technique
 */
public class LeftRotateByD {
    public static void swap(List<Integer> givenArray, int firstIndex, int secondIndex) {
        int temp = givenArray.get(firstIndex);
        givenArray.set(firstIndex, givenArray.get(secondIndex));
        givenArray.set(secondIndex, temp);
    }

    public static List<Integer> method1(List<Integer> givenArray, int position) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        if (position == 0 || position == givenArray.size()) {
            return givenArray;
        }
        if (position > givenArray.size() || position < 0) {
            throw new Exception("Invalid position values");
        }
        List<Integer> toRotate = new ArrayList<>();
        for (int j = 0; j < position; j++) {
            toRotate.add(givenArray.get(j));
        }
        for (int i = 0; i < (givenArray.size() - position); i++) {
            givenArray.set(i, givenArray.get((i + position)));
        }
        for (int k = 0; k < position; k++) {
            givenArray.set((k + givenArray.size() - position), toRotate.get(k));
        }
        return givenArray;
    }

    public static List<Integer> method2(List<Integer> givenArray, int position) throws Exception {
        if (givenArray == null || givenArray.isEmpty()) {
            throw new Exception("Given Array is null");
        }
        if (position == 0 || position == givenArray.size()) {
            return givenArray;
        }
        if (position > givenArray.size() || position < 0) {
            throw new Exception("Invalid position values");
        }
        for (int i = 0, j = position - 1; i < j; i++, j--) {
            swap(givenArray, i, j);
        }
        for (int i = position, j = givenArray.size() - 1; i < j; i++, j--) {
            swap(givenArray, i, j);
        }
        for (int i = 0, j = givenArray.size() - 1; i < j; i++, j--) {
            swap(givenArray, i, j);
        }
        return givenArray;
    }

    public static void main(String[] args) {
        System.out.println("Left Rotate Array By D output:");
        List<Integer> givenArray = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        int position = 3;
        try {
            // System.out.println(method1(givenArray, position));
            System.out.println(method2(givenArray, position));
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
