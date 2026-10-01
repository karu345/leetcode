class Solution {
    static class Answer implements Comparable<Answer> {
        int num;
        int i;

        Answer(int num, int i){
            this.num = num;
            this.i = i;
        }

        @Override
        public int compareTo(Answer a2){
            return a2.i - this.i;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Answer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> hm  = new HashMap<>();
        int sol[] = new int[k];
        for(int i = 0; i < nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], 1);
            }else{
                hm.put(nums[i], hm.get(nums[i])+1);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                int val = hm.get(nums[i]);
                pq.add(new Answer(nums[i], val));
                hm.remove(nums[i]);
            }
        }
        int c = 0;
        while(c != k){
            Answer ans = pq.peek();
            int a = ans.num;
            sol[c] = a;
            pq.remove();
            c++;
        }
        return sol;
    }
}