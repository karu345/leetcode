class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int total = 0;
        for(int i = 0; i < prefix.length; i++){
            int prev = prefix[i] - goal; 
            if(prefix[i] == goal){
                total++;
            }
            if(hm.containsKey(prev)){
                total = total + hm.get(prev);
            }
            if(!hm.containsKey(prefix[i])){
                hm.put(prefix[i], 1);
            }else{
                hm.put(prefix[i], hm.get(prefix[i])+1);
            }
        }
        return total;
    }
}