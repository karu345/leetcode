class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int sl = s.length();
        int pl = p.length();
        if(pl > sl){
            return ans;
        }
        for(int i = 0; i < pl; i++){
            char curr = p.charAt(i);
            if(!hm.containsKey(curr)){
                hm.put(curr, 1);
            }else{
                hm.put(curr, hm.get(curr)+1);
            }
        }
        int l = 0;
        int r = pl;
        for(int i = 0; i < pl; i++){
            char curr = s.charAt(i);
            if(!hm2.containsKey(curr)){
                hm2.put(curr, 1);
            }else{
                hm2.put(curr, hm2.get(curr)+1);
            }
        }
        if(hm2.equals(hm)){
            ans.add(0);
        }
        while(r < sl){
            char add = s.charAt(r);
            char del = s.charAt(l);
            if(!hm2.containsKey(add)){
                hm2.put(add, 1);
            }else{
                hm2.put(add, hm2.get(add)+1);
            }
            if(hm2.get(del) == 1){
                hm2.remove(del);
            }else{
                hm2.put(del, hm2.get(del)-1);
            }
            l++;
            r++;
            if(hm2.equals(hm)){
                ans.add(l);
            }
        }
        return ans;
    }
}