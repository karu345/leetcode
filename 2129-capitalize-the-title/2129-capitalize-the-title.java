class Solution {
    public String capitalizeTitle(String title) {
        String ans = "";
        int c = 0;
        for(int i = 0; i < title.length(); i++){
            if(!Character.isLetter(title.charAt(i))){
                c++;
            }
        }
        String arr[] = new String[c+1];
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(j < title.length()){
            char curr = title.charAt(j);
            if(j < title.length()-1 && !Character.isLetter(title.charAt(j+1))){
                sb.append(curr);
                arr[i] = sb.toString();
                sb = new StringBuilder();
                i++;
                j+=2;
            }else{
                sb.append(curr);
                j++;
            }
        }
        arr[i] = sb.toString();
        for(i = 0; i < arr.length; i++){
            arr[i] = arr[i].toLowerCase();
            if(arr[i].length() > 2){
                arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
            }
            ans += arr[i];
            if(i != arr.length-1){
                ans += " ";
            }
        }
        return ans;
    }
}