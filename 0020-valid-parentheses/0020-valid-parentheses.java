class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                stack.push(curr);
            }else if(curr == ')' || curr == '}' || curr == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char check = stack.peek();
                if((check == '(' && curr == ')') || (check == '{' && curr == '}') || (check == '[' && curr == ']')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}