class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int l1 = 0;
        int l2 = 0;
        while(l1 < word1.length() && l2 < word2.length()){
            ans += word1.charAt(l1);
            ans += word2.charAt(l2);
            l1++;
            l2++;
        }
        while(l1 < word1.length()){
            ans += word1.charAt(l1);
            l1++;
        }
        while(l2 < word2.length()){
            ans += word2.charAt(l2);
            l2++;
        }
        return ans;
    }
}