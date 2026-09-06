class Solution {
    public int pivotIndex(int[] nums) {
        int pre[] = new int[nums.length];
        pre[0] = nums[0];
        for(int i = 1; i < pre.length; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                if((pre[pre.length-1] - nums[i]) == 0){
                    return i;
                }
            }else if(i == nums.length-1){
                if((pre[i-1] == 0)){
                    return i;
                }
            }else{
                if(pre[i-1] == (pre[pre.length-1] - pre[i])){
                    return i;
                }
            }    
        }
        return -1;
    }
}