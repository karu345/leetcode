class Solution {
    public boolean halvesAreAlike(String s) {
        int c1 = 0;
        int c2 = 0;
        int i = 0;
        for(; i < s.length()/2; i++){
            char curr = s.charAt(i);
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u' || curr == 'A' || curr == 'E' || curr == 'I' || curr == 'O' || curr == 'U'){
                c1++;
            }
        }
        for(; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u' || curr == 'A' || curr == 'E' || curr == 'I' || curr == 'O' || curr == 'U'){
                c2++;
            }
        }
        if(c1 == c2){
            return true;
        }
        return false;
    }
}