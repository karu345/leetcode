class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < stones.length(); i++){
            char curr = stones.charAt(i);
            if(!hm.containsKey(curr)){
                hm.put(stones.charAt(i), 1);
            }else{
                hm.put(curr, hm.get(curr) + 1);
            }
        }
        int count = 0;
        for(int i = 0; i < jewels.length(); i++){
            char curr = jewels.charAt(i);
            if(hm.containsKey(curr)){
                count+=hm.get(curr);
                hm.remove(curr);
            }
        }
        return count;
    }
}