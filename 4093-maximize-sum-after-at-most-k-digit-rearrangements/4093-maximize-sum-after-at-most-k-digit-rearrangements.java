class Solution {
    static class Answer implements Comparable<Answer> {
        int i;
        int gap;

        Answer(int i, int gap){
            this.i = i;
            this.gap = gap;
        }

        @Override
        public int compareTo(Answer a2){
            return a2.gap - this.gap;
        }
    }
    public long maximizeSum(int[] nums, int k) {
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            char[] sorting = new char[sb.length()];
            for(int j = 0; j < sb.length(); j++){
                sorting[j] = sb.charAt(j);
            }
            Arrays.sort(sorting);
            String s = "";
            for(int j = sorting.length-1; j >= 0; j--){
                s += sorting[j];
            }
            arr[i] = Integer.parseInt(s);
        }
        PriorityQueue<Answer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            int g = arr[i] - nums[i];
            pq.add(new Answer(i, g));
        }
        while(k > 0 && nums.length >= k){
            Answer a = pq.remove();
            if(arr[a.i] > nums[a.i]){
                nums[a.i] = arr[a.i];
            }
            k--;
        }
        long ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += nums[i];
        }
        return ans;
    }
}