class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char curr = text.charAt(i);
            if (!hm.containsKey(curr)) {
                hm.put(curr, 1);
            } else {
                hm.put(curr, hm.get(curr) + 1);
            }
        }
        String s = "balloon";
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (hm.containsKey(curr)) {
                if (curr == 'o' || curr == 'l') {
                    int t = hm.get(curr);
                    n = Math.min(n, (t / 2));
                } else {
                    int t = hm.get(curr);
                    n = Math.min(n, t);
                }
            }else{
                return 0;
            }
        }
        return n;
    }
}