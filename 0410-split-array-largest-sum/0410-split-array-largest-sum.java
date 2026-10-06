class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;
        for(int i = 0; i < nums.length; i++){
            s = Math.max(s, nums[i]);
            e += nums[i];
        }
        while(s < e){
            int m = (s+e)/2;

            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > m){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > k){
                s = m + 1;
            }else{
                e = m;
            }
        }
        return e;
    }
}