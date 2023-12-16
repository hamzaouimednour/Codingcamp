package LeetCode;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int x = 0; x < nums.length; x++) {
            for(int i = x+1; i < nums.length; i++) {
                if(nums[i] + nums[x] == target) return new int[]{x,i};
            }
        }
        return new int[]{0, 1};
    }
}
