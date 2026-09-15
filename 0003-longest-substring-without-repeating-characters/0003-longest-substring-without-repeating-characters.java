class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int r = 0;
        int l = 0;
        int ans = 0;
        while(r < s.length()){
            char curr = s.charAt(r);
            if(!hm.containsKey(curr)){
                hm.put(curr, 1);
            }else{
                hm.put(curr, hm.get(curr) + 1);
            }
            if(hm.get(curr) > 1){
                while(hm.get(curr) > 1){
                    char del = s.charAt(l);
                    if(hm.get(del) > 1){
                        hm.put(del, hm.get(del)-1);
                    }else{
                        hm.remove(del);
                    }
                    l++;
                }
            }
            r++;
            ans = Math.max(ans, hm.size());
        }
        return ans;
    }
}