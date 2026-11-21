class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length-1;
        int score = Integer.MAX_VALUE;
        score = Math.min(Math.abs(nums[l] - nums[2]), score);
        score = Math.min(Math.abs(nums[l-2] - nums[0]), score);
        score = Math.min(Math.abs(nums[l-1] - nums[1]), score);
        return score;
    }
}