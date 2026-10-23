class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int l = 0;
        int r = s.length()-1;
        while(l <= r){
            if((int)(s.charAt(l)-'0') == (int)(s.charAt(r)-'0')){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}