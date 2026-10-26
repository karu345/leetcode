class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int op = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                while(hm.containsKey(nums[i])){
                    int curr = hm.get(nums[i]);
                    if(curr == 1){
                        return -1;
                    }else if(curr % 3 == 0 || curr == 3){
                        if(curr == 3){
                            hm.remove(nums[i]);
                        }else{
                            hm.put(nums[i], hm.get(nums[i]) - 3);
                        }
                        op++;
                    }else{
                        if(curr == 2){
                            hm.remove(nums[i]);
                        }else{
                            hm.put(nums[i], hm.get(nums[i]) - 2);
                        }
                        op++;
                    }
                }
            }
        }
        if (hm.isEmpty()) {
            return op;
        }
        return -1;
    }
}