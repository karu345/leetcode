class Solution {
    public int hIndex(int[] citations) {
        int s = 0;
        int e = citations.length-1;
        int h = 0;
        while(s <= e){
            int mid = s+(e-s)/2;
            int curr = citations.length - mid;
            if(citations[mid] >= curr){
                h = Math.max(h, curr);
            }
            if(curr < citations[mid]){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return h;
    }
}