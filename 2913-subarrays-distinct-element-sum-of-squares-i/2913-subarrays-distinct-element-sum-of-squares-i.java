class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.size(); i++){
            hs.add(nums.get(i));
            ans += hs.size() * hs.size();
            for(int j = i+1; j < nums.size(); j++){
                hs.add(nums.get(j));
                ans += hs.size() * hs.size();
            }
            hs.clear();
        }
        return ans;
    }
}