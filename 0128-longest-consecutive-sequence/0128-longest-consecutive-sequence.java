class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hm.add(nums[i]);
        }
        int max = 0;
        int len = 0;
        for(int x : hm){
            if(!hm.contains(x-1)){
                int curr = x;
                while(hm.contains(curr)){
                    len++;
                    curr++;
                }
                max = Math.max(len, max);
                len = 0;
            }
        }
        return max;
    }
}