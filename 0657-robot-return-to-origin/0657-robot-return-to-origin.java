class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0;
        int l = 0;
        int u = 0;
        int d = 0;
        for(int i = 0; i < moves.length(); i++){
            char curr = moves.charAt(i);
            if(curr == 'R'){
                r++;
            }else if(curr == 'L'){
                l++;
            }else if(curr == 'U'){
                u++;
            }else{
                d++;
            }
        }
        if(r == l && u == d){
            return true;
        }
        return false;
    }
}