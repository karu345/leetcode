class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int f = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                if (ans != 0) {
                    f = ans;
                }
                ans = 0;
            } else {
                ans++;
            }
        }
        if (ans != 0) {
            f = ans;
        }
        return f;
    }
}