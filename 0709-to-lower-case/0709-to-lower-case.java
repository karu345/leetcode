class Solution {
    public String toLowerCase(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            curr = Character.toLowerCase(curr);
            ans+=curr;
        }
        return ans;
    }
}