class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        int s = 1;
        int e = max;
        int ans = Integer.MAX_VALUE;
        while(s <= e){
            int mid = s+(e-s)/2;
            double hr = 0;
            for(int i = 0; i < piles.length; i++){
                double currB = Math.ceil((double) piles[i]/mid);
                hr = hr + currB;
            }
            if(hr <= h && mid < ans){
                ans = mid;
            }
            if(hr > h){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
}