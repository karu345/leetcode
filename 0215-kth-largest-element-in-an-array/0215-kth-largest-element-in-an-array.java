class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            pq.add(curr);
        }
        int count = 0;
        while(n - k != count){
            pq.remove();
            count++;
        }
        int ans = pq.peek();
        return ans;
    }
}