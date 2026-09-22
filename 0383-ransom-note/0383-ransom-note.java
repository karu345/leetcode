class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char curr = magazine.charAt(i);
            if(!hm.containsKey(curr)){
                hm.put(curr, 1);
            }else{
                hm.put(curr, hm.get(curr)+1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char curr = ransomNote.charAt(i);
            if(!hm.containsKey(curr)){
                return false;
            }else if(hm.get(curr) == 1){
                hm.remove(curr);
            }else{
                hm.put(curr, hm.get(curr)-1);
            }
        }
        return true;
    }
}