class Solution {
    public int missingMultiple(int[] nums, int k) {
        int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], i);
        }
        for(int i = 0; i <= nums.length; i++){
            int ans = (i+1)*k;
            if(!hm.containsKey(ans)){
                res = ans;
                break;
            }
        }
        return res;
    }
}