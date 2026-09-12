class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int l = 0;
        int r = 0;
        int ans = 0;
        while(r < fruits.length){
            int curr = fruits[r];
            if(!hm.containsKey(curr)){
                hm.put(curr, 1);
            }else{
                hm.put(curr, hm.get(curr)+1);
            }
            while(hm.size() > 2 && l < r){
                int n = fruits[l];
                if(hm.get(n) == 1){
                    hm.remove(n);
                }else{
                    hm.put(n, hm.get(n)-1);
                }
                l++;
            }
            int currAns = (r-l)+1;
            ans = Math.max(ans, currAns);
            r++;
        }
        return ans;
    }
}