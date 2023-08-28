/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        int[] indices = new int[2];
        for (int i = 0; i < indices.length; i++) {
            int other = target - nums[i];
            for (int j = i + 1; j < indices.length; j++) {
                if (other == nums[j]) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return null;
    }
}
// @lc code=end

