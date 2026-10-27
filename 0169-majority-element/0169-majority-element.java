class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], 1);
            }else{
                if((hm.get(nums[i])+1) > n/2){
                    return nums[i];
                }
                hm.put(nums[i], hm.get(nums[i])+1);
            }
        }
        return nums[0];
    }
}