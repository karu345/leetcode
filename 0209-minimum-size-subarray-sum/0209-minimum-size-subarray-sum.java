class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < target) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int currSum = 0;
        int currIdx = Integer.MAX_VALUE;
        while (r < nums.length) {
            if (currSum < target) {
                currSum += nums[r];
                r++;
            }
            while (l <= r && currSum >= target) {
                currIdx = (r - l);
                if (ans > currIdx) {
                    ans = currIdx;
                }
                currSum -= nums[l];
                l++;
            }
        }
        return ans;
    }
}