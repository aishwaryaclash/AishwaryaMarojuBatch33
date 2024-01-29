package arraylists;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];


            if (numIndexMap.containsKey(complement)) {

                return new int[]{numIndexMap.get(complement), i};
            }


            numIndexMap.put(nums[i], i);
        }


        return new int[]{-1, -1};
    }

    /*public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] resultIndices = findTwoSumIndices(nums, target);


        System.out.println("Input array: " + java.util.Arrays.toString(nums));
        System.out.println("Target sum: " + target);
        System.out.println("Output indices: " + java.util.Arrays.toString(resultIndices));
    }*/
}
