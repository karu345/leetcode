class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int prefixL[] = new int[n];
        int prefixR[] = new int[n];
        prefixL[0] = nums[0];
        prefixR[n-1] = nums[n-1]; 
        for(int i = 1; i < n; i++){
            prefixL[i] = prefixL[i-1] * nums[i];
        }
        for(int i = n-2; i >= 0; i--){
            prefixR[i] = prefixR[i+1] * nums[i];
        }
        for(int i = 0; i < n; i++){
            if(i == 0){
                ans[i] = prefixR[i+1];
            }else if(i == n-1){
                ans[i] = prefixL[i-1];
            }else{
                ans[i] = prefixL[i-1] * prefixR[i+1];
            }
        }
        return ans;
    }
}