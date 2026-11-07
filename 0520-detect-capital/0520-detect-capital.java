class Solution {
    public boolean detectCapitalUse(String word) {
        for(int i = 1; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                if(Character.isLowerCase(word.charAt(i-1))){
                    return false;
                }
            }
            if(i != 1 && Character.isLowerCase(word.charAt(i))){
                if(Character.isUpperCase(word.charAt(i-1))){
                    return false;
                }
            }
        }
        return true;
    }
}