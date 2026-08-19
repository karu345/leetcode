class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int st = image[sr][sc];
        dfs(image, sr, sc, color, st);
        return image;
    }
    public static void dfs(int[][] image, int sr, int sc, int color, int st){
        if(sr < 0 || sr > image.length-1 || sc < 0 || sc > image[0].length-1){
            return;
        }
        if(image[sr][sc] != st){
            return;
        }
        if(image[sr][sc] == color){
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr, sc-1, color, st);
        dfs(image, sr, sc+1, color, st);
        dfs(image, sr-1, sc, color, st);
        dfs(image, sr+1, sc, color, st);
    }
}