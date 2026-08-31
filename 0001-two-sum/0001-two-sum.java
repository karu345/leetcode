class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], i);
        }
        for(int j = 0; j < nums.length; j++){
            int curr = nums[j];
            int t = target - curr;
            if(hm.containsKey(t)){
                int k = hm.get(t);
                if(k != j){
                    return new int[]{j, k};
                }
            }
        }
        return new int[]{-1, -1};
    }
}