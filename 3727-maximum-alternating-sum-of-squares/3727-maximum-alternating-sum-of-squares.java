class Solution {
    public long maxAlternatingSum(int[] nums) {
        long score = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int l = 0;
        int r = n-1;
        while(l < r){
            score += (((long)nums[r] * nums[r])-((long)nums[l] * nums[l]));
            r--;
            l++;
        }
        if(n % 2 != 0){
            score += ((long)nums[l] * nums[l]);
        }
        return score;
    }
}