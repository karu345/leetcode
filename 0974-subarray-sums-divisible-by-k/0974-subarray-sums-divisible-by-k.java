class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int pre[] = new int[nums.length];
        pre[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int total = 0;
        for(int i = 0; i < pre.length; i++){
            int prev = ((pre[i] % k)+k)%k;
            if(pre[i] % k == 0){
                total++;
            }
            if(hm.containsKey(prev)){
                total += hm.get(prev);
            }
            if(!hm.containsKey(prev)){
                hm.put(prev, 1);
            }else{
                hm.put(prev, hm.get(prev)+1);
            }
        }
        return total;
    }
}