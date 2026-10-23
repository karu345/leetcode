class Solution {
    public String maximumTime(String time) {
        String ans = "";
        char a = time.charAt(0);
        char b = time.charAt(1);
        char c = time.charAt(3);
        char d = time.charAt(4);
        if(a == '?'){
            int curr = (int)(b-'0');
            if(b != '?' && curr > 3){
                ans += "1";
            }else{
                ans += "2";
            }
        }else{
            ans += a;
        }
        if(b == '?'){
            int curr = (int)(a-'0');
            if(a == '?' || curr == 2){
                ans += "3";
            }else{
                ans += "9";
            }
        }else{
            ans += b;
        }
        ans += ":";
        if(c == '?'){
            ans += "5";
        }else{
            ans += c;
        }
        if(d == '?'){
            ans += "9";
        }else{
            ans += d;
        }
        return ans;
    }
}