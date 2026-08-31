class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm  = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c, 1);
            }else{
                int v = hm.get(c);
                hm.put(c, v + 1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(hm.containsKey(c) && hm.get(c) == 1){
                return i;
            }
        }
        return -1;
    }
}