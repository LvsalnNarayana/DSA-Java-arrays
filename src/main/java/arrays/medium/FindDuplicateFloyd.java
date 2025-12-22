package arrays.medium;

/* 
* 5. Find duplicate number (Floyd’s cycle detection, no recursion)
* Review : Floyds Detection learn ******
*/
public class FindDuplicateFloyd {

    /**
     * Finds the duplicate number in an array using Floyd's Cycle Detection.
     * Assumptions:
     * - Array contains n+1 integers
     * - Values are in range [1, n]
     * - Exactly one duplicate exists
     * - Read-only array, O(1) space
     */
    public static int findDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        // Phase 1: Detect cycle using tortoise and hare
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow]; // move one step
            fast = nums[fast]; // move two steps
            fast = nums[fast];
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle (the duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // or fast, they meet at the duplicate
    }

    public static void main(String[] args) {
        // Example 1: Standard case
        int[] nums1 = { 1, 3, 4, 2, 2 };
        System.out.println("Duplicate: " + findDuplicate(nums1)); // Output: 2

        // Example 2: Another valid input
        int[] nums2 = { 3, 1, 3, 4, 2 };
        System.out.println("Duplicate: " + findDuplicate(nums2)); // Output: 3

        // Example 3: Your intended values as proper input
        int[] nums3 = { 1, 2, 3, 4, 5, 6, 6, 7 }; // length=8, values should be in [1,7] → 6 is duplicate
        System.out.println("Duplicate: " + findDuplicate(nums3)); // Output: 6
    }
}