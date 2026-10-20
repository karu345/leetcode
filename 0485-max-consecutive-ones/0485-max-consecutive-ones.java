class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int currC = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currC++;
            }else{
                c = Math.max(currC, c);
                currC = 0;
            }
        }
        c = Math.max(currC, c);
        return c;
    }
}