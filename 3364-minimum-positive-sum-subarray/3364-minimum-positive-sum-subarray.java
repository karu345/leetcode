class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;

        for(int s = 0; s < nums.size(); s++) {
            int sum = 0;

            for(int e = s; e < nums.size() && e - s + 1 <= r; e++) {
                sum += nums.get(e);

                int len = e - s + 1;

                if(len >= l && sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}