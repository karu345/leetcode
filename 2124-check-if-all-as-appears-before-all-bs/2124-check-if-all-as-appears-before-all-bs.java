class Solution {
    public boolean checkString(String s) {
        boolean a = false;
        boolean b = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' && b == false){
                a = true;
            }else if(s.charAt(i) == 'b'){
                b = true;
            }else{
                return false;
            }
        }
        return true;
    }
}