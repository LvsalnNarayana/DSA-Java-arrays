package arrays.medium;

import java.util.ArrayList;
import java.util.List;

/* 
* 3. Majority element (Moore’s Voting Algorithm)  
* Review : Yes, Algo review
*/
public class MajorityElement {

    public static void method1(List<Integer> givenArray) throws Exception {
        int candidate = givenArray.get(0);
        int score = 0;
        for (int number : givenArray) {
            if (number == candidate) {
                score++;
            } else if (number != candidate && score != 0) {
                score--;
            } else if (number != candidate && score == 0) {
                candidate = number;
                score++;
            }
        }
        System.out.println(candidate);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Majority Element output:");
        List<Integer> givenArray = new ArrayList<>(List.of(3, 3, 2, 2, 4, 4, 4, 4, 5, 4));
        method1(givenArray);
    }
}
