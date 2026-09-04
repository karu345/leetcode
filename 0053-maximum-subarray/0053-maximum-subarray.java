class Solution {
    public int maxSubArray(int[] nums) {
        // int currSum = 0;
        // int maxSum = Integer.MIN_VALUE;
        // if (nums.length == 1) {
        //     return nums[0];
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     currSum += nums[i];
        //     if (currSum < 0) {
        //         currSum = 0;
        //     }
        //     maxSum = Math.max(maxSum, currSum);
        // }
        // if (maxSum == 0) {
        //     maxSum = Integer.MIN_VALUE;
        //     for (int i = 0; i < nums.length; i++) {
        //         maxSum = Math.max(nums[i], maxSum);
        //     }
        // }
        // return maxSum;
        int max = Integer.MIN_VALUE;
        int currS = 0;
        for(int i = 0; i < nums.length; i++){
            if(currS + nums[i] < 0){
                currS = 0;
            }else{
                currS += nums[i];
                max = Math.max(max, currS);
            }
        }
        if(max == Integer.MIN_VALUE){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > max){
                    max = nums[i];
                }
            }
        }
        return max;
    }
}