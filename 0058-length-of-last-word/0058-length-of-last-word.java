class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        int f = 0;
        // ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                if (ans != 0) {
                    // al.add(ans);
                    f = ans;
                }
                ans = 0;
            } else {
                ans++;
            }
        }
        if (ans != 0) {
            // al.add(ans);
            f = ans;
        }
        // ans = 0;
        // int j = 0;
        // while (j != al.size()) {
        //     ans = al.get(j);
        //     j++;
        // }
        return f;
    }
}