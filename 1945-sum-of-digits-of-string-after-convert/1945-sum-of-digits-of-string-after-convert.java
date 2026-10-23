class Solution {
    public int getLucky(String s, int k) {
        String n = "";
        for(int i = 0; i < s.length(); i++){
            n += (s.charAt(i)-'a'+1);
        }
        int ans = 0;
        for(int i = 0; i < n.length(); i++){
            ans += (int)(n.charAt(i)-'0');
        }
        k--;
        while(k > 0){
            String str = Integer.toString(ans);
            ans = 0;
            for(int i = 0; i < str.length(); i++){
                ans += (int)(str.charAt(i)-'0');
            }
            k--;
        }
        return ans;
    }
}