class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = 1;
        boolean inc = false;
        boolean dec = false;
        int len = 1;
        for(int i = 1; i < nums.length; i++){
            if(inc == true){
                if(nums[i] > nums[i-1]){
                    len++;
                }else{
                    maxLen = Math.max(len, maxLen);
                    len = 1;
                    inc = false;
                    if(nums[i] < nums[i-1]){
                        dec = true;
                        len++;
                    }
                }
            }else if(dec == true){
                if(nums[i] < nums[i-1]){
                    len++;
                }else{
                    maxLen = Math.max(len, maxLen);
                    len = 1;
                    dec = false;
                    if(nums[i] > nums[i-1]){
                        inc = true;
                        len++;
                    }
                }
            }else{
                if(nums[i] > nums[i-1]){
                    len++;
                    inc = true;
                }else if(nums[i] < nums[i-1]){
                    len++;
                    dec = true;
                }
            }
        }
        maxLen = Math.max(len, maxLen);
        return maxLen;
    }
}