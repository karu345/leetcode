class Solution {
    public String sortSentence(String s) {
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                l++;
            }
        }
        String arr[] = new String[l + 1];
        int k = 0;
        int j = 0;
        String add = "";
        for (; j < s.length() - 1; j++) {
            if (Character.isWhitespace(s.charAt(j + 1)) || j + 1 == s.length() - 1) {
                if (j + 1 == s.length() - 1) {
                    k = s.charAt(j + 1) - '0';
                    if (!Character.isWhitespace(s.charAt(j))) {
                        add += s.charAt(j);
                    }
                    arr[k - 1] = add;
                } else {
                    k = s.charAt(j) - '0';
                    arr[k - 1] = add;
                }
                add = "";
            } else {
                if (!Character.isWhitespace(s.charAt(j))) {
                    add += s.charAt(j);
                }
            }
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
            if (i < arr.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
}