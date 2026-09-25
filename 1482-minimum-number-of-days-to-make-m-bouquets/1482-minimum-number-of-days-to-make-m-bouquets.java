class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (m*k)){
            return -1;
        }
        int max = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(max < bloomDay[i]){
                max = bloomDay[i];
            }
        }
        int s = 0;
        int e = max;
        int days = Integer.MAX_VALUE;;
        while(s <= e){
            int mid = s+(e-s)/2;
            int con = 0;
            int bouq = 0;
            for(int i = 0; i < bloomDay.length; i++){
                if(bloomDay[i] <= mid){
                    if(k > 1 && con != k){
                        con++;
                        if(con == k){
                            con = 0;
                            bouq++;
                        }
                    }else if(k == 1){
                        bouq++;
                    }
                }else{
                    con = 0;
                }
            }
            if(bouq >= m){
                days = Math.min(mid, days);
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        if(days != Integer.MAX_VALUE){
            return days;
        }
        return -1;
    }
}