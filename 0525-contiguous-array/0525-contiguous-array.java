class Solution {
    public int findMaxLength(int[] nums) {
        int pre[] = new int[nums.length];
        int len = 0;
        if(nums[0] == 0){
            pre[0] = -1;
        }else{
            pre[0] = 1;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 0){
                pre[i] = pre[i-1] + (-1);
            }else{
                pre[i] = pre[i-1] + 1;
            }
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(pre[i] == 0){
                len = Math.max(len, (i-0)+1);
            }
            if(hm.containsKey(pre[i])){
                len = Math.max(len, i - (hm.get(pre[i])));
            }else{
                hm.put(pre[i], i);
            }
        }
        return len; 
    }
}