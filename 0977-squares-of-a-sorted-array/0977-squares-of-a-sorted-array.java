class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int l = 0;
        int r = nums.length-1;
        int k = res.length-1;
        while(l <= r){
            int s1 = Math.abs(nums[l]);
            int s2 = Math.abs(nums[r]);
            if(s1 >= s2){
                int a1 = s1*s1;
                res[k] = a1;
                l++;
            }else{
                int a2 = s2*s2;
                res[k] = a2;
                r--;
            }
            k--;
        }
        return res;
    }
}