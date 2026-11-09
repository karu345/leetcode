class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int space = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isWhitespace(s.charAt(i))){
                space++;
            }
        }
        String[] arr = new String[space+1];
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isWhitespace(s.charAt(i))){
                arr[k] = sb.toString();
                sb = new StringBuilder();
                k++;
            }else{
                sb.append(s.charAt(i));
            }
        }
        arr[k] = sb.toString();
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i].length()-1; j >= 0; j--){
                ans += arr[i].charAt(j);
            }
            if(i != arr.length-1){
                ans += " ";
            }
        }
        return ans;
    }
}