class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        String curr = "";
        if(m == 1){
            for(int i = 0; i < n; i++){
                curr+='.';
            }
            ans[0] = curr;
            return ans;
        }
        if(n == 1){
            for(int i = 0; i < m; i++){
                ans[i] = ".";
            }
            return ans;
        }

        for (int i = 0; i < m; i++) {
            String row = "";
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j == 0) || j == 1 || (i == m-1 && j >= 1)) {
                    row+='.';
                } else {
                    row+='#';
                }
            }

            ans[i] = row;
        }

        return ans;
    }
}