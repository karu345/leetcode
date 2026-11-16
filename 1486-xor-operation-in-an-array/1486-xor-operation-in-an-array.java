class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        arr[0] = start;
        int ans = start;
        for(int i = 1; i < n; i++){
            arr[i] = start + 2 * i;
            ans = ans ^ arr[i];
        }
        return ans;
    }
}