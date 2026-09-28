class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
            max = Math.max(max, weights[i]);
        }
        int s = max;
        int e = sum;
        int ans = Integer.MAX_VALUE;
        while(s <= e){
            int mid = s+(e-s)/2;
            int c = 0;
            int dayC = 1;
            for(int i = 0; i < weights.length; i++){
                if(c+weights[i] <= mid){
                    c+=weights[i];
                }else if(dayC <= days && c+weights[i] > mid){
                    dayC++;
                    c = weights[i];
                }
            }
            if(dayC <= days){
                ans = Math.min(ans, mid);
            }
            if(dayC > days){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return ans;
    }
}