class Solution {
    public String interpret(String command) {
        String ans = "";
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                ans+='G';
            }else if(i < command.length()-3 || i < command.length()-1){
                if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                    ans+='o';
                    i++;
                }else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                    ans+='a';
                    ans+='l';
                    i+=3;
                }
            }
        }
        return ans;
    }
}