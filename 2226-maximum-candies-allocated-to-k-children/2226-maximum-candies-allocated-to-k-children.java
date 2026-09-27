class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        int s = 1;
        int e = max;
        int ans = 0;
        while(s <= e){
            int mid = s+(e-s)/2;
            long count = 0;
            for(int i = 0; i < candies.length; i++){
                int curr = candies[i] / mid;
                count += curr; 
            }
            if(count >= k){
                ans = Math.max(mid, ans);
            }
            if(count < k){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
}