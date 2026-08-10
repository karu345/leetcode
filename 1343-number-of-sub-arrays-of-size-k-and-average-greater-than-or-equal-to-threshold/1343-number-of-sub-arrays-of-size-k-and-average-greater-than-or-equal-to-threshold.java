class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        int l = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum / k >= threshold) {
            count++;
        }
        int r = k;
        for (int i = k; i < arr.length; i++) {
            sum = (sum - arr[l]) + arr[r];
            l++;
            r++;
            if (sum / k >= threshold) {
                count++;
            }
        }
        return count;
    }
}