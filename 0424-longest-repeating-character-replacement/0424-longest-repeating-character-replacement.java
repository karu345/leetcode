class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int ans = 0;
        int c = 0;
        int max = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while(r < s.length()){
            char curr = s.charAt(r);
            if(!hm.containsKey(curr)){
                hm.put(curr, 1);
            }else{
                hm.put(curr, hm.get(curr)+1);
            }
            c = (r - l)+1;
            max = Math.max(max, hm.get(curr));
            int replace = c - max;
            if(replace > k){
                while(replace > k && l < r){
                    char del = s.charAt(l);
                    if(hm.get(del) > 1){
                        hm.put(del, hm.get(del)-1);
                    }else{
                        hm.remove(del);
                    }
                    l++;
                    c = (r - l)+1;
                    replace = c - max;
                }
            }
            r++;
            ans = Math.max(ans, c);
        }
        return ans;
    }
}