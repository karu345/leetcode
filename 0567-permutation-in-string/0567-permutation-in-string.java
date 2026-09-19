class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1l = s1.length();
        int s2l = s2.length();
        if(s1l > s2l){
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < s1l; i++) {
            char curr = s1.charAt(i);
            if (!hm.containsKey(curr)) {
                hm.put(curr, 1);
            } else {
                hm.put(curr, hm.get(curr) + 1);
            }
        }
        int l = 0;
        int r = s1l;
        for (int i = 0; i < s1l; i++) {
            char curr = s2.charAt(i);
            if (!hm2.containsKey(curr)) {
                hm2.put(curr, 1);
            } else {
                hm2.put(curr, hm2.get(curr) + 1);
            }
        }
        if (hm2.equals(hm)) {
            return true;
        }
        while(r < s2l) {
            char del = s2.charAt(l);
            char curr = s2.charAt(r);
            if (!hm2.containsKey(curr)) {
                hm2.put(curr, 1);
            } else {
                hm2.put(curr, hm2.get(curr) + 1);
            }
            if (hm2.containsKey(del)) {
                if (hm2.get(del) == 1) {
                    hm2.remove(del);
                } else {
                    hm2.put(del, hm2.get(del) - 1);
                }
            }
            if (hm2.equals(hm)) {
                return true;
            }
            l++;
            r++;
        }
        return false;
    }
}