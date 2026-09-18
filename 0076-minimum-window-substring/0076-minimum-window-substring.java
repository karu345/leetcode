class Solution {
    public String minWindow(String s, String t) {
        int l = 0;
        int c = 0;
        int r = 0;
        String ans = "";
        int st = 0;
        int size = Integer.MAX_VALUE;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char curr = t.charAt(i);
            if (!hm1.containsKey(curr)) {
                hm1.put(curr, 1);
            } else {
                hm1.put(curr, hm1.get(curr) + 1);
            }
        }
        HashMap<Character, Integer> hm2 = new HashMap<>();
        while (r < s.length()) {
            char curr = s.charAt(r);
            if (!hm2.containsKey(curr)) {
                hm2.put(curr, 1);
            } else {
                hm2.put(curr, hm2.get(curr) + 1);
            }
            if (hm1.containsKey(curr)) {
                if (hm2.get(curr).equals(hm1.get(curr))) {
                    c++;
                }
            }
            if (c == hm1.size()) {
                while (c == hm1.size()) {
                    char del = s.charAt(l);
                    int currSize = (r - l) + 1;
                    if (currSize < size) {
                        size = currSize;
                        st = l;
                    }
                    if (!hm1.containsKey(del)) {
                        if (hm2.get(del) == 1) {
                            hm2.remove(del);
                        } else {
                            hm2.put(del, hm2.get(del) - 1);
                        }
                    } else if (hm1.containsKey(del) && hm2.get(del) > hm1.get(del)) {
                        hm2.put(del, hm2.get(del) - 1);
                    } else {
                        if (hm2.get(del) == 1) {
                            hm2.remove(del);
                        } else {
                            hm2.put(del, hm2.get(del) - 1);
                        }
                        c--;
                    }
                    l++;
                }
            }
            r++;
        }
        if (size != Integer.MAX_VALUE) {
            for (int i = st; i < size + st; i++) {
                char add = s.charAt(i);
                ans += add;
            }
        }
        return ans;
    }
}