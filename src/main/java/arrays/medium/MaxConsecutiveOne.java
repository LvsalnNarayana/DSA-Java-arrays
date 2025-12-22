package arrays.medium;

import java.util.ArrayList;
import java.util.List;

/* 
* 10.Max consecutive ones 
*/
public class MaxConsecutiveOne {
    public static void method1(List<Integer> array1) throws Exception {
        int length = 0;
        int temp = 0;
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) == 1) {
                temp++;
                if (temp > length) {
                    length = temp;
                }
            } else {
                if (temp > length) {
                    length = temp;
                }
                temp = 0;
            }
        }
        System.out.println(length);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Max Consecutive Ones output:");
        List<Integer> array1 = new ArrayList<>(List.of(1, 1, 2, 3, 1, 1, 1, 4, 5, 6, 1, 1, 1, 1, 7, 8));
        method1(array1);
    }
}
