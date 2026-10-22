class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        if(target < nums[s] || target == nums[s]){
            return 0;
        }
        if(target > nums[e]){
            return nums.length;
        }
        while(s <= e){
            int m = s+(e-s)/2;
            if(nums[m] == target){
                return m;
            }else if(m > 0 && (nums[m-1] < target && nums[m] > target)){
                return m;
            }else if(nums[m] < target){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return -1;
    }
}