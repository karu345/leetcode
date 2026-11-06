class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
        String a1 = str1;
        String a2 = str2;
        String ans;
        for(int i = 0; i < str2.length(); i++){
            a1+=str2.charAt(i);
        }
        for(int i = 0; i < str1.length(); i++){
            a2+=str1.charAt(i);
        }
        if(a1.equals(a2)){
            int len = gcd(str1.length(), str2.length());
            ans = str1.substring(0, len);
        }else{
            return "";
        }
        return ans;
    }
}