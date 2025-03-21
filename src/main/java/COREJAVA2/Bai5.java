package COREJAVA2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai5 {
    //Bài tập 5: Given an array of integers nums and an integer target, return indices of the two numbers such that
    // they add up to target. You may assume that each input would have exactly one solution, and you may not use the
    // same element twice. You can return the answer in any order.
    //	Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static List<Integer> getIndices(List<Integer> nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
            if (map.containsKey(complement)) {
                return Arrays.asList(map.get(complement), i);
            }
            map.put(nums.get(i), i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 9;

        List<Integer> result = getIndices(nums, target);
        System.out.println("Output: " + result);
    }
}
