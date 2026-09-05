class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int prevDist = 0;
        int prevSum = 0;
        for(int i = 0; i < nums.length-2; i++){
            int curr = nums[i];
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                int sum = curr + nums[l] + nums[r];
                int dist = Math.abs(sum - target);
                if((sum - target) == 0){
                    return target;
                }else if(sum > target){
                    r--;
                }else{
                    l++;
                }
                if(dist < prevDist || prevDist == 0){
                    prevSum = sum;
                    prevDist = dist;
                }
            }
        }
        return prevSum;
    }
}